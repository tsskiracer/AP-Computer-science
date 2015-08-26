import java.util.Scanner;
public class Divingrightin {

	 static String name;
	 
	public static void main(String[] args) {
	
		System.out.println("Hello! What is your name?");
		Scanner userInput = new Scanner (System.in);
		String name = userInput.nextLine();
		
			System.out.println("Hello" + " " + name + ". " + "How old are you?");
		
		int age = userInput.nextInt();
		if(age<=16)
			{
			System.out.print("Driving can be fun! Your age in dog years is " + (age*7));
			}
		if(age>=18)
			{
			System.out.print("Have fun in college!. Your age in dog years is " + (age*7));
			}
		if(age==17)
			{
			System.out.print("Almost to college! Your age in dog years is " + (age*7));
			}
		System.out.println(". " + "What is your birth year?");
		int year = userInput.nextInt();
		for(int i = 0; i<age; i++)
			{
			System.out.println("In " + year++ + " , you were " + i);
				{if (i == 1){
					System.out.println (" year old");
				}
				else 
				{
					System.out.println ("years old");
				}
				}
						}
	}

}