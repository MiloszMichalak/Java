import java.util.Random;

public class TabliceDwumymiarowe {
    public static void main(String[] args) {
        int suma;
        int nparz;

        // Stworz tablice 100 losowych liczb 2 cyfrowych

        int n = 100;
        int pocz = 10;
        int kon = 99;

        int[] T = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            T[i] = r.nextInt(pocz, kon);
        }

        // Podaj sume liczb parzystych i ilosc liczb nieparzystych
        suma = 0;
        nparz = 0;
        for (int i : T) {
            if (T[i] % 2 == 0)
                suma += T[i];
            else
                nparz++;
        }
        System.out.println("Suma liczb nieparzystych w tej tablicy wynosi: " + suma + " Ilosc liczb nie parzystych wynosi: " + nparz);

        System.out.println();

        //Tablice 2-wymiarowe
        int[][] T2D = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(T2D[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //Zadeklaruj macierz a'la sudoku
        int[][] T2D2 = new int[][] { {1, 2 ,3}, {4, 5, 6}, {7, 8, 9} };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(T2D2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //Zadeklaruj macierz 4x4 z losowymi liczbami
        int[][] T2D3 = new int[4][4];
        Random x = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(T2D3[i][j] = x.nextInt(0, 99));
                System.out.print("\t");
            }
            System.out.println();
        }

        //Dobra rozpiska
        int kolumny = 5;
        int wiersze = 3;
        int[][] cos = new int[kolumny][wiersze];
        Random y = new Random();
        for (int i = 0; i < kolumny; i++) {
            for (int j = 0; j < wiersze; j++) {
                System.out.print(cos[i][j] = y.nextInt(pocz, kon));
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
