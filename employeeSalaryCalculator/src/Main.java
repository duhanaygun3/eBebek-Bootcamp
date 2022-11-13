public class Main {
    public static void main(String[] args) {

        //Patika.dev ebebek Java & QA & SAP Practicum odevidir.


        /*Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
        Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

          Sınıfın Nitelikleri

          name : Çalışanın adı ve soyadı
          salary : Çalışanın maaşı
          workHours : Haftalık çalışma saati
          hireYear : İşe başlangıç yılı
          Sınıfın Metotları

          Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
          tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
          Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
          Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
          bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
          raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
          Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
          Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
          Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
          toString() : Çalışana ait bilgileri ekrana bastıracaktır.

          Örnek :

         Adı : kemal
         Maaşı : 2000.0
         Çalışma Saati : 45
         Başlangıç Yılı : 1985
         Vergi : 60.0
         Bonus : 150.0
         Maaş Artışı : 300.0
         Vergi ve Bonuslar ile birlikte maaş : 2090.0
         Toplam Maaş : 2300.0

         */







        Employee e1 = new Employee("Can",5000,55,2009);
        Employee e2 = new Employee("Cetin",850,35,2020);
        Employee e3 = new Employee("Ali",9000,30,2000);
        Employee e4 = new Employee("Mehmet",900,60,2018);


        System.out.println(e1);
        e1.bonus();
        e1.tax();
        e1.raiseSalary();





        System.out.println(e2);
        e2.bonus();
        e2.tax();
        e2.raiseSalary();




        System.out.println(e3);
        e3.bonus();
        e3.tax();
        e3.raiseSalary();





        System.out.println(e4);
        e4.bonus();
        e4.tax();
        e4.raiseSalary();



    }
}