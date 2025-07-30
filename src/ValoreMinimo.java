public class ValoreMinimo {
    public static void main(String[] args) {
        //Trova il valore minimo all'interno di un array 

        int [] arr = {1, 35, 456, 856, 2, 0};
       
        int minimo = arr[0];
        
        for (int i = 0; i < arr.length; i ++) {
            if (minimo > arr[i]) {
                minimo = arr[i];
            }
        }

        System.out.println("il valore minimo dell'array è: " + minimo);
    
}
}
