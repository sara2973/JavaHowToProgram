//Question#2 & Question #4#5
package JavaHowToProgram.Chapter15;

import java.io.Serializable;

public class Account implements Serializable {
    private String firstName;
    private double salary;
    private int year;
    private int account;

    public Account(){
        this.account = 0;
        this.firstName = "";
        this.year = 0;
        this.salary = 0;


    }
    public Account(int account, String name, double salary, int year){
        this.account = account;
        this.firstName = name;
        this.salary = salary;
        this.year = year;
    }

    public void setFirstName(String name){this.firstName = name;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setYear(int year){this.year = year;}
    public void setAccount(int account){this.account = account;}

    public String getFirstName(){return this.firstName;}
    public double getSalary(){return this.salary;}
    public int getYear(){return this.year;}
    public int getAccount(){return this.account;}

    public double combine(TransactionRecord transactionRecord){
        setSalary(this.salary + transactionRecord.getAmount());
        return getSalary();

    }

}
