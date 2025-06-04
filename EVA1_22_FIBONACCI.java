package EVA1;
import java.util.Scanner;
public class EVA1_22_FIBONACCI {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Posicion en la serie Fibonacci: ");
	        int posicion = scanner.nextInt();
	        scanner.close();

	        int resultado = fibonacciRecursivo(posicion);
	        System.out.println("El numero en la posicion " + posicion + " es: " + resultado);
	    }

	    public static int fibonacciRecursivo(int n) {
	        if (n <= 1) {
	            return 1;
	        }
	        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	    }
	}

