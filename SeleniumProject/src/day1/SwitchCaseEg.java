package day1;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
//		String course="selenium";
		
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		System.out.println(course);
		switch (course) 
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "LoadRunner":
			System.out.println("You are seelcted loadrunner");
			break;
			
		default:
			System.out.println("Select a proper a course");
			break;
		}

	}

}
