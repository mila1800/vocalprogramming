import java.util.Scanner;

public class Guess_the_number_imperative {
	public static void main(String[] args) throws NumberFormatException{
	        int n = (int)(Math.random() * 10 + 1);
	        System.out.print("Guess the number between 1 and 10: ");
	        Scanner sc = new Scanner(System.in);
	        while (sc.nextInt() != n) {
	            System.out.print("Wrong! Guess again: ");
	        } System.out.println("Well guessed!");
	    }
}
