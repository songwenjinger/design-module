package com.mode.no6_prototype.code2;

public class Work {
    public String company;
    public int salary;

    public Work(String company, int salary) {
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
}
