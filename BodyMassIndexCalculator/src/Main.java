import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.


        double length, kilo;


        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz (Ornek: 1,75) = ");

        length = inp.nextDouble();

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Lutfen kilogram cinsinden kilonuzu giriniz (Ornek: 75) = ");

        Scanner inp2 = new Scanner(System.in);

        kilo = inp2.nextDouble();

        double bmi = kilo / (length*length);

        //bmi = Body Mass Index

        System.out.println("Vucut kitle indeksiniz / bmi = " + bmi);






    }
}