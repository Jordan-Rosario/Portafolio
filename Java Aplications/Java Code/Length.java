import java.util.Scanner;
public class Length{
	public static void main(String args[]) {
		String texto = "";
		String recorte = "";
		String respuesta = "";
		Scanner in = new Scanner(System.in);
		int caracteres = 0;
		int desde = 0;
		int hasta = 0;

		System.out.println("");
		System.out.println("Bienvenido a Caracters Search");
		System.out.println("");
		
		System.out.print("Introduce un texto: ");
		texto = in.nextLine();

		caracteres = texto.length();

		System.out.println("La cadena de texto que intruciste tiene " + caracteres + " caracteres (Incluyendo los espacios).");
		System.out.println("");

		System.out.print("Quieres buscar un recorte entre tu cedena de texto? ");
		respuesta = in.nextLine();
		System.out.println("");

		if (respuesta.equalsIgnoreCase("si")) {

			System.out.print("Desde que caracter quieres buscar tu recorte? ");
			desde = in.nextInt() - 1;
			System.out.println("");

			System.out.print("Ahora hasta que caracter quieres buscar tu recorte? (Los espacios cuentan como caracteres). ");
			hasta = in.nextInt() + 1;
			System.out.println("");

			recorte = texto.substring(desde, hasta);

			System.out.println("Bien este es tu recorte:");
			System.out.println(recorte);
		}

		else{
			
			if (respuesta.equalsIgnoreCase("no")) {
				System.out.println("Entonces esto es todo por ahora.");
			}

			else{
				System.out.println("Tu respuesta no es valida.");
				return;
			}
		}
	}
}