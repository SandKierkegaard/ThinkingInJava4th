package thinkingInJava_Holding;
import java.util.*;
import net.mindview.util.Stack;
// Modified by SD ,  added Stack
public class QueueDemo {
	public static void printQ(Queue queue){
		while (queue.peek()!= null)
			System.out.print(queue.remove() + " ");
		System.out.println();
	}
	public static void printS(Stack s){
		while( !s.empty())
			System.out.print(s.pop() + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i = 0; i<10;i++)
			queue.offer(rand.nextInt(i + 10));
//			queue.offer(10-i);
		printQ(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		Stack<Character> ss=  new Stack<Character>();
		
		for(char c : "Brontosaurus".toCharArray())
			{qc.offer(c);
			ss.push(c);}
		printQ(qc);
		System.out.println(ss);
		printS(ss);
	
	}

}
