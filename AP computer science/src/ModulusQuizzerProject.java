import java.util.Scanner;
public class ModulusQuizzerProject
	{

		public static void main(String[] args) {
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello! How many questions would you like?");				
		int ques = userInput.nextInt();
		int answerCount = 0;
		for (int i=0; i<ques; i++ ){
			int x = ((int)(Math.random()*10)+11);
			int y = ((int)(Math.random()*10)+1);
			int answer;
			if (i==0)
				{
					System.out.println(x + "%" + x + "= ");
					answer = userInput.nextInt();
					if (answer == x%x)
						{
							System.out.println("Correct!");
							answerCount++;
						}
					else
						{
							System.out.println("Incorrect");
						}
				}
			else if(i==1)
				{
					System.out.println(y + "%" + x + "=" );
					answer = userInput.nextInt();
					if (answer == y%x)
						{
							System.out.println("Correct!");
							answerCount++;
						}
					else
						{
							System.out.println("Incorrect");
							answerCount++;
						}
				}
			else
				{ 
					System.out.println(x + "%" + y + "=");
					answer = userInput.nextInt();					
					if (answer == x%y)
						{
							System.out.println ("Correct!");
							answerCount++;
						}
					else 
						{
							System.out.println ("Incorrect");
						}
				}
		}
		System.out.println("You got " +answerCount+ " correct.");
	}
}
	}