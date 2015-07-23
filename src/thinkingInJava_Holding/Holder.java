package thinkingInJava_Holding;

//: generics/Holder.java
class Fruit {}
class Apple2 extends Fruit{}
class Orange2 extends Fruit{}

public class Holder<T> {
		private T value;
		public Holder() {}
		public Holder(T val) { value = val; }
		public void set(T val) { value = val; }
		public T get() { return value; }
		public boolean equals(Object obj) {
		  return value.equals(obj);
		}	
public static void main(String[] args) {
  Holder<Apple2> Apple2 = new Holder<Apple2>(new Apple2());
  Apple2 d = Apple2.get();
  Apple2.set(d);
  // Holder<Fruit> Fruit = Apple2; // Cannot upcast
  Holder<? extends Fruit> fruit = Apple2; // OK				// important line
  Fruit p = fruit.get();
  d = (Apple2)fruit.get(); // Returns 'Object'
  try {
    Orange2 c = (Orange2)fruit.get(); // No warning
  } catch(Exception e) { System.out.println(e); }
  // fruit.set(new Apple2()); // Cannot call set()
  // fruit.set(new Fruit()); // Cannot call set()
  System.out.println(fruit.equals(d)); // OK
}
} /* Output: (Sample)
java.lang.ClassCastException: Apple2 cannot be cast to Orange2
true
*///:~
