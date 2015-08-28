import java.util.Scanner;

public class ExpandedNotationAssignment
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter any real number");
				int num = userInput.nextInt(); 
				
				for (int i=1; i<4; i++){
					
					num=num%10;
					
					System.out.println("Digit #"+i+";"+num);
					num=num/10;
							
				
				}

			}

	}
