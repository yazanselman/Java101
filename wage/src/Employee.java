public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(int salary){
        if(salary<1000){
            return 0;
        }else{
            return salary * 0.03;
        }

    }

    double bonus(int workHours) {
        if(workHours>40){
            return (workHours -40)*30;
        }else {
            return 0;
        }
    }

    double raiseSalary(int hireYear){
        int year = 2021 - hireYear;
        if(year<10){
            return 0.05*salary;
        } else if (year<20) {
            return 0.1*salary;
        }else {
            return 0.2*salary;
        }
    }

    void printInfo(){
            System.out.println("Adı: " + this.name);
            System.out.println("Maaşı: " + this.salary);
            System.out.println("Çalışma Saati: " + this.workHours);
            System.out.println("Çalışma Yılı: " + this.hireYear);
            System.out.println("Vergi: "+tax(this.salary));
            System.out.println("Bonus: " + bonus(this.workHours));
            System.out.println("Maaş Artışı: "+(raiseSalary(this.hireYear)));
            System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax(this.salary) + bonus(this.workHours)) );
            System.out.println("Toplam Maaş: " +(this.salary +raiseSalary(this.hireYear)+bonus(this.workHours)-tax(this.salary)));
        }

    }


