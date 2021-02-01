package com.imooc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ua")
public class UserAgentServlet extends HttpServlet {

    //servlet 基础
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("POST Method");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("GET Method");
//    }
//
//    @Override
//    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
////    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String saying =req.getParameter("saying");
//        String methodName = req.getMethod();
//        PrintWriter out = res.getWriter();
//        out.println("<h1 smethod"+methodName+"!</h1><hr/>");
//        String html = "<h1 style='color:red'>hi,"+name+"!</h1><hr/>";
//
////        String html = "good servlet";
//        System.out.println("返回浏览器的内容");
//        out.println(html);  //将html发回浏览器
//
//        out.println("<h1 style='color:red'>hi,"+saying+"!</h1><hr/>");
//        out.println("<a href= 'http://www.baidu.com'>Baidu</a>");
//        out.println("<h1 smethod:"+methodName+"!</h1><hr/>");
//
//
//        String [] spec= req.getParameterValues("spec");
//        for (int i=0;i<spec.length;i++)
//            out.println("<h2>spec:"+spec[i]+"</h2>");
//
//        res.getWriter().write(html);
//    }



    //servlet+jsp进阶

    public UserAgentServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String  userAgent=req.getHeader("User-Agent");
        String output =null;
        resp.setContentType("text/html;charset=utf-8");    //ContentType决定浏览器采用何种方式对相应体进行处理
//        resp.setContentType("application/x-msdownload;charset=utf-8"); //下载文件
        resp.getWriter().println(userAgent);

        if(userAgent.indexOf("MacOs")!=-1){
            output = "<h1>这是PC端首页</h1>";
        }else if((userAgent.indexOf("iphone")!=-1) || userAgent.indexOf("Andriod")!=-1)
            output = "<h1>这是手机端首页</h1>";
        resp.getWriter().println(output);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}