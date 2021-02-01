package com.imooc.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session/index")
public class SessionIndexServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("POST Method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String)session.getAttribute("name");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(name);
        System.out.println(session.getId());
    }

//    @Override
//    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
////    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String saying = req.getParameter("saying");
//        String methodName = req.getMethod();
//        PrintWriter out = res.getWriter();
//        out.println("<h1 smethod" + methodName + "!</h1><hr/>");
//        String html = "<h1 style='color:red'>hi," + name + "!</h1><hr/>";
//
////        String html = "good servlet";
//        System.out.println("返回浏览器的内容");
//        out.println(html);  //将html发回浏览器
//
//        out.println("<h1 style='color:red'>hi," + saying + "!</h1><hr/>");
//        out.println("<a href= 'http://www.baidu.com'>Baidu</a>");
//        out.println("<h1 smethod:" + methodName + "!</h1><hr/>");
//
//
//        String[] spec = req.getParameterValues("spec");
//        for (int i = 0; i < spec.length; i++)
//            out.println("<h2>spec:" + spec[i] + "</h2>");
//
//        res.getWriter().write(html);
//    }
}