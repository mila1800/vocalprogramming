import java.util.Scanner;
import io.reactivex.Observable;

public class Guess_the_number_reactive {
	  public static void main(String[] args) throws InterruptedException {
		  	int n = (int)(Math.random() * 10 + 1);
	        System.out.print("Guess the number between 1 and 10: ");
	        Scanner sc = new Scanner(System.in);
	        Observable<String> in = Observable.<String>create(subscriber -> {
	        	Boolean again = true;
	            while (again) {
	                    int input = sc.nextInt();
	                    if(input != n) {
	        	            System.out.print("Wrong! Guess again: ");
	                    } else {
	            	        System.out.println("Well guessed!");
	            	        again = false;
	                    }
	            }
	        });
	        in.subscribe(System.out::println);
	    }
}
