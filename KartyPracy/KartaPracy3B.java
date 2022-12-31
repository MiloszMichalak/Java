import java.util.Scanner;

public class KartaPracy3B {
    public static void main(String[] args) {
        Scanner input;
        int n, n_liczb, k, m, kapital, lataInw, suma=0;

        //Zadanie 1
        System.out.println("Zadanie 1");
        for (int i = 0; i < 31; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2");
        input = new Scanner(System.in);
        System.out.print("Podaj zakres petli: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i%2 == 1)
                System.out.print((int)Math.pow(i,2) + " ");
        }

        System.out.println();

        //Zadanie 3
        System.out.println("Zadanie 3");
        for (int i = 1000; i < 10000; i++) {
            if (i%379 == 0)
                System.out.print(i + " ");
        }

        //Zadanie 4
        System.out.println("Zadanie 4");
        for (int i = 100; i < 1000; i++) {
            if (i%5 == 0 || i%6 == 0 || i%11 == 0)
                System.out.print(i + " ");
        }

        //Zadanie 5
        System.out.println("Zadanie 5");
        input = new Scanner(System.in);
        System.out.print("Ile liczb chcesz podac?: ");
        n = input.nextInt();
        suma = 0;
        for (int i = 0; i < n; i++) {
            n_liczb = input.nextInt();
            suma+=n_liczb;
        }
        System.out.println(suma);

        //Zadanie 6
        System.out.println("Zadanie 6");
        input = new Scanner(System.in);
        k = input.nextInt();
        for (int i = 0; i < k+1; i++) {
            if (i%2 == 0)
                suma+=i;
        }
        System.out.println("Suma liczb k poczatkowych liczb parzystych wynosi: " + suma);

        //Zadanie 7
        System.out.println("Zadanie 7");
        input = new Scanner(System.in);
        m = input.nextInt();
        suma = 0;
        for (int i = 10; i < m+10; i++) {
            if (i%2 == 1)
                suma+=i;
        }
        System.out.println("Suma liczb m poczatkowych dwucyfrowych liczb nieparzystych wynosi: " + suma);

        //Zadanie 8
        System.out.println("Zadanie 8");
        input = new Scanner(System.in);
        System.out.print("Podaj poczatkowy kapital: ");
        kapital = input.nextInt();
        System.out.print("Podaj lata inwestycji: ");
        lataInw = input.nextInt();
        for (int i = 0; i < lataInw; i++) {
            kapital*=1.06;
        }
        System.out.println("Koncowy kapital wynosi: " + kapital);

        //Zadanie 9
        System.out.println("Zadanie 9");
        input = new Scanner(System.in);
        n = input.nextInt();
        suma = 0;
        for (int i = 21; i <n*100 ; i+=100) {
            suma+=i;
        }
        System.out.println("suma poczatkowych liczb konczacych sie na 21 wynosi: " + suma);

        //Zadanie 10
        System.out.println("Zadanie 10");
        for (int i = 1; i < 1000; i++) {
            if (i%10 == Math.sqrt(i))
                System.out.print(i + " ");
            if (i%100 == Math.sqrt(i))
                System.out.print(i + " ");
        }
    }
}