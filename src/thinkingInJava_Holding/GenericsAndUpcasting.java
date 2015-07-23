package thinkingInJava_Holding;
import java.util.*;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Bra extends Apple{}

public class GenericsAndUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Fuji());
		apples.add(new Gala());
		apples.add(new Bra());
		for(Apple c: apples)
			System.out.println(c.getClass().getSimpleName());
	}

}
