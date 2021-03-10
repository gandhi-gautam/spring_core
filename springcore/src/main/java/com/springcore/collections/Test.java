package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");
		Emp e = (Emp) context.getBean("emp");
		System.out.println(e);
		System.out.println(e.getPhones().getClass().getName());
	}

}
