import java.util.Scanner;

public class Guessnumber {
   public static void main(String[] args) {
      int number = (int)(Math.random() * 100 + 1);
      Scanner input = new Scanner(System.in);
      int guess = 0;
      int attempts = 0;
      int round = 1;
      int score = 0;
      
      System.out.println("Round " + round + ": Guess a number between 1 and 100");
      
      while (guess != number) {
         System.out.print("Enter your guess: ");
         guess = input.nextInt();
         attempts++;
         
         if (guess < number) {
            System.out.println("Your guess is too low.");
         } else if (guess > number) {
            System.out.println("Your guess is too high.");
         }
      }
      
      System.out.println("You got it! The number was " + number + ".");
      System.out.println("It took you " + attempts + " attempts to guess the number.");
      score = 100 - attempts;
      System.out.println("You scored " + score + " points.");
      
      input.close();
   }
}
