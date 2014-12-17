package trace;
import java.util.Collections;
import java.util.*;
import java.util.Scanner; 
import java.util.ArrayList; 
public class Binary
	{
public static int numberIn; 
public static boolean yes; 
	public static void main(String[] args)
		{
		
	do{
		ArrayList myArray= new ArrayList(); 
		boolean answerYes= true; 
		do
			{
			System.out.println("Enter a number between 1 and 20 please.");
			Scanner input= new Scanner(System.in); 
			
			
			if(input.hasNextInt())
				{
				numberIn= input.nextInt(); 
				boolean intInRange= numberIn<=20&&numberIn>=1;
				boolean end= numberIn==-1; 
				while(!intInRange&&!end)
					{
					System.out.println("Enter a right number please.");
					numberIn= input.nextInt(); 
					intInRange= numberIn<=20&&numberIn>=1;
					}
				if(intInRange)
				{myArray.add(numberIn);} 
				if(end)
					{
					answerYes=false; 
					
					}

				}
			else
				{
				System.out.println("You should put in a number, try again!");
				}
						
			
			Collections.sort(myArray);
			}while(answerYes);
		for(int i=0; i<myArray.size();i++)
			{
			System.out.print(myArray.get(i)+" ");
			
			}
		System.out.println();
		//make the arrayList
		
		int targetIndex= (int)(Math.random()*myArray.size());
		int target= (int)myArray.get(targetIndex);
		
		System.out.println("Your target is "+target);
		// target 
		
		boolean finish = true; 
		int finalNumber;
		int totalQ=0;
		int correct=0; 
		int left=0;
		int right=myArray.size()-1;
		int mid= (int)((left+right)/2); 
		int midNumber= (int)myArray.get(mid);
		do
			{
			totalQ=totalQ+4; 
			Scanner keyboardL= new Scanner(System.in);
			System.out.println("What is left?");
			int leftA= keyboardL.nextInt();
			if(leftA==left)
				{
				correct++;
				System.out.println("correct!"); 
				}
			else 
			{
				System.out.println("The correct answer is "+left); 
			}
			System.out.println("What is right?"); 
			Scanner keyboardR= new Scanner(System.in);
			int rightA= keyboardR.nextInt();
			if(rightA==right)
				{
				correct++;
				System.out.println("correct!"); 
				}
			else 
			{
				System.out.println("The correct answer is "+right); 
			}
			System.out.println("What is mid?"); 
			Scanner keyboardM= new Scanner(System.in);
			int midA= keyboardM.nextInt();
			if(midA==mid)
				{
				correct++;
				System.out.println("correct!"); 
				}
			else 
			{
				System.out.println("The correct answer is "+mid); 
			}
			System.out.println("What is the number at mid?"); 
			Scanner keyboardMN= new Scanner(System.in);
			
			int midNumberA= keyboardMN.nextInt();
			if(midNumberA==midNumber)
				{
				correct++;
				System.out.println("correct!"); 
				}
			else 
			{
				System.out.println("The correct answer is "+midNumber); 
			}
			
			if(midNumber<target)
				{
				left= mid+1;
				}
			else if(midNumber>target)
				{
				right=mid-1;
				}
			else 
				{
				finish=false; 
				System.out.println("You got "+correct+" correct out of "+ totalQ); 
				}
			
			
			}while(finish); 
		System.out.println("Do you want to continue?");
		Scanner keyboard= new Scanner(System.in); 
		String answer= keyboard.nextLine();
		
		switch(answer)
		{
		case "Yes":
		case"YES":
		case "yes":
		{
			yes=true;
			break; 
		}
		case"No":
		case"no":
		case"NO":
		{
			yes=false;
			break;
		}
		}
		
		}while(yes); 
		
		
		
		}
	
	
	}
