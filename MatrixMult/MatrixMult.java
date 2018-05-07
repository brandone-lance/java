public class MatrixMult {
	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
			System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static int[][] multiply(int matrixA[][], int matrixB[][]) {
		// initialize indices for summation
		int i, j, k;
		
		// Determine sizes of matrices
		int Arows = matrixA.length;
		int Acols = matrixA[0].length;
		int Brows = matrixB.length;
		int Bcols = matrixB[0].length;
		
		// establish new matrix
		int matrixC[][] = new int[Arows][Bcols];
		
		// Multiply by nested summations
		for(i = 0; i<Arows; i++) {
			for(j = 0; j<Bcols; j++) {
				for(k = 0; k<Acols; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return matrixC;
	}
	
	public static void main(String Args[]) {
		
		/* These are the matrices we are multiplying together,
		in the form of:
		AB = C */
		
		// A
		final int[][] matrixA = {
		  { 2, 0, 0 },
		  { 0, 2, 0 },
		  { 0, 0, 2 }
		};
		
		// B
		final int[][] matrixB = {
		  { 1, 2, 3 },
		  { 4, 5, 6 },
		  { 7, 8, 9 }
		};
		
		// Multiply C = AB
		int matrixC[][] = multiply(matrixA, matrixB);
		
		// Print result to screen
		printMatrix(matrixC);
	}
}
