public class stringa {
     public static void main(String[] args) {
        //inverti la stringa

        String parola = "Ciao";

        String nuovaParola = "";

        for (int i = parola.length() -1; i >=0; i--) {
            nuovaParola = nuovaParola + parola.charAt(i) ;    
        }

        System.out.println(nuovaParola);

        
}
}
