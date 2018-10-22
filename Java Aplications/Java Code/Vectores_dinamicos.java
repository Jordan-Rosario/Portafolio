import java.util.Scanner;
public class Vectores_dinamicos{
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int valores = 0;
		int casillas = 0;

		System.out.println("");
		System.out.println("Bienvenido a Dinamic Vectors");
		System.out.println("");

		System.out.print("Cuantos espacios quieres quieres que tenga tu arreglo? ");
		casillas = in.nextInt();

		int vector[] = new int[casillas];

		System.out.println("Tu arreglo tiene " + vector.length + " espacios.");
		System.out.println("");

		for (int i = 0; i < vector.length; i++) {
		
		System.out.println("Ahora llenemos la casilla numero " + (i+1) );
		System.out.print("Que valor deseas introducir en la casilla numero " + (i+1) + "?(Solo numeros) ");
		valores = in.nextInt();

		vector[i] = valores;
		System.out.println("");

		System.out.println("Haz introducido el valor " + vector[i] + " en la casilla numero " + (i+1) + " de tu arreglo.");
		System.out.println("");
		}

		System.out.println("Bien. Haz llenado todos los espacios de tu arreglo");
		System.out.println("");

		System.out.println("Este es tu arreglo:");

		for (int i = 0; i < vector.length; i++) {
			System.out.print("[" + vector[i] + "]");
		}

		System.out.println("");
	}
}