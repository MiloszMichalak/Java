import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wynik = 0;

        boolean flaga = true;
        while (flaga){
            System.out.println("Koniec?: y/n");
            String KoniecProgramu = input.next();
            if (KoniecProgramu.equals("y")){
                System.out.println("Dziekuje za uzywanie mojego kalkulatora");
                flaga = false;
                continue;
            }

            System.out.println("Jaki operator ma byc? : +, -, *, /, nww, nwd, sqrt, pow");
            String operator = input.next();

            switch (operator) {
                case "+" -> {
                    System.out.println("Podaj liczbe:");
                    double liczba = input.nextDouble();
                    wynik += liczba;
                    System.out.println("Suma tych liczb wynosi: " + wynik);
                }
                case "-" -> {
                    System.out.println("Podaj liczbe:");
                    double liczba = input.nextDouble();
                    wynik -= liczba;
                    System.out.println("Roznica tych liczb wynosi: " + wynik);
                }
                case "*" -> {
                    System.out.println("Podaj liczbe:");
                    double liczba = input.nextDouble();
                    wynik *= liczba;
                    System.out.println("Iloczyn tych liczb wynosi: " + wynik);
                }
                case "/" -> {
                    System.out.println("Podaj liczbe:");
                    double liczba = input.nextDouble();
                    wynik /= liczba;
                    System.out.println("Iloraz tych liczb wynosi: " + wynik);
                }
                case "nwd" -> {
                    System.out.println("Podaj liczbe:");
                    double liczba = input.nextDouble();
                    System.out.println(Operation.nwd(wynik, liczba));
                }
                case "nww" -> {
                    System.out.println("Podaj liczbe:");
                    double liczba = input.nextDouble();
                    System.out.println(Operation.nww(wynik, liczba));
                }
                case "sqrt" -> {
                    wynik = Math.sqrt(wynik);
                    System.out.println("Pierwiastek tej liczby to: " + wynik);
                }
                case "pow" -> {
                    System.out.println("Do jakies potegi chcesz podniesc liczbe?");
                    int potega = input.nextInt();
                    wynik = Math.pow(wynik, potega);
                    System.out.println("Ta liczba podniesiona do potegi wynosi: " + wynik);
                }
                default -> System.out.println("Zle wejscie");
            }
        }
    }
}
