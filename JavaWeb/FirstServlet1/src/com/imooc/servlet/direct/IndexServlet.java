package com.imooc.servlet.direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/direct/index")
public class IndexServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = (String)req.getAttribute("usrname");   //获取请求转发中的中的属性值
        resp.getWriter().println("This is index page! usrname is "+ name);



    }

}

