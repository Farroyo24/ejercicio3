/*fichero Interes.java
 *Clase el interés (I) que produce un capital
 *el cúal  es directamente proporcional al capital inicial (C),
 *al tiempo (t), y a la tasa de interés (i) :
 *I = C · i · t
 *
 * @author Fran
 * @version 1.0
 */


public class Interes{
	public static double calcularInter(double c, double i, double t){
		double interes=0;
		interes=c*i*t;
   //return interes
		return interes;
	}
}
