import java.util.Scanner;

public class ModulusQuizzerPro
	{
		static int ran = (int) (Math.random() * 10) + 1;
		static int ran1 = (int) (Math.random() * 10) + 1;
		
		public static void main(String[] args)
			{
			System.out.println("How many questions would you like?");
			Scanner userInput = new Scanner(System.in);
			int ques = userInput.nextInt();
			
			for (int i = 0; i < ques - 1; i++)
				{
					
				System.out.println("What is " + ran + " % " + ran1);
				int answer = userInput.nextInt();
				
				
				
				if (answer == ran % ran1)
					{
						System.out.println("You are correct!");
					}
				
				else if (answer == ran)
					{
						System.out.println("You are correct!");
					}
				else
					{
						System.out.println("You are incorrect.");
					}
				
				ran = (int) (Math.random() * 10) + 1;
				ran1 = (int) (Math.random() * 10) + 1;
				}
			
			System.out.println("What is " + ran + " % " + ran);
			int answer = userInput.nextInt(); 
			
			if (answer == ran % ran)
				{
					System.out.println("You are correct!");
				}
			
			else if (answer == ran)
				{
					System.out.println("You are correct!");
				}
			else
				{
					System.out.println("You are incorrect.");
				}
			
			
			}

	}
