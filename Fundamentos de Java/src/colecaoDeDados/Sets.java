package colecaoDeDados;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		set.add("G");
		set.add("H");
		set.add("I");
		
		for (String s : set) {
			System.out.println(s);
		}
	}

}
