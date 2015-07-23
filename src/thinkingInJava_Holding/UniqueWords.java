package thinkingInJava_Holding;
import  net.mindview.util.*;
import java.util.*;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>( String.CASE_INSENSITIVE_ORDER);
		words.addAll(
				new TextFile("SetOperations.java","\\W+"));
		System.out.println(words);
	}

}
