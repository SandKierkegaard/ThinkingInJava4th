package containers;
import java.util.*;

public class RandomList<T> {
	private ArrayList<T>  storage = new ArrayList<T> ();
	private Random rand = new Random(47);
	public void add(T item ) { storage.add(item);}
	public int size(){return storage.size();}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for(String s: ("The quick brown fox jumped over " +
				"the lazy brown dog").split(" "))
				rs.add(s);
		for(int i=0;i<rs.size();i++)
			System.out.print(rs.select() + " ");
		System.out.println(rs.size());
	}

}
