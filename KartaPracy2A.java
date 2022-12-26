import java.util.Scanner;

public class KartaPracy2A {
    public static void main(String[] args) {
        int a, b, c, d, g, k, l, m;
        Scanner input;

        //Zadanie 1
        System.out.println("Zadanie 1");
        input = new Scanner(System.in);
        a = input.nextInt();
        if (a % 2 == 0)
            System.out.println("TAK, liczba jest parzysta");
        else
            System.out.println("NIE, liczba nie jest parzysta");

        //Zadanie 2
        System.out.println("Zadanie 2");
        input = new Scanner(System.in);
        a = input.nextInt();
        g = input.nextInt();
        if ((a + g) / 2 > Math.sqrt(a * g))
            System.out.println("Srednia arytmetyczna jest wieksza od sredniej geometrycznej");
        else
            System.out.println("Srednia geometryczna jest wieksza od sredniej arytmnetycznej");

        //Zadanie 3
        System.out.println("Zadanie 3");
        input = new Scanner(System.in);
        System.out.print("Podaj liczbe1: ");
        k = input.nextInt();
        System.out.print("Podaj liczbe2: ");
        l = input.nextInt();
        System.out.print("Podaj liczbe3: ");
        m = input.nextInt();
        if (k == l || l == m || m == k) {
            System.out.print("Sa liczby sobie rowne. ");
            if (k == l && l == m && m == k)
                System.out.print("Sa to wszystkie liczby");
            else if (k == l)
                System.out.print("Jest to Liczba 1 i liczba 2");
            else if (l == m)
                System.out.print("Jest to Liczba 2 i liczba 3");
            else if (m == k)
                System.out.print("Jest to Liczba 1 i liczba 3 ");
        } else {
            System.out.print("Nie ma liczb sobie rownych");
        }


        System.out.println();

        //Zadanie 4
        System.out.println("Zadanie 4");
        input = new Scanner(System.in);
        System.out.print("Podaj liczbe1: ");
        a = input.nextInt();
        System.out.print("Podaj liczbe2: ");
        b = input.nextInt();
        System.out.print("Podaj liczbe3: ");
        c = input.nextInt();
        System.out.print("Podaj liczbe4: ");
        d = input.nextInt();
        if (a < b && a < c && a < d)
            System.out.println("Najmniejsza liczba jest liczba1");
        else if (b < a && b < c && b < d)
            System.out.println("Najmniejsza liczba jest liczba2");
        else if (c < a && c < b && c < d)
            System.out.println("Najmniejsza liczba jest liczba3");
        else if (d < a && d < b && d < c)
            System.out.println("Najmniejsza liczba jest liczba4");
        else
            System.out.println("Wszystkie liczby sa sobie rowne");

        //Zadanie 5
        System.out.println("Zadanie 5");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a + b > c || b + c > a || c + a > b)
            System.out.println("Powstanie trojkat z tych liczb");
        else
            System.out.println("Trojkat nie powstanie");

        //Zadanie 6
        System.out.println("Zadanie 6");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a + b > c || a + c > b || b + c > a) {
            System.out.print("Trojkat powstanie i bedzie to trojkat ");
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
                System.out.print("prostokatny");
            else if (a * a + b * b > c * c || a * a + c * c > b * b || b * b + c * c > a * a)
                System.out.print("ostrokatny");
            else
                System.out.print("rozwartokatny");
        } else
            System.out.println("Trojkat nie powstanie");
    }
}