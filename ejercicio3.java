package clase1;

/**
 *
 * @author Ricardo Abraham Ordoñez Narvaez
 */
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
            int edad;
            System.out.print("Ingrese su edad:");
            edad = sc.nextInt();
            if(edad>=18){
                System.out.println("Es mayor de edad.");
                
            }
    }
}
