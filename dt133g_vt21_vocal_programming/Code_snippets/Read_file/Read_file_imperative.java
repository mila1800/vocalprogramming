import java.io.FileReader;
import java.io.IOException;

public class Read_file_imperative {

	// ------------ Imperative ----------------//
	public static void readFile(String filename) throws IOException {
	        FileReader in = new FileReader(filename);
	        StringBuilder contents = new StringBuilder();
	        char[] buffer = new char[4096];
	        int read = 0;
	        do {
	            contents.append(buffer, 0, read);
	            read = in.read(buffer);
	        } while (read >= 0);
	        in.close();
	        System.out.println(contents.toString());
	    }
	}

	/**
	import java.nio.charset.Charset;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	// ------------ Option 2 ----------------// - not used
	public static void readFile2(String filename) throws IOException {
			Path file = Paths.get(filename);
			System.out.println(Files.readAllLines(file, Charset.defaultCharset()));
		} */
