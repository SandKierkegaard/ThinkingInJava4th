package thinkingInJava_Holding;
import java.util.*;

public class Ex28 {

	public static void main(String[] args) {
		Random r = new Random(47);
		PriorityQueue<Double> pQ  = new PriorityQueue<Double>();
		for(int i =0;i<10;i++){
			pQ.offer(r.nextDouble()*i);
			
		}
		QueueDemo.printQ(pQ);
		
	}

}
