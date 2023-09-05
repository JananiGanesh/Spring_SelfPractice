package com.udemey.janani.SpringExample.game;

public class GameRunner {

	GamingConsole game;

	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game  ," +game);
		game.down();
		game.up();
		game.right();
		game.left();
		
	}

}
