
package EVA1;

public class EVA1_5_ARREGLOS {
 public static void main (String[] args) {
	 int[] datos = new int[10];
	 //int[ a, b, c; //tres arreglos de tipo entero
	 //int[ a, b[. c: /i/ un arreglo de tipo entero
	 //ACCESO ALEATORIO (POR INDICES)
	 datos[0] = 100;
	 datos[1] = 200;
	 //datos[10] = 1000; //GENERA EXCEPCION (LLEGA HASTA 9)
	 datos[9] = 1000;
	 //uso de ciclos para manejar arreglos:
	 for (int i = 0; i < 10; i++) {//ASIGNACION DE DATOS
		 datos[i] = 100;
	 }
	 for (int i = 0; i < 10; i++) {//LECTURA
		 System.out.printf("[" + datos[i] + "]");
	 }
 }
}
