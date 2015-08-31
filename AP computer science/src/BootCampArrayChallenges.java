import java.util.Scanner;
public class BootCampArrayChallenges
	{

		public static void main(String[] args)
			{
			Scanner davisIsAJerk = new Scanner(System.in);
			Scanner userInput= new Scanner(System.in);
			System.out.println("Hello! How many favorite sweets do you have?");
			int num = userInput.nextInt();
			String myArray[]=new String [num];
			
			for(int i = 0; i<myArray.length; i++)
				{
					System.out.println("What type of sweets do you like?");
					myArray[i] = davisIsAJerk.nextLine();
				}
			for (String fred:myArray)
				{
					System.out.println(fred);
				}

			}

	}
