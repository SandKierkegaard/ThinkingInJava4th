package thinkingInJava_Holding;
import net.mindview.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		for(String s :"My dog has fleas".split(" "))
			stack.push(s);
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}

}
