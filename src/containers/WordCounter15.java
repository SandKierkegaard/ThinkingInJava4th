package containers;
import net.mindview.util.*;	
import static net.mindview.util.Print.*;
import java.util.*;

public class WordCounter15 {
	
	public static void main(String[] args) {
		String fileName = "Foo.txt";
		ArrayList<String> words = new TextFile(fileName,"\\W+");
		SlowMap<String,Integer> map = new SlowMap<String,Integer>();
	
		for(String word : words) {
			Integer freq =map.get(word);
			map.put(word, freq == null? 1 :freq+1);
		}
		print(map);
	}

}
