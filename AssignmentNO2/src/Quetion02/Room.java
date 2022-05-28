package Quetion02;

import java.util.Scanner;

public class Room {
	public int Width;
	public int Length;
	float area ;
	
	public Room(int width, int length) {
		Width = width;
		Length = length;
	}
	public float whiteWashingArea() {
	 area = Width*Length;
	 System.out.println("White Washing area is "+area);
	return area;
		
	}
	public int whiteWashingCost() {
		int WashingCost =(int) (80*area);
		System.out.println("White washing Cost :"+WashingCost);
		return WashingCost;
		
	}
	 public int flooringCost() {
		 
		 System.out.println("choice the Number :");
		 System.out.println("1 =geometric flooring");
		 System.out.println("2 =cement flooring");
		 
		 Scanner scanner = new Scanner(System.in);
		 int num = scanner.nextInt();
		 switch (num) {
		case 1: {
			int FlooringCost =(int) (area*200);
			System.out.println("Geometric Flooring Cost :"+FlooringCost);
			break;
		}
		case 2 :{
			int FlooringCost=(int )(area*100);
			System.out.println("Cement Flooring Cost"+FlooringCost);
			break;
		} 
	 }
		 return 0;
	 }
	 public static void main(String[] args) {
		Room room =new Room(10,20);
		room.whiteWashingArea();
		room.whiteWashingCost();
		room.flooringCost();
		
		
	}
}
