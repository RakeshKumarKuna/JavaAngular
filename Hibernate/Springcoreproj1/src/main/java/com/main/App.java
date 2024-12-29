package com.main;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.beans.SpringBean;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/main/cfg/ApplicationContext.xml");
        SpringBean sp= context.getBean("sb",SpringBean.class);
        SpringBean sp1= context.getBean("sb",SpringBean.class);
        System.out.println(sp);
        System.out.println(sp1);
        sp.greet();
        Date dt= context.getBean("dt",Date.class);
        System.out.println(dt);
        
    }
}
