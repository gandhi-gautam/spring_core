package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		// Samosa s = (Samosa) context.getBean("s1");
		// Pepsi p = (Pepsi) context.getBean("p1");
		// System.out.println(s);
		// System.out.println(p);
		Example e = (Example) context.getBean("example");
		System.out.println(e);
	}

}
