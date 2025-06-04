package EVA1;

public class EVA1_3_HEAP {
public static void main(String[] Args) {
	Prueba prueba = new Prueba();
	System.out.println(prueba.x);
	//Prueba prueba2;//NECESITO UN RESPALDO DE PRUEBA.X = 100
	//prueba2 = prueba;// NO FUNCIONA, SE DUPLICA LA MISMA DIRECCION
	Prueba prueba2 = new Prueba();
	prueba2.x = prueba.x;
	System.out.println(prueba2.x);
	prueba.x = 200;
	System.out.println(prueba.x);
	System.out.println(prueba2.x);
	System.out.println(prueba);
	System.out.println(prueba2);
	if(prueba == prueba2)
		System.out.println("Objetos Iguales");
	else
		System.out.println("Objetos Distintos");
	}
}
class Prueba{
	int x = 100;
}