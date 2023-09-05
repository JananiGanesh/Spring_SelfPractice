package com.udemey.janani.SpringExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemey.janani.SpringExample.game.GameRunner;
import com.udemey.janani.SpringExample.game.GamingConsole;
import com.udemey.janani.SpringExample.game.PacManGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game= new PacManGame();
		return game;
		
	}
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
	

}
