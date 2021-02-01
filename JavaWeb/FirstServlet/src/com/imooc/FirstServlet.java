package com.imooc;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet({"/FirstServlet", "/get"})
public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("POST Method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("GET Method");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //String name = req.getParameter("name");
        //String html = "<h1 style='color:red'>hi,"+name+"!</h1><hr/>";
        String html = "good servlet";
//        System.out.println("返回浏览器的内容");
//        PrintWriter out = res.getWriter().;
//        out.println(html);  //将html发回浏览器
        res.getWriter().write(html);
    }
}
