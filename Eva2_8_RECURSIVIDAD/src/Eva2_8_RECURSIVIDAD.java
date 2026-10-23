public class Eva2_8_RECURSIVIDAD {
    public static void main(String[] args) {
        imprimirCiclo(5);
        imprimirRecu(5);
    }

    public static void imprimirCiclo(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
    }

    public static void imprimirRecu(int n) {
        //RESUELVA UNA PARTE DEL PROBLEMA
        System.out.print(n + " - ");
        //SE LLAMA A SI MISMO
        if(n > 1) { //DETENER LA RECURSIVIDAD
            imprimirRecu(n - 1);
        }
    }
}