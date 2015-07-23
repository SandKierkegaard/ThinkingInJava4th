package thinkingInJava_Holding;
import typeinfo.pets.*;
import static net.mindview.util.Print.*;
import java.util.*;

public class PetMap {
	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<String,Pet>();
		petMap.put("My Cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));
		petMap.put("MY Hamster", new Hamster("Bosco"));
		print(petMap);
		Pet dog = petMap.get("My Dog");
		print (dog);
		
		Pet cat  = petMap.get("My Cat");
		print (cat);
		print(petMap.containsKey("My Dog"));
		print(petMap.containsValue(dog));
	}

}
