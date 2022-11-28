package com.bridgelabz.snakeandladder.Snakeandladder.UC2;

public class RollingDieUsingRandom {
	static void CheckingOption() {
		int position = 0;
		System.out.println("Player Initial Position is :" + position);

		int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Dice  " + dice);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		CheckingOption();
	}
}
