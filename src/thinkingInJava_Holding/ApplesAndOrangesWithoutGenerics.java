package thinkingInJava_Holding;
import java.util.*;

class Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){return id;}
}

class Orange{}

public class ApplesAndOrangesWithoutGenerics { //ApplesAndOrangesWithGenerics
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i =0;i<3;i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for(int i =0;i<apples.size();i++)  
			System.out.println(((Apple)apples.get(i)).id());
		// Orange detected at runtime
		for (Apple c:apples)
			System.out.println(c.id());
	}

}
