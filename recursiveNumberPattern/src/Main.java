import java.util.Scanner;

public class Main {


     //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

    /*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Y
    ine her ekleme işleminde sayının son değerini ekrana yazdırın.

    Senaryolar

    N Sayısı : 16
    Çıktısı : 16 11 6 1 -4 1 6 11 16

     */
    static void design(int n){
        if (n > 0){
            System.out.print(n + " ");

            design(n - 5);
        }System.out.print(n +" ");


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n = scan.nextInt();
        System.out.print("Ciktisi : ");
        design(n);
        System.out.println();

    }
}