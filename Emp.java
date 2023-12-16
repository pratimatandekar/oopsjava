/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.Objects;

/**
 *
 * @author prati
 */
public class Emp  implements Comparable<Emp>{

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emp other = (Emp) obj;
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Emp{" + "age=" + age + ", name=" + name + ", salary=" + salary + '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Emp(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    private int age;
    private String name;
    private double salary;

    @Override
    public int compareTo(Emp o) {
       return (int)(this.salary-o.salary);
    }

   
    
}
