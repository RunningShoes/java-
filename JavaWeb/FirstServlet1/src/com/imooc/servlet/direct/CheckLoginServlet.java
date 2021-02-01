package com.imooc.servlet.direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String  userAgent=req.getHeader("User-Agent");
//        String output =null;
//        resp.setContentType("text/html;charset=utf-8");    //ContentType决定浏览器采用何种方式对相应体进行处理
////        resp.setContentType("application/x-msdownload;charset=utf-8"); //下载文件
//        resp.getWriter().println(userAgent);
//
//        if(userAgent.indexOf("MacOs")!=-1){
//            output = "<h1>这是PC端首页</h1>";
//        }else if((userAgent.indexOf("iphone")!=-1) || userAgent.indexOf("Andriod")!=-1)
//            output = "<h1>这是手机端首页</h1>";
//        resp.getWriter().println(output);

        System.out.println("用户的登陆成功");
        req.setAttribute("usrname","admin");
        //请求转发实现跳转
        req.getRequestDispatcher("/direct/index").forward(req,resp);//请求转发功能,从案例中的check跳转到/direct/index
        //响应重定向实现跳转，需要加上contextPAth
//        resp.sendRedirect("/FirstServlet1/direct/index");
    }

}