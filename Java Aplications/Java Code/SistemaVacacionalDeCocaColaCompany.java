import java.util.Scanner;

public class SistemaVacacionalDeCocaColaCompany{
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		String name = "";
		int key = 0;
		int years = 0;

		System.out.println("");
		System.out.println("Bienvenido al sistema vacional de Coca-Cola Company");
		System.out.println("");

		System.out.println("Cual es el nombre del colaborador?");
		name = in.nextLine();
		System.out.println("");

		System.out.println("Cuantos años de servicio tiene el colaborador?");
		years = in.nextInt();
		System.out.println("");

		System.out.println("Cual es la clave de su departamento?");
		key = in.nextInt();
		System.out.println("");

		if (key == 1) {
			
			if (years == 1) {
				System.out.println("El colaborador " + name + " tiene derechoa a 6 dias de vacaciones.");				
			}

			else{
				if (years >=2 && years<=6) {

					System.out.println("El colaborador " + name + " tiene derechoa a 14 dias de vacaciones.");
				}

				else{
					if (years >=7) {
						System.out.println("El colaborador " + name + " tiene derechoa a 20 dias de vacaciones.");
					}

					else{
						System.out.println("El colaborador " + name + " aun no tiene derecho a vacaciones.");
					}
				}
			}

		}

		else{
			if (key == 2) {
				if (years == 1) {
					System.out.println("El colaborador " + name + " tiene derechoa a 7 dias de vacaciones.");
				}

				else{
					if (years >=2 && years<=6) {
						System.out.println("El colaborador " + name + " tiene derechoa a 15 dias de vacaciones.");
					}

					else{
						if (years >=7) {
							System.out.println("El colaborador " + name + " tiene derechoa a 22 dias de vacaciones.");
						}

						else{
							System.out.println("El colaborador " + name + " aun no tiene derecho a vacaciones.");
						}
					}
				}
			}

			else{
				if (key == 3) {
					if (years == 1) {
						System.out.println("El colaborador " + name + " tiene derechoa a 10 dias de vacaciones.");
					}

					else{
						if (years >=2 && years<=6) {
							System.out.println("El colaborador " + name + " tiene derechoa a 20 dias de vacaciones.");
						}

						else{
							if (years >=7) {
								System.out.println("El colaborador " + name + " tiene derechoa a 30 dias de vacaciones.");
							}

							else{
								System.out.println("El colaborador " + name + " aun no tiene derecho a vacaciones.");
							}
						}
					}
				}

				else{
					System.out.println("Error. La clave de departamento que ingresaste no es correcta.");
				}
			}
		}


	}
}