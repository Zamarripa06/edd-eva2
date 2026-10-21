public class Eva2_5_TIPOS_GENERICOS {
    public static void main(String[] args) {
        Ejemplo<Integer> prueba = new Ejemplo<Integer>();
    }
}

class Ejemplo <T> {
    private T dato;

    public Ejemplo() {
    }
    
    public Ejemplo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}