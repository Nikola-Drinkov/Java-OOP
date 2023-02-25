package SalaryIncrease_02;

import java.text.DecimalFormat;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        if(age<30){
            salary+=salary*(percentage/200);
        }
        else{
            salary+=salary*(percentage/100);
        }
    }

    @Override
    public String toString() {
        String pattern = "#####.0###";
        DecimalFormat df = new DecimalFormat(pattern);
        return String.format("%s %s gets %s leva",firstName,lastName,df.format(salary));
    }
}
