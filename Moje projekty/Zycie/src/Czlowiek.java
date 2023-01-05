import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Czlowiek {

    int budzet;

    Czlowiek(int budzet) {
        this.budzet = budzet;
    }

    public int pracuj(int budzet) throws InterruptedException {
        Scanner input = new Scanner(System.in);
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
        if (procentWyrwij > 30) {
            budzet -= 1000;
            System.out.println("Wyrwales alternatywke. Twoj budzet wynosi: " + budzet);
        } else {
            budzet += 100;
            System.out.println("Nie wyrwales alternatywki. Twoj budzet wynosi: " + budzet);
        }
        System.out.println();
        return budzet;
    }

    public void samobojstwo() throws InterruptedException {
        System.out.println("Zabiles sie. Stan konta: 0");
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
            TimeUnit.MILLISECONDS.sleep(200);
        }
    }
}


