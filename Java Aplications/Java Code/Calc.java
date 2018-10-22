import java.util.Scanner;

public class Calc {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int respuesta = 0;
		int num1 = 0;
		int num2 = 0;
		int res = 0;

		System.out.println("Bienvenido a Calc");
		System.out.println("");

		System.out.println("Que operacion deseas realizar?");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("");

		System.out.println("Elige una respuesta:");
		respuesta = in.nextInt();
		System.out.println("");

		switch(respuesta){

			case 1:

			System.out.println("Indica los valores de tu suma:");
			System.out.println("");
			
			System.out.println("Ingresa el primer valos de tu suma:");
			num1 = in.nextInt();
			System.out.println("");

			System.out.println("Ahora ingresa el segundo valor de tu suma:");
			num2 = in.nextInt();
			System.out.println("");

			res = num1 + num2;

			System.out.println("El Resultado de tu suma es: " + res);
			System.out.println(num1 + " + " + num2 + " = " + res);
			break;

			case 2:

			System.out.println("Indica los valores de tu resta:");
			System.out.println("");
			
			System.out.println("Ingresa el primer valos de tu resta:");
			num1 = in.nextInt();
			System.out.println("");

			System.out.println("Ahora ingresa el segundo valor de tu resta:");
			num2 = in.nextInt();
			System.out.println("");

			res = num1 - num2;

			System.out.println("El Resultado de tu resta es: " + res);
			System.out.println(num1 + " - " + num2 + " = " + res);
			break;

			case 3:

			System.out.println("Indica los valores de tu multiplicacion:");
			System.out.println("");
			
			System.out.println("Ingresa el primer valos de tu multiplicacion:");
			num1 = in.nextInt();
			System.out.println("");

			System.out.println("Ahora ingresa el segundo valor de tu multiplicacion:");
			num2 = in.nextInt();
			System.out.println("");

			res = num1 * num2;

			System.out.println("El Resultado de tu multiplicacion es: " + res);
			System.out.println(num1 + " x " + num2 + " = " + res);
			break;

			case 4:

			System.out.println("Indica los valores de tu division:");
			System.out.println("");
			
			System.out.println("Ingresa el primer valos de tu division:");
			num1 = in.nextInt();
			System.out.println("");

			System.out.println("Ahora ingresa el segundo valor de tu division:");
			num2 = in.nextInt();
			System.out.println("");

			res = num1 / num2;

			System.out.println("El Resultado de tu division es: " + res);
			System.out.println(num1 + " / " + num2 + " = " + res);
			break;

			default: System.out.println("La opcion que elegiste no existe.");
			break;


		}

	}

}