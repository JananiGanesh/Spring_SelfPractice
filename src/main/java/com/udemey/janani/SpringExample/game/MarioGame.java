package com.udemey.janani.SpringExample.game;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("Go into hole");
	}
	public void left() {
		System.out.println("Go Back");
	}
	public void right() {
		System.out.println("Accelerate");
	}
}
