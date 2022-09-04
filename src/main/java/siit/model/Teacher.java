package siit.model;

import java.util.Date;

public class Teacher {
    private String name;
    Date birthday;
    private String department;
    Date dateofjoin;
    private int salary;
    private String sex;

    public Teacher(String name, Date birthday, String department, Date dateofjoin, int salary, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.department = department;
        this.dateofjoin = dateofjoin;
        this.salary = salary;
        this.sex = sex;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDateofjoin() {
        return dateofjoin;
    }

    public void setDateofjoin(Date dateofjoin) {
        this.dateofjoin = dateofjoin;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
