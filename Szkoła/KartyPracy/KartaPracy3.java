import java.util.Scanner;

public class KartaPracy3 {
    public static void main(String[] args) {
        Scanner input;
        int p, n, a, x, b;
        int suma = 0;

        //Zadanie 1
        System.out.println("Zadanie 1");
        input = new Scanner(System.in);
        System.out.print("Podaj zakres petli: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((int) Math.pow(i, 3) + 3 + " ");
        }

        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2");
        for (int i = 100; i < 1000; i++) {
            if (i % 15 == 0)
                System.out.print(i + " ");
        }

        //Zadanie 3
        System.out.println("Zadanie 3");
        input = new Scanner(System.in);
        p = input.nextInt();
        for (int i = 1; i < p + 1; i++) {
            if (p % i == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        //Zadanie 4
        for (int i = 10; i < 100; i++) {
            suma+=i;
        }
        System.out.println("Suma liczb 2 cyfrowych wynosi: " + suma);

        //Zadanie 5
        System.out.println("Zadanie 5");
        input = new Scanner(System.in);
        System.out.print("Podaj ile liczb chcesz podac: ");
        a = input.nextInt();
        suma = 0;
        for (int i = 0; i < a+1; i++) {
            suma+=i;
        }
        for (int i = 0; i < a-1; i++) {
            x = input.nextInt();
            suma-=x;
        }
        System.out.println("Nie podales liczby: " + suma);

        //Zadanie 6
        System.out.println("Zadanie 6");
        input = new Scanner(System.in);
        System.out.print("Jak dlugi ma byc ten ciag? ");
        n = input.nextInt();
        a = 0;
        b = 1;
        suma = 0;
        for (int i = 0; i < n; i++) {
            suma = a+b;
            a = b;
            b = suma;
            System.out.print(a + " ");
        }
    }
}