package thinkingInJava_Holding;
import java.util.*;
import java.util.Map.Entry;

public class Ex17_GerbilMap {

	public static void main(String[] args) {
		Map<String, Gerbil> map = new HashMap<String,Gerbil>();
		map.put("Fuzzy", new Gerbil(0));
		map.put("Spot", new Gerbil(1));
		map.put("Speedy", new Gerbil(2));
		map.put("Dopey", new Gerbil(3));
		map.put("Sleepy", new Gerbil(4));
		Iterator<Entry<String,Gerbil>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,Gerbil> entry = it.next();
			System.out.print(entry.getKey() + ": ");
			entry.getValue().hop();
		}
	}

}
