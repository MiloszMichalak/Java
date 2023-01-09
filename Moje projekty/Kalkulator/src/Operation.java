import java.util.Scanner;

public class Operation {
    private static final Scanner input = new Scanner(System.in);

    public static double obliczanieNwd (double wynik) {
        wynik = nwd(podajLiczbe1(), podajLiczbe2());
        System.out.println("Nwd tych liczb wynosi: " + wynik);
        return  wynik;
    }

    public static double obliczanieNWW (double wynik) {
        wynik = nww(podajLiczbe1(), podajLiczbe2());
        System.out.println("Nww tych liczb wynosi: " + wynik);
        return wynik;
    }

    public static double podajLiczbe () {
        System.out.print("Podaj liczbe na ktorej chcesz zrobic operacje: ");
        double liczba = input.nextDouble();
        return liczba;
    }

    private static double podajLiczbe1 () {
        System.out.print("Podaj 1 liczbe: ");
        double liczba1 = input.nextDouble();
        return liczba1;
    }

    private static double podajLiczbe2 () {
        System.out.print("Podaj 2 liczbe: ");
        double liczba2 = input.nextDouble();
        return liczba2;
    }

    private static double nwd (double a, double b){
        while (a != b){
            if (a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    private static double nww (double a, double b){
        double iloczyn = a*b;
        return iloczyn/nwd(a, b);
    }
}
