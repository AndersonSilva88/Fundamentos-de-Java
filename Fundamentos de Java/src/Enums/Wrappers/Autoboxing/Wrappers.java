package Enums.Wrappers.Autoboxing;

public class Wrappers {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(20);
		imprimir(i);

		Double d = Double.valueOf(23.5);
		imprimir(d);
		
		int i2 = i.intValue(); //retornada valores
		double d2 = d.doubleValue(); // retorna valores
		
		imprimir(i2);
	}
	
	private static void imprimir(Object obj) {
		System.out.println(obj);
	}

}
