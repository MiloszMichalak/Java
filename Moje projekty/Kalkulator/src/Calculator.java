import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wynik = 0;

        System.out.println("Napisz 'koniec' aby zakonczyc dzialanie kalkulatora");

        while (true){
            System.out.println("Jaki operator ma byc? : +, -, *, /, nww, nwd, sqrt, pow:");
            String operator = input.next();

            if (operator.equals("koniec")){
                System.out.println("Dziekuje za uzywanie mojego kalkulatora");
                break;
            }

            switch (operator) {
                case "+" -> {
                    wynik += Operation.podajLiczbe();
                    System.out.println("Suma tych liczb wynosi: " + wynik);
                }
                case "-" -> {
                    wynik -= Operation.podajLiczbe();
                    System.out.println("Roznica tych liczb wynosi: " + wynik);
                }
                case "*" -> {
                    wynik *= Operation.podajLiczbe();
                    System.out.println("Iloczyn tych liczb wynosi: " + wynik);
                }
                case "/" -> {
                    wynik /= Operation.podajLiczbe();
                    System.out.println("Iloraz tych liczb wynosi: " + wynik);
                }
                case "nwd" -> Operation.obliczanieNwd(wynik);
                case "nww" -> Operation.obliczanieNWW(wynik);
                case "sqrt" -> {
                    wynik = Math.sqrt(Operation.podajLiczbe());
                    System.out.println("Pierwiastek tej liczby to: " + wynik);
                }
                case "pow" -> {
                    System.out.print("Do jakies potegi chcesz podniesc liczbe?: ");
                    int potega = input.nextInt();
                    wynik = Math.pow(Operation.podajLiczbe(), potega);
                    System.out.println("Ta liczba podniesiona do potegi wynosi: " + wynik);
                }
                default -> System.out.println("Zle wejscie");
            }
            System.out.println();
        }
    }
}
