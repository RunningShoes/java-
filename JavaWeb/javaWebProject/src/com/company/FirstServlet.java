package com.company;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet({"/FirstServlet", "/get"})
public class FirstServlet extends HttpServlet{

    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello Servlet, This Message Is From Ming";
    }

    /**
     *
     * doGet方法 响应请求
     * @param request
     * @param response
     * @throws ServletException
     * @throws
     */
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // 设置响应内容类型
//        response.setContentType("text/html");
//
//        // 实际的逻辑是在这里
//        PrintWriter out = response.getWriter();
//        out.println("<h3>" + message + "</h3>");
        response.getWriter().write("hhhhhhhhhh  hahahhah ");
    }

    public void destroy()
    {
        // 什么也不做
    }
}
