package myfirstproject;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome");
		
		int selection = 0;
				
		while (selection != 5) {
			
			// The menu keeps showing until option 5 is choose.  
			System.out.println("Select an opcion");
			System.out.println("1) Prints all even numbers from 0 to 100 ");
			System.out.println("2) Prints every 3rd number going backwards from 100 until we reach 0");
			System.out.println("3) A for loop that prints every other number from 1 to 100");
			System.out.println("4) Prints every number from 0 to 100, "
					+ "'Hello' divible by 3. 'World' divisble by 5. 'Hello WOrld' divible by both of them");
			System.out.println("5) Leave exersice ");
			
			selection = sc.nextInt();
			
			// Condition if number is wrong.
			if (selection > 5 ) {
				System.out.println("Wrong selection. Please enter a option 1 to 5");
			}
			else {
			
			switch (selection) { 
			case 1:
				//A while loop that prints all even numbers from 0 to 100
				int number = 0;
				while (number <= 0 || number <= 100) {
					System.out.println(number);
					number = number + 2;
					}
			break;
			
			case 2:
				//A while loop that prints every 3rd number going backwards from 100 until we reach 0
				int number2 = 100;
				while (number2 >= 100 || number2 >=0) {
					System.out.println(number2);
					number2 = number2 - 3;
				}
				System.out.println("test2");
			break;
			
			case 3:
				//A for loop that prints every other number from 1 to 100
				for (int num = 1; num <=100; num ++) {
					System.out.println(num);
					
				}
				
				break;
			
			case 4:
				//A for loop that prints every number from 0 to 100, 
				//but if the number is divisible by 3, it prints “Hello” instead of the number, 
				//and if the number is divisible by 5, it prints “World” instead of the number, 
				//and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
				for (int num = 0; num <=100; num ++){
					if (num % 3 == 0 && num % 5 == 0) {
						System.out.println("Hello World");
					}
					else {
					  if (num % 3 == 0) {
						System.out.println("Hello");
					}
					  	else if (num % 5 == 0) {
					  		System.out.println("World");
					}
					  	else {
					  		System.out.println(num);
					}
					}
				}		
				break;
				
			case 5:
				System.out.println("Thank you for coming");	
				break;
				
			default:
				}		
			} 
			
			}
	
	}

	}

	

	

	
		
		
		
			
		
		
	
	


