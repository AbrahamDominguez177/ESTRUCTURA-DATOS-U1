package EVA1;

public class EVA1_16_ARREGLOS_MULTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int matriz[][] = new int[5][];
    // System.out.println(matriz.length);
    // System.out.println(matriz[0].length);
     matriz[0] = new int[6];
     matriz[1] = new int[2];
     matriz[2] = new int[4];
     matriz[3] = new int[7];
     matriz[4] = new int[1];
     
     for (int i = 0; i < matriz.length; i++) {
    	 for (int j = 0; j < matriz[i].length; j++) {
    		 matriz[i][j] = (int)(Math.random()*100);
       }
	  }
     for (int i = 0; i < matriz.length; i++) {
    	 for (int j = 0; j < matriz[i].length; j++) {
    		 System.out.println("["+ matriz [i][j] + "]");
        }
    	 System.out.println("");
     }
	}
}

     
