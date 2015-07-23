package thinkingInJava_Holding;
import java.util.*;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c= new LinkedList<Integer>();
		for(int i= 0;i<10;i++)
			c.add(i);
		for(Integer i:c)
			System.out.print(i + ", ");
	}

}
