import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        /* Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
          Senaryo
          2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
        */



        for (int i = 4; i < 100; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++)
            {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }


    }
}