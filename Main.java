package com.yourname.nzmberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)  {
	  Random random = new Random();
	  Scanner scanner = new Scanner(System.in);
	  
	  int number = random.nextInt(100) + 1;
	  int guess;
	  int numberOfTries = 0;
	  
	  System.out.println("Rate eine Zahl von 1 bis 100");
	  
	  
	  for (;;) {
		  guess = scanner.nextInt();
		  numberOfTries++;
		  
		  
		  
		  
		  if (guess < number) {
			  System.out.println("Die Zahl ist größer als " + guess + ".");
		  } else if (guess > number) {
			  System.out.println("Die Zahl ist kleiner als " + guess + ".");
		  } else {
			  break;
		  }	  
	  }
	  
	  System.out.println("Korrekt! Die Zahl war " + number);
	  System.out.println("Du hast " + numberOfTries + " Versuche gebraucht!");
	  
	  scanner.close();
	  
  }
}
