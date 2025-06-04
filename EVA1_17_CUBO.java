package EVA1;

public class EVA1_17_CUBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cubo[][][] = new int[5][3][4];
		for (int i = 0; i < cubo.length; i++) {
			for (int j = 0; j < cubo.length; j++) {
				for (int k = 0; k < cubo.length; k++) {
					cubo[i][j][k] = (int)(Math.random() * 100);
				}
			}
		}
		for (int i = 0; i < cubo.length; i++) {
			for (int j = 0; j < cubo.length; i++) {
				for (int k = 0; k < cubo.length; i++) {
					System.out.print("["+ cubo [i][j][k] + "]");

	}
				System.out.println("");
	}
			System.out.println("");
		}
	}
}
