package main;

public class Menu 
{
	public static String toLetterGrade(int percentage) //Remember this requires pseudocode
	{	
		if(percentage < 0 || percentage > 100) throw new RuntimeException("Number out of bounds");
		
		if(percentage > 69) return "A";
		else if(percentage > 59) return "B";
		else if(percentage > 49) return "C";
		else if(percentage > 39) return "D";
		else return "E";
	}
	
	public static void printPowers(int lowBound, int highBound) //Remember this requires pseudocode
	{
		System.out.println("Value\tSquare\tCube\tSquare root");
		for(int i=lowBound; i<=highBound; ++i)
		{
			System.out.print(i + ".00");
			System.out.print("\t");
			System.out.print(Math.pow(i, 2));
			System.out.print("\t");
			System.out.print(Math.pow(i, 3));
			System.out.print("\t");
			System.out.print(i >= 0? Math.sqrt(i) : "N/A");
			System.out.println();
		}
	}
	
	public static void choice3()
	{
		int minimum = 0;
		int maximum = 0;
		int total = 0;
		float average = 0;
		int elementCount = 0;
		
		while(true)
		{			
			int input;
			if(Choice.scan.hasNextInt())
			{
				input = Choice.scan.nextInt();
			}
			else
			{
				System.out.println("Please input an integer number");
				continue;
			}
			
			if(input == -1) break;
			
			minimum = Math.min(minimum, input);
			maximum = Math.max(maximum, input);
			total += input;
			average = (elementCount * average + input) / (elementCount + 1);
			++elementCount;
		}
		System.out.print("Minimum=");
		System.out.println(minimum);
		System.out.print("Maximum=");
		System.out.println(maximum);
		System.out.print("total=");
		System.out.println(total);
		System.out.print("average=");
		System.out.println(average);
		System.out.println();
	}
	
	public static void exit()
	{
		System.out.println("Goodbye;");
	}
	
	public static void choice4()
	{
		int input;
		int errorCount = 0;
		while(true) //Apparently a do-while is required
		{
			if(errorCount > 3) return;
			if(Choice.scan.hasNextInt())
			{
				input = Choice.scan.nextInt();
				
				if(input < 0 || input > 100)
				{
					System.out.println("Please input a number between 0 and 100");
					++errorCount;
					continue;
				}
				else if(input == -1) return;
				else break;
			}
			else
			{
				System.out.println("please input a number");
				++errorCount;
				continue;
			}
		}
		
		System.out.print(input);
		System.out.println("=" + toLetterGrade(input));
	}
}


















