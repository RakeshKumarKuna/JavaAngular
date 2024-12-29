package com.main;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.beans.SpringBean;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/main/cfg/ApplicationContext.xml");
        SpringBean sp= context.getBean("sb",SpringBean.class);
        System.out.println(sp);
        sp.greet();
       
        
    }
}
