package com.imooc.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/cookies/login")
public class ImoocLoginServlet extends HttpServlet {


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

        // System.out.println("用户的登陆成功");
        String name = "tt";
        String nameValue = "kk";

        name = req.getParameter("name");
        nameValue = req.getParameter("nameValue");

        PrintWriter out = resp.getWriter();
        String html = "<h1 style='color:red'>hi," + name + "!</h1><hr/>";
        out.println(html);  //将html发回浏览器
        String html1 = "<h1 style='color:red'>hi," + nameValue + "!</h1><hr/>";
        out.println(html1);  //将html发回浏览器


//        Cookie cookie = new Cookie("user", "nameValue");
        Cookie cookie = new Cookie(name, nameValue);
        resp.addCookie(cookie);
//        cookie.setMaxAge(7);   //设置cookie有效期
//        resp.getWriter().println("login success");

        Cookie[] cs = req.getCookies();
        String usr = null;
        for (Cookie c : cs) {
            System.out.println(c.getName() + ":" + c.getValue());
            if (c.getName().equals("usr")) {
                usr = c.getName();
                break;
            }

        }
        if (usr == null)
            resp.getWriter().println("usr not login");
        else
            resp.getWriter().println("usr login");
    }
}