import java.util.Scanner;

public class Zycie {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        double dystans = 0;
        int CzasNaSilowni = 0;
        int budzet = 1000;
        double poziomNajedzenia = 8;

        System.out.println("Napisz 'koniec' aby zakonczyc dzialanie programu");
        System.out.println();

        System.out.print("Podaj swoja wage: ");
        double waga = input.nextInt();

        Czlowiek Czarek = new Czlowiek(budzet);

        System.out.println("Mozesz popelnic samobojstwo piszac: 'die'. Mozesz tez umrzec kiedy waga bedzie nizsza niz 40kg" );

        while (true) {
            System.out.print("Co chcesz zrobic? \n " +
                    "Zarabianie: pracuj, kradnij, wyrwij. \n " +
                    "Aktywnosc: biegnij, silownia. \n " +
                    "Jedzenie: zdrowo, zwyklyPosilek, mc. \n" +
                    "= ");
            String czynnosc = input.next();

            if (czynnosc.equals("koniec")){
                break;
            }

            switch (czynnosc) {
                //Zarabanie
                case "pracuj" -> budzet = Czarek.pracuj(budzet);
                case "kradnij" -> budzet = Czarek.kradnij(budzet);
                case "wyrwij" -> budzet = Czarek.wyrwijAlternatywke(budzet);
                //Aktywnosc
                case "biegnij" -> {
                    System.out.print("Ile kilometrow chcesz przebiec?: ");
                    double odleglosc = input.nextInt();
                    dystans += odleglosc;
                    waga = Czarek.biegnij(odleglosc, waga);
                    poziomNajedzenia =  Czarek.stanPoziomuNajedzenia(poziomNajedzenia, odleglosc);
                    System.out.println("Twoj calkowity przebiegniety dystans wynosi: " + dystans + "km \n");
                }
                case "silownia" -> {
                    System.out.print("Ile godzin chcesz byc na silowni: ");
                    int godziny = input.nextInt();
                    if (godziny>14){
                        System.out.println("Chcesz byc za duzo czasu na silowni i twoj organizm tego nie wytrzyma \n");
                        continue;
                    }
                    CzasNaSilowni += godziny;
                    waga = Czarek.silownia(godziny, waga);
                    poziomNajedzenia = Czarek.stanPoziomuNajedzenia(poziomNajedzenia ,godziny);
                    System.out.println("Twoj calkowity czas na silowni wynosi: " + CzasNaSilowni + " godzin \n");
                }
                //TODO system ilosci zjedzonego danego rodzaju jedzenia
                //Jedzenie
                case "zdrowo" -> {
                    waga+=0.5;
                    poziomNajedzenia+=0.3;
                    System.out.println("Po tym posilku twoja waga wynosi: " + waga + "kg. A twoj poziom najedzenia: " + poziomNajedzenia + "\n");
                }
                case "zwyklyPosilek" -> {
                    waga++;
                    poziomNajedzenia+=0.8;
                    System.out.println("Po tym posilku twoja waga wynosi: " + waga + "kg. A twoj poziom najedzenia: " + poziomNajedzenia + "\n");
                }
                case "mc" -> {
                    waga+=1.6;
                    poziomNajedzenia+=1;
                    System.out.println("Po tym posilku twoja waga wynosi: " + waga + "kg. A twoj poziom najedzenia: " + poziomNajedzenia + "\n");
                }
                case "die" -> {
                    System.out.println("Zabiles sie. Stan konta: 0"); Czarek.smierc(); return;
                }
            }
            if (waga < 40){
                System.out.println("Twoja waga spadla ponizej 40kg.");
                Czarek.smierc();
                break;
            }
            if (waga>120){
                System.out.println("Twoja waga jest za duza. Powinienes zaczac cwiczyc.");
                System.out.println();
            }

            if (poziomNajedzenia>12){
                System.out.println("Przejadles sie.");
                Czarek.smierc();
            }
            if (poziomNajedzenia>10){
                System.out.println("Jestes zbyt bardzo najedzony. Powienies przestac jesc");
                System.out.println();
            }
            if (poziomNajedzenia<3.5){
                System.out.println("Jestes bardzo glodny. Powiniene cos zjesc");
                System.out.println();
            }
            if (poziomNajedzenia<2){
                System.out.println("Umarles z glodu");
                Czarek.smierc();
            }

        }
    }
}
