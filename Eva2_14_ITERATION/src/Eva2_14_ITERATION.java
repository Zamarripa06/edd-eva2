import java.util.Iterator;
import java.util.LinkedList;

public class Eva2_14_ITERATION {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        /*lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);*/

        for(int i = 0; i < 1000000; i++){
            lista.add((int)(Math.random()*1000000));
        }

        System.out.println("Cantidad de nodos: " + lista.size());

        Iterator<Integer> iterador = lista.iterator();
        int promedio = 0;
        while(iterador.hasNext()){
            promedio += iterador.next();
        }
        System.out.println("Sumatoria = " + promedio);
        System.out.println("Promedio = " + (promedio/(double)lista.size()));
    }
}
