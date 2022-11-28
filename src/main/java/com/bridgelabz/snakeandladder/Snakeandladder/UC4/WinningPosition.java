package com.bridgelabz.snakeandladder.Snakeandladder.UC4;

public class WinningPosition {

	static void CheckingOption() {
		int position = 0;
		System.out.println("Player Initial Position is :" + position);

		while (position < 100) {

			int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("Dice  " + dice);
			int playoption = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("Selected player option :" + playoption);
			switch (playoption) {
			case 1:
				position += dice;
				System.out.println("Ladder");
				System.out.println("Player Position after the ladder is :" + position);
				break;

			case 2:
				position -= dice;
				System.out.println("Snake");

				if (position < 0) {
					position = 0;
					System.out.println("Player restart from zero:");
				}
				System.out.println("Player Position after the snake is :" + position);
				break;

			case 3:
				System.out.println("No Play");
				System.out.println("Player Position remains same ");
				break;

			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		CheckingOption();
	}
}
