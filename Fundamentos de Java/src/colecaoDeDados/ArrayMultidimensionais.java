package colecaoDeDados;

public class ArrayMultidimensionais {

	public static void main(String[] args) {
		
		int [][] array = new int[3][5];
		
		array[2][3] = 10;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(" 0 ");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+ " X ");
			}
			System.out.println();
		}

	}

}
