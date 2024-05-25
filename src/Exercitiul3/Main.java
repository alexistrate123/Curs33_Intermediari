package Exercitiul3;

public class Main {
    public static void main(String[] args) {
        /*
           Creeaza clasa Door cu urmatoarele campuri: Sting culoare; String material, int inaltime; int latime;
           introdu pe usa un obiect de diferite masuri si verifica cati cm iti raman liberi cand intra pe usa
           si afiseaza mesajele urmatoare, daca incape : " Au ramas atatia cm liberi " si daca obiectul este fix cat usa
           atunci sa se afiseze mesajul: "Obiectul a intrat la fix " daca este mai mare decat usa = " Obiectul este mai mare
           decat usa cu atati cm "
           metoda introduObiectul() cu parametrii inaltime si latime.
        */

        Door usaIntrare = new Door("Maro", "lemn");
        usaIntrare.introduObiectul(190, 110);



    }
}
