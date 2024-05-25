public class Main {

    public static void main(String[] args) {

        /*
        Creati clasa Book, cu urmatoarele campuri: String name, String author, int totalPageNumber, int currentPageNumber
        metodele flipPageForward(), flipPageBackward() si printBookState();
        - Metoda printBookState() va printa starea cartii noastre sub forma: "Cartea X, scrisa de Y, are Z pagini si este
        deschisa pa pagina Q."
        - Metodele flipPageForward() si flipPageBackward() vor modifica starea interna a cartii noastre.
        - HINT: Unei carti nu i se poate da o pagina inapoi daca pagina curenta este 1.
        - De asemenea nu i se poate da o pagina inainte daca pagina curenta este ultima pagina.
        - Creati o carte si rasfoiti-o !
         */

        Book Carte1 = new Book("Eragon", "Alex Istrate", 346);
        Carte1.flipPageForward();
        Carte1.flipPageForward();
        Carte1.printBookState();






    }

}
