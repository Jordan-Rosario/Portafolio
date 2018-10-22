public class Operadores{
public static void main(String args[]) {

 int operacion = 3;
 int num_uno = 8;
 int num_dos = 4;
 int resultado = 0;

  if (operacion == 1) {
			
   resultado = operacion + num_uno;
   System.out.println("El resultado de la suma es igual a: " + resultado + " " + "( " + num_uno + " + " + num_dos + " = " + resultado + " ) ");
  }

  else {

   if (operacion == 2) {

      resultado = num_uno - num_dos;
      System.out.println("El resultado de la resta es igual a: " + resultado + " " + "( " + num_uno + " - " + num_dos + " = " + resultado + " ) ");
   }

      else {

         if (operacion == 3) {

         resultado = num_uno * num_dos;
         System.out.println("El resultado de la multiplicacion es igual a: " + resultado + " " + "( " + num_uno + " * " + num_dos + " = " + resultado + " ) ");
         }

         else {

            if (operacion == 4) {

               resultado = num_uno / num_dos;
               System.out.println("El resultado de la divicion es igual a: " + resultado + " " + "( " + num_uno + " / " + num_dos + " = " + resultado + " ) ");
            }

             else {
             System.out.println("La operacion no es valida");
             }
          }
       }
    }
 }
}