package com.udemey.janani.SpringExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person1(String name,int age,Address address) {};

record Address(int doorno,String streetname,String city) {};
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Janani";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	@Bean
	public Person person() {
		var person=new Person("Hritesh",6);
		return person;
	}
	
	@Bean
	public Person1 person1() {
		var person=new Person1("Hritesh",6,new Address(101,"Tilak Street","chennai"));
		return person;
	}
	@Bean
	public Person person2MethodCall() {
		var person=new Person(name(),age());
		return person;
	}
	
	@Bean(name="parametercall")
	public Person1 person3Paramwter(String name,int age,Address address) {
		var person=new Person1(name,age,address);
		return person;
	}
	
	@Bean(name ="Residence")
	public Address address() {
		return new Address(120,"Rama street","Salem");
	}
}
