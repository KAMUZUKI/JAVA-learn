package com.example.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PathQuestionDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取所有的cookie
        Cookie[] cs = req.getCookies();
        //2.遍历cookie的数组
        for(int i=0;cs!=null && i<cs.length;i++){
            if("pathquestion".equals(cs[i].getName())){
                //找到了我们想要的cookie，输出cookie的值
                resp.getWriter().write(cs[i].getValue());
                return;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
