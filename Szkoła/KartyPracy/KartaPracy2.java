import java.util.Scanner;

public class KartaPracy2 {
    public static void main(String[] args) {
        int a, b, c, p, k, s, wiek, waga, brakujace;
        Scanner input;

        //Zadanie 1
        System.out.println("Zadanie 1");
        input = new Scanner(System.in);
        a = input.nextInt();
        if (a%3 == 0)
        {
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }

        //Zadanie 2
        System.out.println("Zadanie 2");
        input = new Scanner(System.in);
        a = input.nextInt();
        if (a>=100 && a<999 && a%3 == 0)
        {
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }

        //Zadanie 3
        System.out.println("Zadanie 3");
        input = new Scanner(System.in);
        wiek = input.nextInt();
        if (wiek>=18)
        {
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }

        //Zadanie 4
        System.out.println("Zadanie 4");
        final int limit = 0;
        input = new Scanner(System.in);
        waga = input.nextInt();
        if (waga>20)
        {
            System.out.println("Nie wjedziesz");
        }
        else
        {
            System.out.println("Wjedziesz");
        }

        //Zadanie 5
        System.out.println("Zadanie 5");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a<c && c<b || b<c && c<a)
        {
            System.out.println("Miesci sie");
        }
        else
        {
            System.out.println("Nie miesci sie");
        }

        //Zadanie 6
        System.out.println("Zadanie 6");
        input = new Scanner(System.in);
        a = input.nextInt();
        p = input.nextInt();
        if (Math.pow(a,p)-a%p == 0)
        {
            System.out.println("Liczba p spelnia warunek");
        }
        else
        {
            System.out.println("Liczba p nie spelnia warunku");
        }

        //Zadanie 7
        System.out.println("Zadanie 7");
        input = new Scanner(System.in);
        System.out.print("Podaj odleglosc poczatkowa zaby: ");
        p = input.nextInt();
        System.out.print("Podaj odleglosc koncowa zaby: ");
        k = input.nextInt();
        System.out.print("Podaj jaka odleglosc ma skoczyc zaba: ");
        s = input.nextInt();
        brakujace = Math.abs((p+s)-k);
        if (p+s >= k)
        {
            System.out.println("Zaba doskoczy. " + "Zaba przeskoczyla cel o: " + brakujace);
        }
        else
        {
            System.out.println("Zaba nie doskoczy. " + "Zabie braklo do przeskoczenia: " + brakujace);
        }
    }

}