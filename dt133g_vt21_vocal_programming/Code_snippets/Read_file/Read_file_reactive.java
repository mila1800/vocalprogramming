
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import io.reactivex.Observable;

public class Read_file_reactive {

	  public static void readFile(String filename) throws FileNotFoundException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	    Observable.fromIterable(() -> in.lines().iterator())
	    .subscribe((System.out::println));
	  }
}
