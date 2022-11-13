import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
          değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.


          Mükemmel Sayı Nedir ?
          Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */

        int number, dividing=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz = ");

        number = inp.nextInt();

        for(int i =1; i<number;i++){
            if(number % i == 0){
                dividing+= i;
            }
        }

        if(dividing == number ){
            System.out.println(number+" Mukemmel sayidir");
        }else{
            System.out.println(number+" Mukemmel sayi degildir");
        }





    }
}