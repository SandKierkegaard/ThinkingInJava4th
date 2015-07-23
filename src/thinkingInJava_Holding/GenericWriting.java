package thinkingInJava_Holding;
import java.util.*;
class Fruit3{}
class Apple3 extends Fruit3{}

public class GenericWriting {
	
	
	static <T> void writeExact(List<T> list, T item){
		list.add(item);
	}
		
	static List<Apple3> apples = new ArrayList<Apple3>();
	static List<Fruit3> fruits = new ArrayList<Fruit3>();
	static void f1() {
	writeExact(apples, new Apple3());
	writeExact(fruits, new Apple3());
	}
	static<T> void writeWithWildcard ( List<? super T> list, T item) {
		list.add(item);
	}
	static void f2(){
		writeWithWildcard(apples, new Apple3());
		writeWithWildcard(fruits, new Apple3());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		f2();
	}

}
