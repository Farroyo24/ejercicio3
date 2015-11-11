//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado
import java.util.Scanner;
public class TesInteres{
   public static void main(String[] arg){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Introduce el valor de capital, tasa de interes y tiempo");
	   double capital=sc.nextDouble();
	   double interes=sc.nextDouble();
	   double tiempo=sc.nextDouble();
	   
	   System.out.println("El interés proporcional es: "+Interes.calcularInter(capital,interes,tiempo));
        //preparamos el scanner
        //lectura de lo datos
        //llamada al método calcularInteres
        //mostramos por pantalla el valor del interés
   }
}
