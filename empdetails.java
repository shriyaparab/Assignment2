import java.io.*;
import java.util.*;

class emp
{
 private String name;
 private int age;
 private double salary;
 
 public emp()
 {
  name=null;
  age=0;
  salary=0.0;
 }
 public emp(String name,int age,double salary)
 {
  this.name=name;
  this.age=age;
  this.salary=salary;
 }
 public emp(emp e)
 {
  name=e.name;
  age=e.age;
  salary=e.salary;
 }

public void read()
 {
  System.out.println("Employee Details :- ");
 }

 public void show()
 {
  System.out.println("Employee name= "+name+" Age= "+age+" Salary= "+salary);
 }
}

class showEmployeeDetails
{
 public static void main(String arg[])
 {
  
  emp e1= new emp();
  emp e2= new emp("Shriya",24,35000);
  emp e3= new emp(e2);
  e1.read();
  e1.show();
  e2.show();
  e3.show();
 }
}
