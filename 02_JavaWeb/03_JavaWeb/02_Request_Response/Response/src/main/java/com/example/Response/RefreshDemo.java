package com.example.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ResponseDemo")
public class RefreshDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "用户名和密码不匹配，2秒后转向登录页面...";
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write(str);
        //定时刷新，其实就是设置一个响应消息头
        resp.setHeader("Refresh","2;URL=/response/login.html");
        //Refresh设置的时间单位是秒，如果刷新到其他地址，需要在时间后面拼接上地址
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
