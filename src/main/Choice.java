package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Choice 
{
	public static final Scanner scan = new Scanner(System.in);
	
	public void displayMenu()
	{
		System.out.println("please select one of the options below");
		System.out.println("1. Option 1");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("0. Exit");
	}
	
	public void processUserChoices()
	{	
		displayMenu();
		
		String input = scan.nextLine();
		
		boolean shouldContinue = true;
		while(shouldContinue)
		{
			switch(input)
			{
			case "Option 1":
				try
				{
					Menu.toLetterGrade(scan.nextInt());
				}
				catch(InputMismatchException e)
				{
					System.out.println("Please input a number");
				}
				catch(RuntimeException e)
				{
					System.out.println("Please input a number between 0 and 100");
				}
				break;
			case "Option 2":
				try
				{
					System.out.println("Please input the lower bound");
					int lowBound = scan.nextInt();
					System.out.println("Please input the higher bound");
					int highBound = scan.nextInt();
					Menu.printPowers(lowBound, highBound);
				}
				catch(InputMismatchException e)
				{
					System.out.println("Please input numbers");
				}
				break;
			case "Option 3":
				Menu.choice3();
				break;
			case "exit":
				Menu.exit();
				shouldContinue = false;
				break;
			default:
				System.out.println("Invalid command");
				break;
			}
		}
		scan.close();
		
	}
}
