import io.reactivex.Observable;
import java.net.*;
import java.io.*;
import java.util.*;

public class WordsOfEqChars {
    private static Map<String, Collection<String>> anagrams;
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://wiki.puzzlers.org/pub/wordlists/unixdict.txt");
        InputStreamReader isr = new InputStreamReader(url.openStream());
        BufferedReader reader = new BufferedReader(isr);
	anagrams = new HashMap<String, Collection<String>>();
	
	Observable.fromIterable(() -> reader.lines().iterator())
	    .subscribe(word -> {
		    char[] chars = word.toCharArray();
		    Arrays.sort(chars);
		    String key = new String(chars);
		    if (!anagrams.containsKey(key))
			anagrams.put(key, new ArrayList<String>());
		    anagrams.get(key).add(word);
		    count = Math.max(count, anagrams.get(key).size());		    
		});

        reader.close();

	Observable.fromIterable(anagrams.values())
	    .filter(e -> e.size() >= count)
	    .subscribe(System.out::println);
    }
}
