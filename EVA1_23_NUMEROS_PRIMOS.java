package EVA1;

public class EVA1_23_NUMEROS_PRIMOS {

	public static void main(String[] args) {
	 System.out.println("El 15 es primo?: " + esPrimoIneficiente(124));

	}
    public static boolean esPrimoIneficiente(int num) {
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