package com.udemey.janani.SpringExample;

import com.udemey.janani.SpringExample.game.GameRunner;
import com.udemey.janani.SpringExample.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game= new MarioGame();
		//var game=new SuperContraGame();
		var game= new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
