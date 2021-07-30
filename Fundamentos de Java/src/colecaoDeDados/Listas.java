package colecaoDeDados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("Abc");
		l.add("def");
		l.set(0, "ghi");
	
		
		for (String s : l) {
			System.out.println(s);
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
