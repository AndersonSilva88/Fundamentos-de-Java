package colecaoDeDados;

public class Arrays {

	public static void main(String[] args) {
		
	  int [] array = new int [5];
		
	  array[1] = 6;
	  array[4] = 7;
	  
	  for (int i = 0; i < array.length; i++ ) {
		  System.out.println(array[i]);
	  }
	  
	  for (int j : array) {
		  System.out.print(j+"-");
	  }
	  
	  String [] array2 = new String[7];
	  
	  array2[1] = "A";
	  array2[4] = "B";
	  
	  for (String s : array2) {
		  System.out.println(s);
	  }

	}

}
