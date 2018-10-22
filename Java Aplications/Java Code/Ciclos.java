public class Ciclos{
	public static void main(String args[]) {
		
		int i = 1;

		System.out.println("Ciclos con for");

		for (i = 1; i <=10 ; i++ ) {
			
			if (i < 10) {
				System.out.print(i + ",");	
			}
			else{
				System.out.print(i);
			}
		}

		System.out.println("");
		System.out.println("");

		System.out.println("Ciclos con while");

		i = 1;

		while(i <= 10){

			if (i < 10) {
				System.out.print(i + ",");
			}

			else{
				System.out.print(i);
			}

			i++;
		}

		System.out.println("");
		System.out.println("");

		System.out.println("Ciclos con do-while");

		i = 1;

		do{

			if (i < 10) {
				System.out.print(i + ",");
			}
			else{
				System.out.print(i);
			}

			i++;

		}while(i <= 10);

		System.out.println("");
	}
}