package edu.njupt.zhb;
/*
 * $filename: TestMain.java,v $
 * $Date: 2013-12-10  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-12-10  Nanjing,njupt,China
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Student student = (Student)context.getBean("student");
	    System.out.println("-------------");
	    student.getId();
	    System.out.println("-------------");
	    student.getName();
	    System.out.println("-------------");
	    student.print("Hi,I am a student",20);
	    System.out.println("-------------");
	    try{
	       student.printThrowException();
	    }catch (Exception e) {
			// TODO: handle exception
	    	System.out.println(e.getMessage());
		}
	    
	}

}
