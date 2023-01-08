import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wynik = 0;

        while (true){
            System.out.println("Napisz koniec aby zakonczyc dzialanie kalkulatora \n" +
                    " Jaki operator ma byc? : +, -, *, /, nww, nwd, sqrt, pow");
            String operator = input.next();

            if (operator.equals("koniec")){
                System.out.println("Dziekuje za uzywanie mojego kalkulatora");
                break;
            }

            switch (operator) {
                case "+" -> {
                    double liczba = Operation.podajLiczbe();
                    wynik += liczba;
                    System.out.println("Suma tych liczb wynosi: " + wynik);
                }
                case "-" -> {
                    double liczba = Operation.podajLiczbe();
                    wynik -= liczba;
                    System.out.println("Roznica tych liczb wynosi: " + wynik);
                }
                case "*" -> {
                    double liczba = Operation.podajLiczbe();
                    wynik *= liczba;
                    System.out.println("Iloczyn tych liczb wynosi: " + wynik);
                }
                case "/" -> {
                    double liczba = Operation.podajLiczbe();
                    wynik /= liczba;
                    System.out.println("Iloraz tych liczb wynosi: " + wynik);
                }
                case "nwd" -> {
                    double liczba = Operation.podajLiczbe();
                    System.out.println(Operation.nwd(wynik, liczba));
                }
                case "nww" -> {
                    double liczba = Operation.podajLiczbe();
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
