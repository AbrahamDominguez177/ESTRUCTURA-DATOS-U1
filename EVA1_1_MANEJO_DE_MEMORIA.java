package EVA1;

public class EVA1_1_MANEJO_DE_MEMORIA {
 public static void main(String[] args) {
	 System.out.println("Inicia main");
	 A();
	 System.out.println("Termina main");
 }
 public static void A() {
	 System.out.println("Inicia a");
	 B();
	 System.out.println("Termina a");
 } 
 public static void B() {
	 System.out.println("Inicia b");
	 System.out.println("Termina b");
 }
}
