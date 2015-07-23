package thinkingInJava_Holding;
import java.util.*;
class Doggy {
	int size;
 
	public Doggy(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
}

public class SetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Set<Integer> intset  = new HashSet<Integer>();
		for(int i = 0;i<10000;i++)
			intset.add(rand.nextInt(30));
		System.out.println(intset);
		
//		HashSet<Doggy> dset = new HashSet<Doggy>();
//		dset.add(new Doggy(3));
//		dset.add(new Doggy(1));
//		dset.add(new Doggy(2));
//		dset.add(new Doggy(5));
//		dset.add(new Doggy(4));
//		Iterator<Doggy> it = dset.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next() + " ");
//		}
	}

}
