package Quetion02;

import java.util.Scanner;

public class PlayerTest extends Player {

	public static void main(String[] args) {
		CricketPlayer cricketPlayer = new CricketPlayer();
		VolleyBallPlayer volleyBallPlayer = new VolleyBallPlayer();

		System.out.println("select the Options :");
		System.out.println("1 = Cricket");
		System.out.println("2 = VolleyBall");
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1: {
			cricketPlayer.team();
			cricketPlayer.display();
			break;
		}
		case 2: {
			volleyBallPlayer.team();
			volleyBallPlayer.display();
			break;
		}

		}
	}
}
