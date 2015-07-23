package thinkingInJava_Holding;
import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue =new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for(int i =0; i<10;i++)
			pQueue.offer(rand.nextInt(i+10));
		QueueDemo.printQ(pQueue);
		
		List<Integer> ints = Arrays.asList(25, 22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		pQueue = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(pQueue);
		
		pQueue = new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder()); // Comparator
		pQueue.addAll(ints);
		QueueDemo.printQ(pQueue);
	
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);
		
		Set<Character> charSet = new HashSet<Character>();
		for(char c: fact.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> charPQ = new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(charPQ);
	}

}
