package EVA1;

public class EVA1_6_ARREGLOS_2 {
public static void main(String[] args) {
	int datos[] = new int[10];
	System.out.println(datos);
	
	//LLENAR EL ARREGLO DE VALORES ALEATORIOS
	for(int i = 0; i < 10; i++) {
	                //casting
		datos[i] = (int)(Math.random() * 100);
	}
	for (int i = 0; i < datos.length; i++) {
		//Casting
		datos[i] = (int)(Math.random() * 100);
	}
	for (int i = 0; i < datos.length; i++) {
		System.out.println ("[" + datos[i] + "]");
		
	}
}
}
