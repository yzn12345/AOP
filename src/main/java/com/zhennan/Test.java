package com.zhennan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Calc calculator1 = (Calc) applicationContext.getBean("name1");
        calculator1.add(1,1);


    }
}
