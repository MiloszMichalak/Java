import java.util.Scanner;

public class Zycie {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("Napisz 'koniec' aby zakonczyc dzialanie programu");
        System.out.println();

        System.out.print("Podaj swoj budzet: ");
        int budzet = input.nextInt();
        System.out.println();

        Czlowiek Czarek = new Czlowiek(budzet);

        System.out.println("Mozesz popelnic samobojstwo piszac: 'die'" );

        while (true) {
            System.out.print("Jak chcesz zarobic: pracuj, kradnij, wyrwij = ");
            String zarobek = input.next();

            if (zarobek.equals("koniec")){
                break;
            }

            switch (zarobek) {
                case "pracuj" -> budzet = Czarek.pracuj(budzet);
                case "kradnij" -> budzet = Czarek.kradnij(budzet);
                case "wyrwij" -> budzet = Czarek.wyrwijAlternatywke(budzet);
                case "die" -> { Czarek.samobojstwo(); return; }
            }
        }
    }
}
