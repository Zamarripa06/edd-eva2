public class Eva2_4_QUEUE {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        // Agregar elementos a la cola
        queue.push(10);
        queue.push(20);
        queue.push(30);

        // Mostrar la cola
        System.out.println("Cola:");
        queue.imprimir();

        // Obtener el valor del primer elemento sin eliminarlo
        System.out.println("Primer elemento: " + queue.peek());

        // Eliminar el primer elemento y mostrar su valor
        System.out.println("Elemento eliminado: " + queue.pop());

        // Mostrar la cola después de eliminar un elemento
        System.out.println("Cola después de eliminar un elemento:");
        queue.imprimir();
    }
}