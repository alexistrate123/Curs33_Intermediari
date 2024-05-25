package Exercitiu2;

public class Pencil {
    String color;
    int remainingInk;

    public Pencil(String color, int remainingInk) {
        this.color = color;
        this.remainingInk = remainingInk;
    }

    // daca cerneala ramasa este egala cu lungimea textului decrementeaza cu 1 si afisez mesajul de mai jos...
    // daca o litera/numar egal 1 cerneala atunci lungimea textului ar trebui sa fie scazuta din capacitatea totala.
    // vreau sa scad lungimea textului din capacitatea totala a cernelei.
    public void write(String text) {
        remainingInk -= text.length();
        System.out.println("Mai am " + remainingInk + " puncte de cerneala.");
    }
}
