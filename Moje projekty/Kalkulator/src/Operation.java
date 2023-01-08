import java.util.Scanner;

public class Operation {
    static Scanner input = new Scanner(System.in);

    public static double nwd (double a, double b){
        while (a != b){
            if (a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    public static double nww (double a, double b){
        double iloczyn = a*b;
        return iloczyn/nwd(a, b);
    }

    public static double podajLiczbe() {
        System.out.print("Podaj liczbe: ");
        double liczba = input.nextDouble();
        return liczba;
    }

}
