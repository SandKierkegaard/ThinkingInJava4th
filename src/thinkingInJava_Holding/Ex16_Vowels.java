package thinkingInJava_Holding;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
import java.util.*;

	public class Ex16_Vowels {
		private final static Set<Character> vowels = 
				new HashSet<Character> (Arrays.asList('A','E','I','O','U','a','e','i','o', 'u'));
	public static void main(String[] args) {
		HashSet<String> processedWords = new HashSet<String>();
		int fileVowels = 0;
		int wordVowels;
		for(String word: new TextFile("F1.txt", "\\W+")) {
			wordVowels = 0;
			for(char letter : word.toCharArray())
				if(vowels.contains(letter))
					wordVowels++;
			if(!processedWords.contains(word)){
				processedWords.add(word);
				print(word + " has " + wordVowels + " vowels");
			}
			fileVowels +=wordVowels;
		}
		print("Total num of vowels is : " + fileVowels);
	}

}
