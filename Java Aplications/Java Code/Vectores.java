import java.util.Scanner;
public class Vectores{
	public static void main(String args[]) {

		int espacio[] = new int[5]; //Esto es un arreglo unidimencional.
		int respuesta =  0;
		int valor = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Vienvenido a Vectores");
		System.out.println("");

		System.out.print("Tienes 5 espacios disponibles. En cual posicion quieres introducir tus datos? 1, 2, 3, 4, 5: ");
		respuesta = in.nextInt();

		System.out.println("Elegiste la posicion numero " + respuesta + ".");
		System.out.println("");

		System.out.print("Que valor deseas introducir en esta posicion? (Solo numeros): ");
		valor = in.nextInt();
		System.out.println("");

		espacio[respuesta - 1] = valor; //Primero se especifica la posicion e la que se quiere guardar el valor 
										//y luego se introduce el valor deseado

		System.out.println("Haz introducido el valor [" + espacio[respuesta - 1] + "] en la posicion numero " + respuesta + ".");
	}
}