package com.demo.RockPaperScissors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class RockPaperScissorsApplication {

	public static void main(String[] args) {SpringApplication.run(RockPaperScissorsApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String[] rps = {"r", "p", "s"};
			String computerMove = rps[new Random().nextInt(rps.length)];


			String playerMove;


			while (true) {
				System.out.println("Please enter your move (r, p or s): ");
				playerMove = scanner.nextLine();
				if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + " it's not valid move!");
			}

			System.out.println("Computer played: " + computerMove);

			if (playerMove.equals(computerMove)) {
				System.out.println("The game was tie!");
			} else if (playerMove.equals("r")) {
				if (computerMove.equals("p")) {
					System.out.println("You lose!");
				} else if (computerMove.equals("s")) {
					System.out.println("You win!");
				}
			} else if (playerMove.equals("p")) {
				if (computerMove.equals("s")) {
					System.out.println("You lose!");
				} else if (computerMove.equals("r")) {
					System.out.println("You win!");
				}
			} else if (playerMove.equals("s")) {
				if (computerMove.equals("r")) {
					System.out.println("You lose!");
				} else if (computerMove.equals("p")) {
					System.out.println("You win!");
				}
			}

			System.out.println("Play again? (y/n)");
			String playAgain = scanner.nextLine();
			if(!playAgain.equals("y")){
				break;
			}
		}
	}

}
