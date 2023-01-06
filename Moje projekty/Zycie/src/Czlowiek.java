import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Czlowiek {
    Scanner input = new Scanner(System.in);
    int budzet;

    Czlowiek(int budzet) {
        this.budzet = budzet;
    }

    public int pracuj(int budzet) throws InterruptedException {
        System.out.println("Jestes w pracy.");
        int zarobione = 0;
        int a = 1;
        while (a < 8) {
            budzet += 200;
            zarobione += 200;
            System.out.println("Pracujesz i zarabiasz. Twoj budzet wynosi: " + budzet);
            TimeUnit.SECONDS.sleep(1);
            a++;
        }
        System.out.print("Nadgodziny?: t/n = ");
        String nadgodziny = input.next();
        if (nadgodziny.equals("t")) {
            System.out.print("Ile godzin: ");
            int godziny = input.nextInt();
            if (a + godziny < 24) {
                while (godziny > 0) {
                    budzet += 300;
                    zarobione += 300;
                    System.out.println("Pracujesz na nadgodzinach i zarabiasz. Twoj budzet wynosi: " + budzet);
                    godziny--;
                    TimeUnit.SECONDS.sleep(2);
                }
            } else {
                System.out.println("chcesz pracowac ponad 24 godziny, jest to niemozliwe dla organizmu.");
            }
        }
        System.out.println("Dniowka skonczona. Teraz masz: " + budzet + " Zarobiles: " + zarobione);
        System.out.println();
        return budzet;
    }

    public int kradnij(int budzet) {
        Random randomKradnij = new Random();
        int procentKradnij = randomKradnij.nextInt(1, 100);
        if (procentKradnij < 60) {
            budzet += 2000;
            System.out.println("Udalo ci sie okrasc ludzi. Twoj budzet wynosi: " + budzet);
        } else {
            budzet -= 1000;
            System.out.println("Nie udalo ci sie okrasc ludzi. Twoj budzet wynosi: " + budzet);
        }
        System.out.println();
        return budzet;
    }

    // klasa zrobiona na potrzeby Czarka
    public int wyrwijAlternatywke(int budzet) {
        Random randomWyrwij = new Random();
        int procentWyrwij = randomWyrwij.nextInt(1, 100);
        if (procentWyrwij < 70) {
            budzet -= 1000;
            System.out.println("Wyrwales alternatywke. Twoj budzet wynosi: " + budzet);
        } else {
            budzet += 100;
            System.out.println("Nie wyrwales alternatywki. Twoj budzet wynosi: " + budzet);
        }
        System.out.println();
        return budzet;
    }

    public void smierc() throws InterruptedException {
        System.out.println("Puls: 0");
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
            TimeUnit.MILLISECONDS.sleep(200);
        }
    }

    public double biegnij (double odleglosc ,double waga) throws InterruptedException {
        double dystans = odleglosc;
        double km = 0.5;
        while (odleglosc>0){
            System.out.println("Przebiegles " + km + "km");
            odleglosc -= 0.5;
            km += 0.5;
            waga -= 0.25;
            TimeUnit.MILLISECONDS.sleep(400);
        }
        System.out.println("Po przebiegnieciu " + dystans + "km Twoja waga wynosi: " + waga + "kg");
        return waga;
    }

    public double silownia (int godziny, double waga) throws InterruptedException{
        int czas = 1;
        while (godziny > 0){
            System.out.println("Jestes na silowni: " + czas + " godziny");
            godziny--;
            waga -= 0.5;
            czas ++;
            TimeUnit.MILLISECONDS.sleep(600);
        }
        System.out.println("Po " + (czas-1) + " godzinach na silowni twoja waga wynosi: " + waga + "kg");
        return waga;
    }

    public double stanPoziomuNajedzenia(double poziomNajedzenia, double czas){
        while (czas>0){
            poziomNajedzenia-=0.3;
            czas--;
        }
        System.out.println("Po tej aktywnosci twoj poziom najedzenia wynosi: " + poziomNajedzenia);
        return poziomNajedzenia;
    }

}


