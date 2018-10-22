import java.util.Scanner;

public class Suma{
	public static void main(String args[]) {
		
		Scanner in = new Scanner (System.in);
		String nombre = "";
		int num_uno;
		int num_dos;
		int resultado;

		System.out.println("Intgresa tu nombre:");
		nombre = in.nextLine();

		System.out.println("Ahora ingresa el primer valor para tu suma:");
		num_uno = in.nextInt();

		System.out.println("Ahora ingresa el segundo valor de tu suma:");
		num_dos = in.nextInt();

		resultado = num_uno + num_dos;

		System.out.println("Hola " + nombre + " el resultado de tu suma es igual a: " + resultado + " (" + num_uno + " + " + num_dos + " = " + resultado + " )");
	}
}