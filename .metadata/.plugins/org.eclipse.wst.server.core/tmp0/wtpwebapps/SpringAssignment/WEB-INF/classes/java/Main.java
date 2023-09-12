package java;

package com.spring;

import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationCotenxt;

public class GFG {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationCotenxt("config.xml");
		Student student= (Student)context.getBean("stud");
		System.out.println(student);
	}
}

