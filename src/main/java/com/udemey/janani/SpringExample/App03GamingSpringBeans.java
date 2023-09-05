package com.udemey.janani.SpringExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemey.janani.SpringExample.game.GameRunner;
import com.udemey.janani.SpringExample.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context=new
				AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();

		}
		
	}

}
