import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.


        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00;
        //Urunlerin kilo fiyatlari

        double pearKilo, appleKilo, tomatoKilo, bananaKilo, aubergineKilo;

        //Kilo girdisi icin degiskenler

        Scanner inp = new Scanner(System.in);

        System.out.println("Kac kilo armut aldiniz ? (Kg fiyati 2.14) = ");

        pearKilo = inp.nextDouble();

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Kac kilo elma aldiniz ? (Kg fiyati 3.67) = ");

        appleKilo = inp1.nextDouble();

        Scanner inp2 = new Scanner(System.in);

        System.out.println("Kac kilo domates aldiniz ? (Kg fiyati 1.11) = ");

        tomatoKilo = inp2.nextDouble();

        Scanner inp3 = new Scanner(System.in);

        System.out.println("Kac kilo muz aldiniz ? (Kg fiyati 0.95) = ");

        bananaKilo = inp3.nextDouble();

        Scanner inp4 = new Scanner(System.in);

        System.out.println("Kac kilo patlican aldiniz ? (Kg fiyati 5.00) = ");

        aubergineKilo = inp4.nextDouble();

        double toplam;

        toplam = (pear * pearKilo) + (apple * appleKilo) + (tomato * tomatoKilo) + (banana * bananaKilo) + (aubergine * aubergineKilo);

        // Toplam alisveris tutari hesaplama

        System.out.println("Toplam tutar = "+toplam +"TL");




    }
}