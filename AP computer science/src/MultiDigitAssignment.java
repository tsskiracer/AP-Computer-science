import java.util.Scanner;
public class MultiDigitAssignment
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter any real number");
				int num= userInput.nextInt();
				System.out.println(num%10);
				
				
				System.out.println("Enter any real number");
				int num2= userInput.nextInt();
				System.out.println((num2/10)%10);
					
				

			}

	}
