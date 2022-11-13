import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.

        /* Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
           Fibonacci Serisi Nedir ?
           Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
           Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
           yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
           Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
           Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
           9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
           */

        int digit, number1=0, number2=1, number3;

        Scanner inp = new Scanner(System.in);

        System.out.println("Serinin ilerleyecegi adim sayisini giriniz = ");

        digit = inp.nextInt();

        System.out.println(number1 +" "+ number2+ " ");

        for(int i=2; i<=digit;i++){

            number3 = number1 + number2;
            System.out.println(number3 + " ");
            number1= number2;
            number2 = number3;

        }



    }
}