package com.wang.Listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PanelTest {
    public static void main(String[] args) {
        Frame frame = new Frame("张三牛逼");//新建一个窗体
        Panel panel = new Panel(null);//面板
        frame.setLayout(null);//设置窗体的布局

        frame.setBounds(888,888,888,888);
        frame.setBackground(new Color(97, 203, 40));//设置背景颜色

        panel.setBounds(500,500,666,666);
        panel.setBackground(new Color(201, 46, 206));

        frame.add(panel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("关闭ing");
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("关闭ed");

            }

            public void windowIconified(WindowEvent e) {
            }

            public void windowDeiconified(WindowEvent e) {
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("激活");
            }
            public void windowDeactivated(WindowEvent e) {
                System.out.println("未激活");
            }
        });
//        //监听事件，监听关闭事件
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.out.println("关闭ing");
//                System.exit(0);
//            }
//        });
    }
}
