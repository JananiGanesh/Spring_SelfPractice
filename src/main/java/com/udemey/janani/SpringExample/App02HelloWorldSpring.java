package com.udemey.janani.SpringExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

record Person(String name,int age) {};

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
	try(var context=new	
			AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
	
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("Residence"));
	System.out.println(context.getBean(Address.class));
	System.out.println(context.getBean("person1"));
	System.out.println(context.getBean("parametercall"));
	}
	}
}
