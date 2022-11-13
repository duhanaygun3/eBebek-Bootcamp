import java.util.Scanner;

public class Main {

    //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

    /* Kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
      Senaryo

      Sayı Giriniz : 22
      22 sayısı ASAL değildir !

      Sayı Giriniz : 2
      2 sayısı ASALDIR !
     */

    static void f(int n){
        int number = 0;
        for (int j = 1; j<=n; j++){
            if (n % j == 0){
                number++;
            }
        }
        if (number == 2){
            System.out.println(n+ " sayisi asaldir");
        }else {
            System.out.println(n+ " sayisi asal degildir.");
        }
        return;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int n = input.nextInt();
        f(n);

    }

}