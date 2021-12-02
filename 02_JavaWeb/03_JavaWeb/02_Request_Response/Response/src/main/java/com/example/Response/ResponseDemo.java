package com.example.Response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ResponseDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("加载成功！");

        int width = 200;
        int height = 35;

        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();//画笔就一根

        g.setColor(Color.BLUE);//设置颜色

        g.drawRect(1,1,width,height);//画边框

        g.setColor(Color.GRAY);//设置颜色

        g.fillRect(1,1,width-2,height-2);//填充矩形

        g.setColor(Color.WHITE);//设置颜色

        Random r = new Random();//拿随机数对象

        //画干扰线 10条
        for (int i = 0; i < 10; i++) {
            g.drawLine(r.nextInt(width),r.nextInt(height),r.nextInt(width),r.nextInt(height));
        }

        g.setColor(Color.RED);

        Font font = new Font("宋体",Font.BOLD,30);
        g.setFont(font);

        int x = 35;
        for (int i = 0; i < 4; i++) {
            g.drawString(String.valueOf(r.nextInt(10)),x,25);
            x += 35;
        }

        ImageIO.write(image,"jpg",resp.getOutputStream());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
