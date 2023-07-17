public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(int salary) {
        if(salary<=1000) {
            return 0;
        }
        else {
            return this.salary*0.03;
        }
    }

    double bonus(int workHours) {
        if(workHours>=40) {
            return (this.workHours-40)*30;
        }
        return 0;
    }

    double raiseSalary(int hireYear) {
        double raise= 0;
        if(hireYear<10) {
            raise=0.05;
        }
        else if(hireYear>9 && hireYear<20) {
            raise=0.1;
        }
        else if(hireYear>19) {
            raise=0.15;
        }
        return this.salary*raise;
    }

    public String toString() {
         System.out.print("" +
                 "Adı : " + this.name +"\n" +
                 "Maaşı : " + this.salary +"\n" +
                 "Çalışma Saati : " + this.workHours +"\n" +
                 "Başlangıç Yılı : " + this.hireYear +"\n" +
                 "Vergi : " + tax(this.salary) +"\n" +
                 "Bonus : " + bonus(this.workHours) +"\n" +
                 "Maaş Artışı : " + raiseSalary(this.hireYear)  +"\n" +
                 "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax(this.salary) + bonus(this.workHours)) +"\n" +
                 "Toplam Maaş : " + (this.salary + raiseSalary(this.hireYear)));

        return null;
    }

}