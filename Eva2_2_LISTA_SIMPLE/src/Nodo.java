public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo siguiente;
    //CONTRUCCIONES:

    public Nodo() {
        siguiente = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
    }

    public Nodo(int valor) { //PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = valor;
        this.siguiente = null;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
