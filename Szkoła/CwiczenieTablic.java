import java.util.Random;
import java.util.Scanner;

public class CwiczenieTablic {

    public static void main(String[] args) {
        /*
        Wygeneruj tablicę n losowych liczb:
        1. Znajdź największą liczbę w tablicy
        2. Znajdź najmniejszą liczbę w tablicy
        3. Podaj ile razy występuje najwieksza liczba w tablicy
        4. Podaj ile razy występuje najmniejsza liczba w tablicy
        5. Podaj rozpiętość tablicy (różnica max - min)
        6. Podaj sumę liczb w tablicy
        7. Podaj średnią wartość liczb w tablicy
        8. Których liczb jest więcej w tablicy: parzystych czy nieparzystych?
        9. Ile w tablicy jest liczb pierwszych?
        10. Podaj v-ce max i v-ce min liczb tablicy
        */
        Scanner input;
        int max, min, ile = 0, roznica, suma, srednia, parz = 0, nparz = 0, pierwsze, temp;

        input = new Scanner(System.in);
        System.out.print("Podaj ile liczb ma miec tablica: ");
        int ilerazy = input.nextInt();
        System.out.print("Podaj od jakiej liczby ma losowac tablice: ");
        int pocz = input.nextInt();
        System.out.print("Podaj do jakiej liczby ma losowac tablice: ");
        int kon = input.nextInt();


        int[] T = new int[ilerazy];
        Random r = new Random();
        System.out.println("Tablica: ");
        for (int i = 0; i < ilerazy; i++) {
            T[i] = r.nextInt(pocz, kon);
            System.out.println(T[i]);
        }

/*
        //Zadanie 1. Znajdź największą liczbę w tablicy
        max = T[0];
        for (int k : T) {
            if (T[k] > max)
                max = T[k];
        }
        System.out.println("Najwieksza liczba w tej tablicy wynosi: " + max);

        //Zadanie 2. Znajdź najmniejszą liczbę w tablicy
        min = T[0];
        for (int i : T) {
            if (T[i] < min)
                min = T[i];
        }
        System.out.println("Najmniejsza liczba w tej tablicy wynosi: " + min);

        //Zadanie 3. Podaj ile razy występuje najwieksza liczba w tablicy
        max = T[0];
        ile = 0;
        for (int i : T) {
            if (T[i] > max)
                max = T[i];
        }
        for (int i : T) {
            if (T[i] == max)
                ile++;
        }
        System.out.println("W tej tablicy max wystepuje: " + max + " razy");

        //Zadanie 4. Podaj ile razy występuje najmniejsza liczba w tablicy
        min = T[0];
        ile = 0;
        for (int i : T) {
            if (T[i] < min)
                min = T[i];
        }
        for (int i : T) {
            if (T[i] == min)
                ile++;
        }

        //Zadanie 5. Podaj rozpiętość tablicy (różnica max - min)
        max = T[0];
        min = T[0];
        for (int i : T) {
            if (T[i] > max) {
                max = T[i];
            }
        }
        for (int i : T) {
            if (T[i]<min)
                min = T[i];
        }
        roznica = max-min;
        System.out.println("Rozpietosc tablicy(max-min) wynosi: " + roznica);

        //Zadanie 6. Podaj sumę liczb w tablicy
        suma = 0;
        for (int i : T)
            suma+=T[i];
        System.out.println("Suma liczb w tej tablicy wynosi: "+suma);

        //Zadanie 7. Podaj średnią wartość liczb w tablicy
        ile = 0;
        suma = 0;
        for (int i : T)
            suma+=T[i];
            ile++;
        srednia = suma/ile;
        System.out.println("Srednia liczb w tej tablicy wynosi: "+srednia);

        //Zadanie 8. Których liczb jest więcej w tablicy: parzystych czy nieparzystych?
        for (int i : T)
            if (T[i]%2 == 0)
                parz++;
            else
                nparz++;
        if (parz>nparz)
            System.out.println("Wiecej jest liczb parzystych. Jest ich: "+parz);
        else
            System.out.println("Wiecej jest liczb nieparzystych. Jest ich"+nparz);
*/
        //Zadanie 9. Ile w tablicy jest liczb pierwszych?
        pierwsze = 0;
        temp = 0;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (T[i] % 2 == 0) {
                    pierwsze++;
                }
                if (pierwsze < 3) {
                    temp++;
                }
            }
            System.out.println("Liczb pierwszych w tej tablicy jest: " + temp);

            //Zadanie 10

        }
    }
}