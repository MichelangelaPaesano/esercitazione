public class somma {
    public static void main(String[] args) {
        //Calcola la somma di tutti gli elementi di un array.

        int [] numeri = {1,2,3,4,5,6,7,8,9};
        int somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma = somma + numeri[i];
        }

        System.out.println("La somma dell'array è " + somma);

}
}
