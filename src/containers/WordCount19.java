package containers;
import net.mindview.util.*;	
import static net.mindview.util.Print.*;
import java.util.*;

public class WordCount19 {
	public static void main(String[] args) {
		String fileName = "Foo.txt";
		SimpleHashMap<String, Integer> map = new SimpleHashMap<String, Integer>();
		ArrayList<String> words =new TextFile(fileName, "\\W+");

		System.out.println();
		
		// Count appearances of each unique word and add to array:
				for(String s : words) {
					
					Integer freq = map.get(s);
					map.put (s,freq ==null? 1 : freq+1);
				}
				print(map);
	}

}
