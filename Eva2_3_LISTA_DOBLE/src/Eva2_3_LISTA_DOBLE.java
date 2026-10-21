public class Eva2_3_LISTA_DOBLE {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        lista.inversa();
        lista.insertarEn(250, 2);
        lista.imprimir();
        lista.borrarEn(2);
        lista.imprimir();
        lista.insertarEn(600, 4);
        lista.imprimir();
    }
}
