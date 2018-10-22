public class Promedio{
  public static void main(String args[]){
   
   int matematicas = 8;
   int biologia = 8;
   int quimica = 6;
   int promedio = 0;

   promedio = (matematicas + biologia + quimica) / 3;

   if (promedio >= 7){
    System.out.println("El alumno aprobo con un promedio de " + promedio);
   }
  else{
    System.out.println("El alumno reprobo con un promedio de " + promedio);
   }
 }
}