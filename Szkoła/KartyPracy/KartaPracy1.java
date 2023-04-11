import java.util.Scanner;

public class KartaPracy1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int brutto;
        Scanner input;


        //Zadanie 1
        System.out.println("Zadanie 1");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("A do kwadratu dodac B do kwadratu to: " + Math.pow(a,2) + Math.pow(b,2));

        //Zadanie 2
        System.out.println("Zadanie 2");
        input = new Scanner((System.in));
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Kwadrat dodanych liczb a i b wynosi: " + Math.pow((a+b),2));

        //Zadanie 3
        System.out.println("Zadanie 3");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Szescian odjetych od siebie a i b wynosi: " + Math.pow((a-b),3));

        //Zadanie 4
        System.out.println("Zadanie 3");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        System.out.println("Pomnozone liczby a b c daja: " + a*b*c);

        //Zadanie 5
        System.out.println("Zadanie 5");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Dwadziescia procent podwojonej sumy dwóch a i b wynosi: ");
        System.out.print("Sposob 1: " + 2*(a+b)/5 + " " + "Sposob 2: " + (a+b)*0.4);

        //Zadanie 6
        System.out.println("Zadanie 6");
        input = new Scanner(System.in);
        brutto = input.nextInt();
        System.out.print(brutto / 1.23);

        //Zadanie 7
        System.out.println("Zadanie 7");
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(a % b);
    }
}