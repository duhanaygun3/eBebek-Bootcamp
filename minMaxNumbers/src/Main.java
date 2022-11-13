import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        /*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
         ve bu sayıları ekrana yazan programı yazın.
         */

        int n, number, maxValue=1, minValue=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi adedini giriniz = ");

        n = inp.nextInt();

        if(n==1){
            System.out.println("Buyuk kucuk karsilastirmasi icin minimum 2 sayi girisi yapmaniz gerekmektedir.");
            return;
        }

        for(int i=1; i<=n; i++){
            System.out.println(i+" . sayiyi giriniz = ");
            number = inp.nextInt();

            if(number > maxValue){
                maxValue = number;
            }
            if(number < minValue){
                minValue = number;
            }

        }

        System.out.println("Girdiginiz en buyuk sayi = "+maxValue);
        System.out.println("Girdiginiz en kucuk sayi = "+minValue);








    }
}