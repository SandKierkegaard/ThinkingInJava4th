package innerclass;

import innerclass.Parcel7b.MyContents;

interface Destination {
	String readLabel();
} 

public class Parcel9 {

	// Argument must be final to use inside
	// anonymous inner class:
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			public String readLabel() { return label; }
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
		System.out.println(((Destination)d).readLabel()); // forced to work
	}
}