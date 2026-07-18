package clase1;

/**
 *
 * @author Ricardo Abraham Ordoñez Narvaez
 */
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el numero 1: ");
        num = sc.nextInt();

        int mayor = num;
        int menor = num;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextInt();

            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
