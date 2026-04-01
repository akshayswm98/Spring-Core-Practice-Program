package com.aktech.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Student;

public class StudentDataAccessMain {

    public static void main(String[] args) {
    	
        ApplicationContext context =
            new ClassPathXmlApplicationContext("com/aktech/resources/applicationContext.xml");

        
        Student s = context.getBean(Student.class);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
    }
}