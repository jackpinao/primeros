package primeros;

public class Arrays_bi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[4][5];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j]=(int) Math.round(Math.random()*100);
			}
			
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.print("\n");
		}
		
		System.out.println();
		
		for (int[] fila : matrix) {
			for (int z : fila) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
	}

}
