import java.util.Scanner;

public class KartaPracy3While {
    public static void main(String[] args) {
        Scanner input;
        int n, p, x;
        int suma;
        int a, b, c;
        int fib1, fib2, sumafib;

        //Zadanie 1
        System.out.println("Zadanie 1");
        n = 15;
        x = 0;
        while (n>0){
            System.out.println((int)Math.pow(x, 3)+3);
            x++;
            n--;
        }

        //Zadanie 2
        System.out.println("Zadanie 2");
        n = 100;
        while (n<1000){
            if (n%15 == 0){
                System.out.println(n);
            }
            n++;
        }

        //Zadanie 3
        System.out.println("Zadanie 3");
        input = new Scanner(System.in);
        System.out.println("Podaj liczbe ktorej chcesz wypisac dzielniki");
        p = input.nextInt();
        n = 1;
        while (n<p){
            if (p%n == 0){
                System.out.println(n);
            }
            n++;
        }

        //Zadanie 4
        n = 10;
        suma = 0;
        while (n<100){
            suma+=n;
            n++;
        }

        //Zadanie 5
        suma = 0;
        n = 1;
        input = new Scanner(System.in);
        System.out.println("Podaj ile liczb bedziesz chcial podac");
        a = input.nextInt();
        while (n <= a) {
            suma+=n;
            n++;
        }

        b = 1;
        while (b<a){
            c = input.nextInt();
            suma -= c;
            b++;
        }
        System.out.println("Tajemnicza liczba to: " + suma);

        //Zadanie 6
        System.out.println("Zadanie 6");
        input = new Scanner(System.in);
        n = input.nextInt();
        a = 0;
        fib1 = 0;
        fib2 = 1;
        System.out.print(fib2);
        while (a<n){
            sumafib = fib1 + fib2;
            fib1 = fib2;
            fib2 = sumafib;
            System.out.print(sumafib + " ");
            a++;
        }
    }
}
