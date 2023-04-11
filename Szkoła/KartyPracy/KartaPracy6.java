import java.util.Scanner;

public class KartaPracy6 {
    public static void main(String[] args){
        int a, b, c, n, suma, dzielnik, ilosc, rytm, iloczyn, silnia, licznik, mianownik, ciag1, ciag2, fib1, fib2, sumafib;
        Scanner input = new Scanner(System.in);

        //Zadanie 1

        System.out.println("Zadanie 1");
        System.out.print("Podaj liczbe1: ");
        a = input.nextInt();
        System.out.print("Podaj liczbe2: ");
        b = input.nextInt();
        System.out.print("Podaj liczbe3: ");
        c = input.nextInt();

        System.out.print("Ciag jest: ");
        if (b - a == c - b) System.out.print("arytmetyczny ");
        if (b / a == c / b) System.out.print("geometryczny ");
        if (a < b && b < c) System.out.print("rosnący ");
        if (a > b && b > c) System.out.print("malejacy ");

        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2");
        suma = 0;
        for (int i = 100; i < 1000; i++) {
            if (i%8 == 0 && i%16 != 0){
                suma+=i;
            }
        }
        System.out.println("Suma liczb podzielnych przez 8 i niepodzielnych przez 16 wynosi: " + suma);

        System.out.println();

        //Zadanie 3
        System.out.println("Zadanie 3");
        dzielnik = 0;
        for (int i = 100; i > 10 ; i--) {
            if (i % 7 == 0){
                dzielnik = i;
                break;
            }
        }

        System.out.println();

        ilosc = 0;
        for (int i = 1000; i < 10000; i++) {
            if (i % dzielnik == 0){
                ilosc++;
            }
        }
        System.out.println("Ilosc liczb bedacymi wielokrotnociami najwiekszej liczby dwucyfrowej podzielnej przez 7 wynosi: " + ilosc);

        System.out.println();

        //Zadanie 4
        System.out.println("Zadanie 4");
        ilosc = 0;
        for (int i = 10; i < 100; i++) {
            if ((int)i/10>(i%10)*2){
                ilosc++;
            }
        }
        System.out.println("Ilosc liczb dwucryfrowych w ktorych liczba dziesiatek jest przynajmniej 2 razy wieksza od liczby jednosci wynosi: " + ilosc);

        System.out.println();

        //Zadanie 5
        System.out.println("Zadanie 5");
        suma = 0;
        ilosc = 0;
        for (int i = 100; i < 1000; i++) {
            if ((int)i/100>(i%100)/10+i%10){
                suma+=i;
                ilosc++;
            }
        }
        System.out.println("Suma liczb trzycyfrowych w ktorych liczba setek jest przynajmniej 2 razy wieksza od sumy liczby dziesiatek i jednosci wynosi: " + suma + " A illosc takich liczb wynosi: " + ilosc);

        System.out.println();

        //Zadanie 6
        System.out.println("Zadanie 6");
        System.out.println("Podaj ile liczb chcesz znalesc:");
        n = input.nextInt();
        suma = 0;
        ilosc = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 19 == 0){
                suma+=i;
                ilosc++;
            }
            if (ilosc == n){
                System.out.println("Suma n najmniejszych liczb dwucyfrowych podzielnych przez 19 wynosi: " + suma);
                break;
            }
            if (i == 99){
                System.out.println("Out o range");
            }
        }

        System.out.println();

        //Zadanie 7
        System.out.println("Zadanie 7");
        System.out.println("Podaj ile liczb chcesz znalesc:");
        n = input.nextInt();
        suma = 0;
        ilosc = 0;
        for (int i = 999; i > 100 ; i--) {
            if (i % 37 == 0){
                suma+=i;
                ilosc++;
            }
            if (ilosc == n){
                System.out.println("Suma n najwiekszych liczb trzycyfrowych podzielnych przez 37 wynosi: " + suma);
            }
            if (i == 101){
                System.out.println("Out of range");
            }
        }

        System.out.println();

        //Zadanie 8
        System.out.println("Zadanie 8");
        System.out.println("Podaj jak dlugi ma byc ciag:");
        n = input.nextInt();
        suma = 0;
        rytm = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                suma += rytm;
            }
            else {
                rytm*=-1;
                suma+=rytm;
                rytm*=-1;
            }
            rytm+=3;
        }
        System.out.println("Suma n elementow ciagu skaczacego wynosi: " + suma);

        System.out.println();

        //Zadanie 9
        System.out.println("Zadanie 9");
        System.out.println("Podaj jak dlugi ma byc ciag:");
        n = input.nextInt();
        iloczyn = 1;
        rytm = 2;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0){
                rytm*=-1;
                iloczyn*=rytm;
                rytm*=-1;
            }
            else {
                iloczyn*=rytm;
            }
            rytm = (int) Math.pow(2, i);
        }
        System.out.println("Suma n elementow ciagu zakreconego wynosi: " + iloczyn);

        System.out.println();

        //Zadanie 10
        System.out.println("Zadanie 10");
        System.out.println("Podaj jak dlugi ma byc ciag");
        n = input.nextInt();
        suma = 0;
        rytm = 1;
        silnia = 1;
        for (int i = 0; i < n; i++) {
            suma+=silnia;
            rytm++;
            silnia*=rytm;
        }
        System.out.println("Iloczyn n elementow ciagu silaczy wynosi: " + suma);

        System.out.println();

        //Zadanie 11
        System.out.println("Zadanie 11");
        System.out.println("Podaj jak dlugi ma byc ciag");
        n = input.nextInt();
        float Floatsuma = 0;
        licznik = 1;
        mianownik = 1;
        for (int i = 0; i < n; i++) {
            suma += licznik/mianownik;
            licznik+=2;
            mianownik+=licznik;
        }
        System.out.println("Suma n elementow ciagu niebanalnego1 wynosi: " + Floatsuma);

        System.out.println();

        //Zadanie 12
        System.out.println("Zadanie 12");
        System.out.println("Podaj jak dlugi ma byc ten ciag");
        n = input.nextInt();
        licznik = 0;
        mianownik = 0;
        ciag1 = 1;
        ciag2 = 1;
        for (int i = 0; i < n; i++) {
            licznik+=ciag1;
            mianownik+=ciag2;
            ciag1+=2;
            ciag2+=ciag1;
        }
        System.out.println("Suma n elementow ciagu niebanalnego2 wynosi: " + (float)licznik/mianownik);

        System.out.println();

        //Zadanie 13 i 14
        System.out.println("Zadanie 13 i 14");
        System.out.println("Podaj jak dlugi ma byc ten ciag:");
        n = input.nextInt();
        suma = 0;
        licznik = 2;
        mianownik = 3;
        for (int i = 2; i < n+2; i++) {
            Floatsuma += licznik / mianownik;
            licznik+=2;
            mianownik = (int)(Math.pow(i, 3)+2);
        }
        System.out.println("Suma n elementow ciagu wymagajacego wynosi: " + suma);

        System.out.println();

        //Zadanie 15
        System.out.println("Zadanie 15");
        System.out.println("Podaj jak dlugi ma byc ten ciag:");
        n = input.nextInt();
        licznik = 1;
        mianownik = 1;
        ciag1 = 1;
        ciag2 = 1;
        for (int i = 0; i < n; i++) {
            licznik *= ciag1;
            mianownik *= ciag2;
            ciag1++;
            ciag2 = (ciag2*2)+1;
        }
        System.out.println("Iloczyn n elementow ciagu totalnego wynosi: " + (float)licznik/mianownik);

        System.out.println();

        //Zadanie 16
        System.out.println("Zadanie 16");
        System.out.println("Podaj jak dlugi ma byc ciag:");
        n = input.nextInt();
        fib1 = 1;
        fib2 = 1;
        rytm = 1;
        mianownik = 1;
        licznik = 1;
        for (int i = 0; i < n; i++) {
            licznik *= sumafib;
            mianownik *= 2;
            sumafib = fib1 + fib2;
            fib1 = fib2;
            fib2 = sumafib;
            rytm++;
        }
        System.out.println("Iloczyn n elemntow ciagu ekstrelamnego wynosi: " + (float)licznik/mianownik);
    }
}
