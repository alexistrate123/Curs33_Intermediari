package Exercitiu2;

public class Main {
    public static void main(String[] args) {

        /*
        Creati clasa Pencil cu campurile String color, int remainingInk() si metoda write() care va primi un parametru
        de tip String text;
        - Culoarea pixului va fi primita ca parametru in constructor, iar orice pix initializat va avea 1000 remainingInk.
        - Metoda write() va consuma 1 remainingInk pentru fiecare litera/numar primite in parametrul acesteia de tip String
        - Initialiazati un Pencil iar prin intermediul metodei write printati la consola tot ce stiti despre clase si obiecte;

         */


        Pencil Pix1 = new Pencil("Rosu", 1000);
        Pix1.write("Alex este notarul orasului 1 din 10.");

    }

}
