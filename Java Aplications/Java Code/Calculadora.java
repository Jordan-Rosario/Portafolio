import java.util.Scanner;

public class Calculadora{
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String nombre = "";
		/*String respuesta = "";*/
		int eleccion = 0;
		int primerNum = 0;
		int segundoNum = 0;
		int resultado = 0;

		System.out.println("Bienvenido a Calculator.");
		System.out.println("Cual es tu nombre?");

		nombre = in.nextLine();

		System.out.println("");

		System.out.println("Hola " + nombre + ", que operacion deseas realizar?");

		System.out.println("1-Sumar, 2-Restar, 3-Multiplicar, 4-Dividir");

		System.out.println("Elige una opcion:");
		System.out.println("");

		eleccion = in.nextInt();

		if (eleccion == 1) {

			System.out.println("Bien haz elegido sumar.");

			System.out.println("Cual es el primer numero de tu suma?");
			primerNum = in.nextInt();
			System.out.println("");

			System.out.println("El primer numero de tu suma es: " + primerNum);
			System.out.println("");
			
			System.out.println("Ahora cual es el segundo numero de tu suma?");
			segundoNum = in.nextInt();
			System.out.println("");

			System.out.println("El segundo numero de tu suma es: " + segundoNum);
			System.out.println("");

			System.out.println("La suma que vas a realizar es: " + primerNum + " + " + segundoNum);
			System.out.println("");

			System.out.println("Okay.");
			System.out.println("");

			resultado = primerNum + segundoNum;

			System.out.println(nombre + " el resultado de tu suma es: " + resultado);
			System.out.println(primerNum + " + " + segundoNum + " = " + resultado);

		}

		else{

			if (eleccion == 2) {

				System.out.println("Bien haz elegido Restar.");

			System.out.println("Cual es el primer numero de tu resta?");
			primerNum = in.nextInt();
			System.out.println("");

			System.out.println("El primer numero de tu resta es: " + primerNum);
			System.out.println("");
			
			System.out.println("Ahora cual es el segundo numero de tu resta?");
			segundoNum = in.nextInt();
			System.out.println("");

			System.out.println("El segundo numero de tu resta es: " + segundoNum);
			System.out.println("");

			System.out.println("La resta que vas a realizar es: " + primerNum + " - " + segundoNum);
			System.out.println("");

			System.out.println("Okay.");
			System.out.println("");

			resultado = primerNum - segundoNum;

			System.out.println(nombre + " el resultado de tu resta es: " + resultado);
			System.out.println(primerNum + " - " + segundoNum + " = " + resultado);
				
			}

			else{

				if (eleccion == 3) {

					System.out.println("Bien haz elegido Multiplicar.");

			System.out.println("Cual es el primer numero de tu multiplicacion?");
			primerNum = in.nextInt();
			System.out.println("");

			System.out.println("El primer numero de tu multiplicacion es: " + primerNum);
			System.out.println("");
			
			System.out.println("Ahora cual es el segundo numero de tu multiplicacion?");
			segundoNum = in.nextInt();
			System.out.println("");

			System.out.println("El segundo numero de tu multiplicacion es: " + segundoNum);
			System.out.println("");

			System.out.println("La multiplicacion que vas a realizar es: " + primerNum + " x " + segundoNum);
			System.out.println("");

			System.out.println("Okay.");
			System.out.println("");

			resultado = primerNum * segundoNum;

			System.out.println(nombre + " el resultado de tu multiplicacion es: " + resultado);
			System.out.println(primerNum + " x " + segundoNum + " = " + resultado);

				}

				else{

					if (eleccion == 4) {

						System.out.println("Bien haz elegido Dividir.");

			System.out.println("Cual es el primer numero de tu divicion?");
			primerNum = in.nextInt();
			System.out.println("");

			System.out.println("El primer numero de tu divicion es: " + primerNum);
			System.out.println("");
			
			System.out.println("Ahora cual es el segundo numero de tu divicion?");
			segundoNum = in.nextInt();
			System.out.println("");

			System.out.println("El segundo numero de tu divicion es: " + segundoNum);
			System.out.println("");

			System.out.println("La divicion que vas a realizar es: " + primerNum + " / " + segundoNum);
			System.out.println("");

			System.out.println("Okay.");
			System.out.println("");

			resultado = primerNum / segundoNum;

			System.out.println(nombre + " el resultado de tu divicion es: " + resultado);
			System.out.println(primerNum + " / " + segundoNum + " = " + resultado);
						
					}

					else{

						System.out.println(nombre + " la opcion que elegiste no es valida.");
					}
				}
			}
		}

	}
}