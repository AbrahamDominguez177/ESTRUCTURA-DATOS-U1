package EVA1;

public class EVA1_24_NUMEROS_PRIMOS_CHIDO {
		public static void main(String[] args) {
		 System.out.println("El 124 es primo?: " + esPrimoEficiente(124));

		}
	    public static boolean esPrimoEficiente(int num) {
	    	boolean resu = true;
	    	for (int i = 2; i < num; i++ ) {
	    	int residuo = num % i;
	    	if(residuo == 0) {// division exacta, no es primo
	    		resu = false;
	    		break; //ya no es necesario seguir buscando
	    	}
	    }
	    	return resu;
	}
}
