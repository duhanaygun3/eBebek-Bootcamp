import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        /*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
         yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
         Örnek
         Basamak Sayısı : 10
         *******************
          *****************
           ***************
            *************
             ***********
              *********
               *******
                *****
                 ***
                  *
         */

        int digit;

        Scanner inp = new Scanner(System.in);

        System.out.println("Basamak sayisini giriniz = ");

        digit = inp.nextInt();

        for (int i=digit;i>0;i--){
            for (int j=digit-i;j>0;j--){
                System.out.print(" ");
            }

            for (int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}