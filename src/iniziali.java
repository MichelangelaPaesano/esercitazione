public class iniziali {
     public static void main(String[] args) {
        //Array di stringhe: stampa i nomi che iniziano per M 
        String [] nomi = {"Maria", "Lucia", "Paola", "Michelangela", "Marshall", "Eminem"};

        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].charAt(0) == 'M') {
                System.out.println(nomi[i]);

            }  
        }
}
}