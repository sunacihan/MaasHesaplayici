

public class Employee {

    String name;
    int maas;
    int workHours;
    int hireYear;



    Employee(String name, int maas, int workHours, int hireYear){
        this.name=name;
        this.maas=maas;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        double vergi=0;
        if(this.maas>1000){
            vergi=this.maas*0.03;
        }
        return vergi;
    }

    int bonus(){
        int bonus = 0;
        if (workHours>40){
            bonus=(workHours-40)*30;
        }
        return bonus;
    }

    double raiseSalary(){
        double yilzammi=0;
        if((2021-hireYear)<10){
            yilzammi=maas*0.05;
        }
        else if((2021-hireYear)>9 && (2021-hireYear)<20){
            yilzammi=maas*0.10;
        }
        else if((2021-hireYear)>19){
            yilzammi=maas*0.15;
        }
        return yilzammi;
    }
    public void toStrin(){
        System.out.println("Adı:"+this.name);
        System.out.println("Maaşı:"+this.maas);
        System.out.println("Çalışma saati:"+this.workHours);
        System.out.println("Başlangıç yılı:"+this.hireYear);
        System.out.println("Vergi:"+tax());
        System.out.println("Bonus:"+bonus());
        System.out.println("Maaş artışı:"+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş:"+(maas+(bonus()-tax())));
        System.out.println("Toplam maaai:"+(maas+raiseSalary()));
    }
}
