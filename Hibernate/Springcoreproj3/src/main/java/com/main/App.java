package com.main;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.beans.SpringBean;
import com.main.cfg.CustomConfiguration;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CustomConfiguration.class);
        SpringBean sp= context.getBean("sb",SpringBean.class);
        sp.greet();     
    }
}
