package Exercitiul3;

public class Door {

    int inaltimeObiect = 160;
    int latimeObiect = 90;

    String culoare;
    String material;
    int inaltime;
    int latime;


    public Door(String culoare, String material) {
        this.culoare = culoare;
        this.material = material;
        this.inaltime = -200;
        this.latime = -100;
    }


    // introdu un obiect de tip masa, cu inaltimea de 160, si latimea de 90
    // verific intai daca incape, comparand sau scazand dimesiunile usii cu dimensiunile obiectului introdus
    public void introduObiectul(int inaltimeObiect, int latimeObiect) {
        if (this.inaltime > inaltimeObiect && this.latime > latimeObiect) {
            this.inaltime += inaltimeObiect;
            this.latime += latimeObiect;
            System.out.println("Obiectul a incaput si au mai ramas: " + inaltime + " cm inaltime si  " +
                    latime + " cm latime.");
        }else if (this.inaltime == inaltimeObiect && this.latime == latimeObiect) {
            this.inaltime = inaltimeObiect;
            this.latime = latimeObiect;
            System.out.println("Obiectul incape la fix, avand " + this.inaltime + " cm inaltime si " + this.latime +
                    " cm latime.");
        } else {
            inaltimeObiect -= this.inaltime;
            latimeObiect -= this.latime;
            System.out.println("Obiectul este mai mare decat usa cu " + inaltimeObiect + " de cm inaltime si cu "
                    + latimeObiect + " cm latime.");
        }
/*

else if (this.inaltime == inaltimeObiect && this.latime < latimeObiect) {
            this.inaltime = inaltimeObiect;
            latimeObiect -= this.latime;
            System.out.println("Obiectul nu incape deoarece este mai mare decat usa cu " + latimeObiect + " cm latime si " +
                    "egal cu inaltimea usii, mai exact " + inaltimeObiect + " cm inaltime");

        }
        if (this.inaltime < inaltimeObiect && this.latime < latimeObiect) {
            inaltimeObiect -= this.inaltime;
            latimeObiect -= this.latime;
            System.out.println("Obiectul este mai mare decat usa cu " + inaltimeObiect + " de cm inaltime si cu "
                    + latimeObiect + " cm latime.");

        }

        if (this.inaltime < inaltimeObiect && this.latime > latimeObiect) {
            inaltimeObiect -= this.inaltime;
            this.latime -= latimeObiect;
            System.out.println("Obiectul nu incape deoarece este mai mare decat usa cu " + inaltimeObiect + " cm inaltime.");
        }

        if (this.inaltime > inaltimeObiect && this.latime < latimeObiect) {
            this.inaltime -= inaltimeObiect;
            latimeObiect -= this.latime;
            System.out.println("Obiectul nu incape deoarece este mai mare decat usa cu " + latimeObiect + " cm latime.");

        }


        if (this.inaltime < inaltimeObiect && this.latime == latimeObiect) {
            inaltimeObiect -= this.inaltime;
            latimeObiect = this.latime;
            System.out.println("Obiectul nu incape deoarece este mai mare decat usa cu " + inaltimeObiect + " cm inaltime si " +
                    "egal cu latimea usii, mai exact " + latimeObiect + " cm latime");
        }



 */


    }
}
