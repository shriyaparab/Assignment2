import java.util.*;
import java.io.*;

class Rational
{
 private int num;
 private int deno;

 public Rational()
 {
  num=deno=0;
 }


 public Rational(int numerator, int denominator)
 {
  num=numerator;
  deno=denominator;
 }
 
 public Rational(Rational rn)
 {
  num=rn.num;
  deno=rn.deno;
 }

 public void read()
 {
  Scanner sc= new Scanner(System.in);
  int num=sc.nextInt();
  int deno=sc.nextInt();
 }

 public void show()
 {
  System.out.println("Rational number="+num+"/"+deno);
 }
}

class showRational
{
 public static void main(String arg[])
 {
  
  Rational r1= new Rational();
  Rational r2= new Rational(5,10);
  Rational r3= new Rational(r2);
  r1.show();
  r2.show();
  r3.show();
 }
}
