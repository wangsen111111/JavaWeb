package com.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //Cookie,服务器端从客户端获取
        Cookie[] cookies=req.getCookies();
        PrintWriter out=resp.getWriter();
        //判断cookie是否存在
        if(cookies!=null){
            //如果存在
            out.write("你上一次访问的时间是:");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie=cookies[i];
                //获取Cookie的名字
                if(cookie.getName().equals("name")){
                    out.write(URLDecoder.decode(cookie.getValue(),"UTF-8"));
                }
            }
        }else {
            out.write("这是你第一次访问本站");
        }
        Cookie cookie=new Cookie("name", URLEncoder.encode("张三","utf-8"));
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
