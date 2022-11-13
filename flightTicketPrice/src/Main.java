import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        int distance, age, tripType;
        // yolcu ve yolculuk hakkinda veri tanimlamasi

        double totalAmount, normalAmount, ageDiscount, discountedAmount, directionDiscount;

        // Yolculuk tutarlari hakkinda veri tanimlamasi

        Scanner inp = new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi KM cinsinden giriniz = ");

        distance = inp.nextInt();

        System.out.println("Yasinizi giriniz = ");

        age = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz = (1=> Tek Yon , 2=> Gidis Gelis)");

        tripType = inp.nextInt();

        switch(tripType){
            case 1 : {
                if (age <= 0 && distance <= 0) {
                    System.out.println("Gecersiz veri girisi !");
                }
                if (age < 12) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.50;
                    discountedAmount = normalAmount - ageDiscount;
                    totalAmount = discountedAmount;
                    System.out.println("Tek yön 12 yas altı indirimli bilet fiyati = " + totalAmount);
                    break;
                } else if (age >= 12 && age <= 24) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.10;
                    discountedAmount = normalAmount - ageDiscount;
                    totalAmount = discountedAmount;
                    System.out.println("Tek yön 12-24 yas arasi indirimli bilet fiyati = " + totalAmount);
                    break;

                }
                if (age > 65) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.30;
                    discountedAmount = normalAmount - ageDiscount;
                    totalAmount = discountedAmount;
                    System.out.println("Tek yön 65 yas ustu indirimli bilet fiyati = " + totalAmount);
                    break;

                } else {
                    normalAmount = distance * 0.10;
                    System.out.println("Tek yon bilet fiyati = " + normalAmount);
                    break;

                }
            }
            case 2: {
                if (age <= 0 && distance <= 0) {
                    System.out.println("Gecersiz veri girisi !");
                }
                if (age < 12) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.50;
                    discountedAmount = normalAmount - ageDiscount;
                    directionDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - directionDiscount) * 2;
                    System.out.println("Gidis donus 12 yas altı indirimli bilet fiyati = " + totalAmount*2);
                    break;

                } else if (age >= 12 && age <= 24) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.10;
                    discountedAmount = normalAmount - ageDiscount;
                    directionDiscount = (discountedAmount * 0.20);
                    totalAmount = (discountedAmount - directionDiscount) * 2 ;
                    System.out.println("Gidis donus 12-24 yas arasi indirimli bilet fiyati = " + totalAmount);
                    break;


                }
                if (age > 65) {
                    normalAmount = distance * 0.10;
                    ageDiscount = normalAmount * 0.30;
                    discountedAmount = normalAmount - ageDiscount;
                    directionDiscount = (discountedAmount * 0.20);
                    totalAmount = (discountedAmount - directionDiscount) * 2 ;
                    System.out.println("Gidis donus 65 yas ustu indirimli bilet fiyati = " + totalAmount*2);
                    break;
                } else {
                    normalAmount = distance * 0.10;
                    directionDiscount = normalAmount * 0.20;
                    totalAmount = (normalAmount - directionDiscount) * 2;
                    System.out.println("Gidis donus bilet fiyati = " + totalAmount*2);
                    break;

                }
            }
            default: System.out.println("Gecersiz veri girdiniz!");


        }




    }
}