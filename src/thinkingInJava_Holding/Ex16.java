package thinkingInJava_Holding;// chap Holding...
import net.mindview.util.*;
import java.util.*;
// counting vowels 
public class Ex16 {
	public static void vowelCounter(Set<String> st	){
		Set<Character> vowels = new TreeSet<Character> ();
		Collections.addAll(vowels, 'A','E','I','O','U','a','e','i','o', 'u');
		int allVowels = 0;
		for(String s: st ) {
			int cnt = 0;
			for(Character v: s.toCharArray()) {
				if (vowels.contains(v)){
					cnt++;
					allVowels++;
				}
			}
			System.out.print(s + ":" + cnt + ", ");
		}
		System.out.println();
		System.out.println("Total vowel counts: " + allVowels);
		
	}
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(   //  This is a WRONG solution. Missing dup words
				new TextFile("SetOperations.java", "\\W+"));
			vowelCounter(words);
				System.out.println(words);

	}

}
