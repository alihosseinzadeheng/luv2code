package com.luv2code.springdemo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach theCoach1=context.getBean("myCoach1",Coach.class);
        Coach theCoach2=context.getBean("myCoach2",Coach.class);
        /*System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(theCoach1.getDailyFortune());*/
        System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach2.getDailyFortune());
        context.close();
    }
}
