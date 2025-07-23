
import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
        //Obiettivo: Chiedere all'utente un numero n e calcola il suo fattoriale.
        //Esempio: n = 5
        //Output: 5x4x3x2x1 = 120

        Scanner scan = new Scanner(System.in);

        System.out.println("Scegli un numero");
        int numero = scan.nextInt();
        int risultato = 0;

        for(int i = 0; i<= numero; i++){
            System.err.println(numero * i);
        };
}
}