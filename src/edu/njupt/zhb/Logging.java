/*
 * $filename: Logging.java,v $
 * $Date: 2013-12-10  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb;

import org.aspectj.lang.JoinPoint;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-12-10  Nanjing,njupt,China
 */
public class Logging {
	
	public void beforeAdvice(JoinPoint jointPoint){
		Object methodArgs[] = jointPoint.getArgs();//获取切入点函数的参数
		for(Object arg:methodArgs){
			System.out.println("Logging:args type="+arg.getClass().getName());
			System.out.println("Logging:args value="+arg);
		}
		System.out.println("Logging:ClassName="+jointPoint.getTarget().getClass().getName());
		System.out.println("Logging:MethodName="+jointPoint.getSignature().getName());
		System.out.println("Logging:before... ");
	}
	
	public void afterAdvice(){
		System.out.println("Logging:after... ");
	}
	/**
	 * 
	 * @param retVal 函数的返回值
	 */
	public void afterReturningAdvice(Object retVal){
		if(retVal==null){
			return;
		}
		System.out.println("Logging:return :"+retVal.toString());
	}
	
	public void afterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("Logging:exception:"+ex.toString());
	}
}
