package classpractice;
/*
* File: Task1.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab3
* Date: 10/14/2026
* 
* Description:
* Program acts as a board game turn generator. Gives
* the user one turn where they enter their name, 
* and character given through the enum type. Inputs are 
* displayed in player tag and character. Uses random 
* class to produce the values of two die. Uses math class 
* to calculate higher and lower die of two values as well 
* as calculating the movement score.
*/
import java.util.Scanner;
import java.util.Random;
public class Task1 {

	public static void main(String[] args) {
		
		//creating enum type that holds game characters
		enum GameCharacter {WARRIOR, WIZARD, EXPLORER, ROBOT, DRAGON}
		
		//creating scanner object
		Scanner scan = new Scanner(System.in);
		
		//creating random object
		Random rand = new Random();
		
		//prompting user to enter their name
		System.out.println("Enter your player name: ");
		String name = scan.nextLine();

		System.out.println("Avaliable Characters: \nWARRIOR \nWIZARD"
				+ " \nEXPLORER \nROBOT \nDRAGON");
		//prompting user to enter character
		System.out.println("\nChoose your character: ");
		String ch = scan.nextLine();
		//converting string data to enum type then making it upper case
		GameCharacter character = GameCharacter.valueOf(ch.toUpperCase());
		
		System.out.println("\n=========================================");
		System.out.println("	    BOARD GAME TURN");
		System.out.println("=========================================");

		System.out.println("\nPlayer Name		:" + name);
		//converting name to upper case
		System.out.println("Uppercase Name		:" + name.toUpperCase());
		//returning the length of the string
		System.out.println("Name Length		:" + name.length());
		
		//getting characters at specific positions in the string
		char f = name.charAt(0);
		char f1 = name.charAt(1);
		//adding characters together
		String tag = "" + f +f1;

		//getting the last two characters from the string
		String n = name.substring(name.length() -2);
		
		//creating player tag by adding strings together
		String tag1 = "" + tag + n;
		
		//converting tag to upper case
		System.out.println("Player Tag		:" + tag1.toUpperCase());
		System.out.println("Character		:" + character);
		
		//getting the ordinal position of game character in enum
		//telling program to count from 1
		int a = character.ordinal() + 1;
		System.out.println("Character Number	:" + a);
		
		//creating random integer object
		int b = rand.nextInt(10, 100);
		//combining strings
		String code = "" + a + b;
		//printing turn code
		System.out.println("Turn Code		:" + tag1.toUpperCase() + code);
		
		System.out.println("\n-----------------DICE---------------------");
		//creating our die with random integers from 1-6
		int dice = rand.nextInt(1,7);
		int dice1 = rand.nextInt(1,7);
		System.out.println("Die 1			:" + dice);
		System.out.println("Die 2			:" + dice1);
		//using math class to determine the higher value between die
		System.out.println("Higher Die		:" + Math.max(dice, dice1));
		//using math class to determine the lower value between die
		System.out.println("Lower Die		:" + Math.min(dice, dice1));
		//calculating the difference
		int diff = Math.max(dice, dice1) - Math.min(dice, dice1);
		System.out.println("Difference		:" + diff);
		//calculating total
		int total = dice + dice1;
		System.out.println("Total Roll		:" + total);
		
		System.out.println("\n-----------------MOVEMENT------------------");
		//calculating movement score by putting total to the second power
		double score = Math.pow(total, 2);
		System.out.println("Movement Score		:" + score);
		//displaying bonus by square rooting the movement score
		System.out.println("Movement Bonus		:" + Math.sqrt(score));
		System.out.println("=========================================");

		scan.close();
	}
}