public class OrdineInversi {
    public static void main(String[] args) {
        //Stampa gli elementi dell'array in ordine inverso
        int [] numeri = {1,2,3,4,5,6,7,8};
        int [] valoreInverso = new int[numeri.length]; //così dico a Java di prendere la stessa lunghezza di numeri.

        for (int i = numeri.length -1; i >= 0; i --) {
            valoreInverso [numeri.length - 1 - i] = numeri[i]; 
        }

        for (int i = 0; i < valoreInverso.length; i++) {
            System.out.println(valoreInverso[i]);
        }
}
}