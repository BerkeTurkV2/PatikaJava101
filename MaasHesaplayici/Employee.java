package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        double taxRate = 0.03;
        double tax;
        if (this.salary >= 1000) {
            taxRate = 0.03;
            tax = this.salary * taxRate;
        } else {
            tax = 0;
        }
        System.out.println("Vergi : " + tax);
        this.salary -= tax;
    }

    void bonus() {
        double totalBonus;
        double hourlyBonus = 30.0;

        if (workHours > 40) {
            totalBonus = (workHours - 40) * hourlyBonus;
        } else {
            totalBonus = 0;
        }
        System.out.println("Bonus " + totalBonus);
        this.salary += totalBonus;
    }

    void raiseSalary() {
        int currentYear = 2022;
        double raiseSalary = 0;
        if ((currentYear - this.hireYear) < 10) {
            raiseSalary += this.salary * 0.05;
        }
        if (((currentYear - this.hireYear) > 9) && ((currentYear - this.hireYear) < 20)) {
            raiseSalary += this.salary * 0.10;
        }
        if ((currentYear - this.hireYear) > 19) {
            raiseSalary += this.salary * 0.15;
        }
        System.out.println("Maaş Artışı : " + raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + this.salary);
        this.salary += raiseSalary;
    }

    void Print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("-----------------------------------");
        tax();
        bonus();
        raiseSalary();
        System.out.println("Toplam Maaş : " + this.salary);
    }
}
