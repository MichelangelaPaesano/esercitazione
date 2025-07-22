
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Tabellina
        //Obiettivo: Chiedere all'utente di quale numero stampare la tabellina e fino a quale numero arrivare. --
        //Esempio: numeroTabellina 5, numeroFineTabellina 10
        //Output: 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50

        Scanner scan = new Scanner(System.in);

        System.out.println("Di quale numero vuoi stampare la tabellina?");
        int numero = scan.nextInt();

        System.out.println("Fino a quale dividendo");
        int dividendo = scan.nextInt();
        int risultato = 0;

        for(int i = 0; i <= dividendo; i++) {
            System.out.println(numero * i);
        };
        
        }


    }
