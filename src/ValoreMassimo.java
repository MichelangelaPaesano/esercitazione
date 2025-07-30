

public class ValoreMassimo {
    public static void main(String[] args) {
        //Trova il valore massimo all'interno di un array di interi 

        int [] numeri = {1, 15, 18, 36, 50, 2, 5, 100};

        int max = numeri[0];

        for (int i = 0; i < numeri.length; i++) {
            if (max < numeri[i]) {
                max = numeri[i];
            }
            
        }

        System.out.println("Questo è il valore massimo: " + max);
    }
}
