package EVA1;

public class ArbolBinario {

    private Nodo root;
    
    public ArbolBinario() {
    	root = null; //arbol vacio
    }
    
    	//ADD NODE (recursivas)
    public void add(int valor) {
      //HAY NODOS
      // NO HAY NODOS
    	if(root == null) {
    		root = nuevo;
    	} else { // HAY NODOS
    		addRec(valor, root);
    	}
	}
    
    private void addRec(int valor, Nodo actual) {
    	if(valor < actual.getValor()) { // va a la izquierda
    		if(actual.getIzquierda() == null) { // izquierda vacia (disponible)
    			actual.setizquierda(new Nodo(valor));
    		} else {
    			addRec(valor, actual.getIzquierda());
    		}
    	}else if(valor > actual.getVALOR()) { //va a la derecha
    }
    	private void addRec(int valor, Nodo actual) {
        	if(valor < actual.getValor()) { // va a la derecha
        		if(actual.getDerecha() == null) { // derecha vacia (disponible)
        			actual.setDerecha(new Nodo(valor));
        		} else {
        			addRec(valor, actual.getDerecha());
        		}
        	}else if(valor > actual.getVALOR()) { //va a la derecha
        }
}
  public void inorder() {
	  inorderRec(root);
	  System.out.println("");
  }
  
  private void inorderRec(Nodo actual) {
	  if(actual != null) {
  }
	  //RECORRER TODO EL LADO IZQUIERDO
	  inorderRec(actual.getIzquierda());
	  System.out.print("[" + actual.getValor() + "]");
	  //RECORRER TODO EL LADO DERECHO
	  inorderRec(actual.getDerecha());
  }
    }
  //BIG OH = LogN
    private void Rec(Nodo actual) {
  	  if(actual != null) {
    }
  	 Private void Rec ( Nodo actual ) { 
  		 if ) actual ! = null { 
  	 }
  
  
  
  
  
  
  
  
  
  
  