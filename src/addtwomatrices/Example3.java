package addtwomatrices;

import java.util.Scanner;

public class Example3 {
	public static void main(String args[]) {
		int row, col, i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Number of rows : ");
		row = in.nextInt();
		System.out.println("Number columns : ");
		col = in.nextInt();

		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];

		System.out.println("Enter the elements of matrix 1 : ");
		i = 0;
		do {
			j = 0;
			do {
				mat1[i][j] = in.nextInt();
				j++;
			} while (j < col);
			i++;

		} while (i < row);
		System.out.println("Enter the elements of matrix 2 : ");

		i = 0;
		do {
			j = 0;
			do {
				mat2[i][j] = in.nextInt();
				j++;
			} while (j < col);
			i++;

		} while (i < row);

		i = 0;
		do {
			j = 0;
			do {

				res[i][j] = mat1[i][j] + mat2[i][j];
				j++;
			} while (j < col);
			i++;

		} while (i < row);

		System.out.println("Sum of matrices : ");
		i = 0;
		do {
			j = 0;
			do {

				System.out.print(res[i][j] + " ");
				j++;
			} while (j < col);
			System.out.println();
			i++;

		} while (i < row);

	}
}
