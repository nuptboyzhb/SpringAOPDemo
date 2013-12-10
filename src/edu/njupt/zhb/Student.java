/*
 * $filename: Student.java,v $
 * $Date: 2013-12-10  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb;
/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-12-10  Nanjing,njupt,China
 */
public class Student {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printThrowException(){
		System.out.println("Exception in Student.class...");
		throw new IllegalArgumentException("Exception from Student...");
	}
	public void print(String say){
		System.out.println("Say:"+say+",Name = "+name);
	}
}
