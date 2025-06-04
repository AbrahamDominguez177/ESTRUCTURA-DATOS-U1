package EVA1;

public class EVA1_11_Copia_Array {
	public static void main (String[] args) {
		int datos[] = new int [10];
		System.out.println(datos);
		for (int i = 0; i < datos.length; i++) {
			datos[i] = (int)(Math.random() * 100);
		}
		for (int valor: datos) {
			System.out.print("[" + valor + "]");
		}
		int[] copia = {datos[0], datos[1], datos[2], datos[3], datos[4]};
		System.out.println(copia);
		
		for (int num : copia) {
            System.out.print(num + " ");
		}
	}
}
