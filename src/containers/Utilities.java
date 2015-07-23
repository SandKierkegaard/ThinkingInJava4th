package containers;
import java.util.*;
import static net.mindview.util.Print.*;

public class Utilities {
	static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));
	static List<String> li = new ArrayList<String>();
	
	public static void main(String[] args) {
		print(list);
//		print(" 'list' disjoint (Four)?: " +  Collections.disjoint(list, Collections.singletonList("Four")));
//		print("max: " + Collections.max(list));
//		print("min: " + Collections.min(list));
//		print("max w/ Comparator: " + Collections.max(list,String.CASE_INSENSITIVE_ORDER));
//		print("min w/ Comparator: " + Collections.min(list,String.CASE_INSENSITIVE_ORDER));
//		List<String> sublist =Arrays.asList("Four five six".split(" "));
//		print("indexOfSubList: " + Collections.indexOfSubList(list,sublist));
//		print("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list,sublist));
		Collections.replaceAll(list, "one", "Yo");
		
		print ("replaceAll: " + list);
		Collections.reverse(list);
		print("reverse: " + list);
		Collections.rotate(list,4);
		print(("rotate: "  +list));
		
		String arr[] = { "one", "Yo","Doge"};
		Collections.addAll(li, arr);
//		for(int i = 0;i<3;i++)
//			li.add(new String(arr[i]));
		print (li);
		li.add("Wat");
		print(li);
		li.remove("Yo");
		print (li);
	}

}
