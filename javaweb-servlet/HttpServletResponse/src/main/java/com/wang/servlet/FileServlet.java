package com.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    /*
    下载文件
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //○要获取下载文件的路径
        String realPath="C:\\gitcode\\maven\\maven测试\\javaweb-servlet\\HttpServletResponse\\target\\classes\\辉夜大小姐.png";
        System.out.println("下载文件的路径"+realPath);
        //○下载的文件名是啥？
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //○设置想办法让浏览器能够支持(Content-Disposition)下载我们需要的东西,中文文件名URLEncoder.encode编码，否则有可能乱码
        resp.setHeader("Content-Disposition", "attachment;filename"+ URLEncoder.encode(fileName,"UTF-8") );
        //○获取下载文件的输入流
        FileInputStream inputStream = new FileInputStream(realPath);
        //○创建缓冲区
        int len=0;
        byte[] buffer=new byte[1024];
        //○获取OutputStream对象
        ServletOutputStream outputStream = resp.getOutputStream();
        //○将FileOutputStream流写入到buffer缓冲区,使用OutputStream将缓冲区中的数据输出到客户端！
        while((len=inputStream.read(buffer))>0){
            outputStream.write(buffer,0,len);
        }
        //关闭输入输出流
        inputStream.close();
        outputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
