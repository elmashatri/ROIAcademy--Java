package Detyra4A;

// Shembull me Hierarchial Inheritance

class Employee {
    int baseSalary;
    Employee(){
        this.baseSalary = 50000;
    }
}

class TempEmployee extends Employee{
    float incrementPercent;

    TempEmployee(){
        this.incrementPercent = 0.1f;
    }

}

class PermanentEmployee extends Employee{
    float incrementPercent;

    PermanentEmployee(){
        this.incrementPercent = 0.2f;
    }

    public static void main(String[] args) {
        TempEmployee tempEmployee = new TempEmployee();
        PermanentEmployee permanentEmployee = new PermanentEmployee();

        System.out.println("Total salary of Temporary Employee :: "+ ((tempEmployee.baseSalary * tempEmployee.incrementPercent) + tempEmployee.baseSalary));
        System.out.println("Total salary of Permanent Employee :: "+ ((permanentEmployee.baseSalary * permanentEmployee.incrementPercent) + permanentEmployee.baseSalary));
    }
}
