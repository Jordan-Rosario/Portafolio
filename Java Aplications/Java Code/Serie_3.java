public class Serie_3{
	public static void main(String args[]) {
		
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("");
		System.out.println("Sucesion fibonacci Serie_3");
		System.out.println("");

		for (int i = 0; i<10; i++) {

			if (i < 9) {
			
				System.out.print(a + ",");
				c = a + b;
				a = b;
				b = c;				
			
			}

			else{

				System.out.print( a );
				c = a + b;
				a = b;
				b = c;

				System.out.println("");
			}			
		}		
	}
}