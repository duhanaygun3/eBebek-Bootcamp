public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    @Override
    public String toString() {
        return "Calisan ismi : "+ name +"\n"+ "Calisan maasi : " + salary +"\n"+ "Calisma saati : " + workHours +"\n"+ "Ise baslangic yili : " + hireYear;
    }

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public void bonus(){
        if(workHours>40){
            System.out.println("Bonus calisma saati icerisindesiniz");
            int bonusCalculator;
            bonusCalculator = (workHours-40)*30;
            System.out.println("Bonus ucretiniz = "+bonusCalculator);
            System.out.println("Bonus ve maas toplaminiz = "+(bonusCalculator+salary));
            salary = bonusCalculator + salary;

        }else{
            System.out.println("Bonus calisma saati icerisinde degilsiniz ");
        }
    }

    public void tax(){

        if(salary>1000){
            System.out.println("Maasiniz vergi dilimindedir.");
            System.out.println("Vergi tutari = "+((salary*3)/100));

            salary = salary - ((salary*3)/100);

            System.out.println("Vergi kesilmis maasiniz = "+salary);

        }else{
            System.out.println("Maasiniz vergi dilimine girmemektedir");
            System.out.println("Maasiniz ="+salary);
        }

    }


    public void raiseSalary(){
        int startDate = 2021;

        if((startDate-hireYear)<10){
            System.out.println("Yillik zam artis oraniniz %5");
            System.out.println("Zam miktari = "+(salary*5)/100);
            salary = salary + ((salary*5)/100);
            System.out.println("Yeni yil zamli maasiniz = "+salary);
        } else if ((startDate-hireYear)>9 &&(startDate-hireYear)<20) {
            System.out.println("Yillik zam artis oraniniz %10");
            System.out.println("Zam miktari = "+(salary*10)/100);
            salary = salary + ((salary*10)/100);
            System.out.println("Yeni yil zamli maasiniz = "+salary);
        } else if ((startDate-hireYear)>19) {

            System.out.println("Yillik zam artis oraniniz %15");
            System.out.println("Zam miktari = "+(salary*15)/100);
            salary = salary + ((salary*15)/100);
            System.out.println("Yeni yil zamli maasiniz = "+salary);

        }

    }


}