package QuetionNO_04;

import java.util.Scanner;

public class Student {
	public int RollNo ;
	public String Name ;
	public long ContactNo ;
	public float TotalMarks;
	public void getdata() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Roll No :");
		 RollNo = scanner.nextInt();
		System.out.println("Enter the Name Of Student :");
		 Name = scanner.next();
		System.out.println("Enter the Contact No :");
		 ContactNo = scanner.nextLong();
		System.out.println("Enter the Total Marks :");
		 TotalMarks = scanner.nextFloat();
	}
	
	public void display() {
		System.out.println("Student Roll Nov : "+RollNo);
		System.out.println("Student Name : "+Name );
		System.out.println("Student Contact No : "+ContactNo);
		System.out.println("Student Total Marks :" +TotalMarks);
	}
}
