package com.mode.no06_prototype_demo.code3;

public class Work3  implements Cloneable{
    public String company;
    public int salary;

    public Work3(String company, int salary) {
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Work{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
