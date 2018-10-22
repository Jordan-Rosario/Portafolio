import java.util.Scanner;
public class Matrices_dinamicas{
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int filas = 0;
		int columnas = 0;
		int contador = 1;
		
		System.out.println("");
		System.out.println("Benvenido a Matrices dinamicas");
		System.out.println("");

		System.out.print("Que cantidad de filas quieres que tenga tu matriz? ");
		filas = in.nextInt();

		System.out.println("Tu matriz tiene " + filas + " filas.");
		System.out.println("");

		System.out.print("Que cantidad de columnas quieres que tenga tu matriz? ");
		columnas = in.nextInt();

		System.out.println("Tu matriz tiene " + columnas + " columnas.");
		System.out.println("");

		int matriz [][] = new int [filas][columnas];

		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				matriz[i][j] = contador;
				
				System.out.print("[" + matriz[i][j] + "]");

				contador ++;
			}

			System.out.println("");
		}
	}
}