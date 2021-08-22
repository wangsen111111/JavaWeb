package com.wang.Test;

import java.sql.*;

public class JDBCTest2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1,加载驱动
        Class.forName("com.mysql.jdbc.Driver");//固定写法，加载驱动
        //2,用户信息和url    useUnicode=true&characterEncoding=utf8&&useSSL=true
        String url ="jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&&useSSL=false";
        String username = "root";
        String password = "123456";
        //3,连接成功，数据库对象,connection代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //4.编写SQL
        String sql = "insert into jdbcstudy.users(id, NAME, PASSWORD, email, birthday) values (?,?,?,?,?);";

        //5.预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,5);//给第一个占位符？ 的值赋值为1；
        preparedStatement.setString(2,"张三");//给第二个占位符？ 的值赋值为狂神说Java；
        preparedStatement.setString(3,"123456");//给第三个占位符？ 的值赋值为123456；
        preparedStatement.setString(4,"24736743@qq.com");//给第四个占位符？ 的值赋值为1；
        preparedStatement.setDate(5,new Date(new java.util.Date().getTime()));//给第五个占位符？ 的值赋值为new Date(new java.util.Date().getTime())；

        //6.执行SQL
        int i = preparedStatement.executeUpdate();

        if (i>0){
            System.out.println("插入成功");
        }
        //6,释放连接
        preparedStatement.close();
        connection.close();
    }
}
