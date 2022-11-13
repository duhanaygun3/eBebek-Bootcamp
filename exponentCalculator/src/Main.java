import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        /*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
         programı "For Döngüsü" kullanarak yapınız.
         */

        int number, pow, result=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Us almak istediginiz sayiyi giriniz = ");

        number = inp.nextInt();

        System.out.println("Us degerini giriniz = ");

        pow = inp.nextInt();

        for(int i=1; i<=pow; i++){
            result = result * number;
            System.out.println(i+" . dereceden degeri = "+ result);
        }








    }
}