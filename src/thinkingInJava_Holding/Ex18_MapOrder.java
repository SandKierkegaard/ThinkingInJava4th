package thinkingInJava_Holding;
import net.mindview.util.*;
import java.util.*;

public class Ex18_MapOrder {

	public static void main(String[] args) {
		Map<String,String> m1 = new HashMap<String,String>(Countries.capitals(8));
		System.out.println(m1);
		String[] keys = m1.keySet().toArray(new String[0]);
		Arrays.sort(keys);
		Map<String,String> m2 = new LinkedHashMap<String,String>();
		for(String key: keys)
			m2.put(key, m1.get(key));
		System.out.println(m2);
	}

}
