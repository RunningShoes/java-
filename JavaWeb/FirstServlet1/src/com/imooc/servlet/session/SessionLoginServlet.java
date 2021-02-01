package com.imooc.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;


@WebServlet("/session/login")
public class SessionLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("POST Method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("成功");
        //获取用户会话Session对象
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        session.setAttribute("name","张三");
        req.getRequestDispatcher("/session/index").forward(req,resp);

    }

}
