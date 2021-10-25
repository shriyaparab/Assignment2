import java.util.Scanner;

class BookTicket{
 private String movie_name;
 private String Audi_name;
 
 private int cost;
 
 void movies(){
  System.out.println("*****WELCOME*****");
  System.out.println("The Movies are: ");
  System.out.println("1. Harry Potter -- Rs.100 \n 2. Escape Plan  -- Rs.150 \n 3. The Martian  -- Rs.200 \n 4. Stuart Little -- Rs.100");
  }
 }
 
 class Audi extends BookTicket{
 private int no_of_tickets;
 void audi(){
 System.out.println("____________The Auditoriums are ____________\n 1. Audi_1 \n Audi_2 \n Audi_3");
 int k;
 int an;
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 if(n == 1){
    System.out.println("____________Audi_1_____________");
System.out.println("Select a movie ");
System.out.println(" Available Movies are \n 1. Harry Potter  \n 2. Escape Plan ");
Scanner a = new Scanner(System.in);
int o = a.nextInt();
if(o == 1){
  System.out.println("Harry Potter @ Audi_1");
  System.out.println("Enter the of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left = no_of_tickets-r;
  int amount = 100*r;
  System.out.println("To continue this movie booking press 1");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n\n");
  if(h==1){
        System.out.println("*************************");
System.out.println(" Auditorium----------Audi_1");
System.out.println(" Movie------------Harry Potter");
System.out.println(" Amount----------Rs."+amount);
System.out.println("*************************");
}
}
if(o == 2){
  System.out.println("Escape Plan @ Audi_1");
  System.out.println("Enter the of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left = no_of_tickets-r;
  int amount = 150*r;
  System.out.println("To continue this movie booking press 1");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n\n");
  if(h==1){
        System.out.println("*************************");
System.out.println(" Auditorium----------Audi_1");
System.out.println(" Movie------------Escape Plan");
System.out.println(" Amount----------Rs."+amount);
System.out.println("*************************");
}
}
}

if(n == 2){
    System.out.println("____________Audi_2_____________");
System.out.println("Select a movie ");
System.out.println(" Available Movies are \n 1. The Martian   \n 2. Stuart Little");
Scanner a = new Scanner(System.in);
int o = a.nextInt();
if(o == 1){
  System.out.println("Harry Potter @ Audi_2");
  System.out.println("Enter the of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left = no_of_tickets-r;
  int amount = 200*r;
  System.out.println("To continue this movie booking press 1");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n\n");
  if(h==1){
        System.out.println("*************************");
System.out.println(" Auditorium----------Audi_2");
System.out.println(" Movie------------The Martian");
System.out.println(" Amount----------Rs."+amount);
System.out.println("*************************");
}
}
if(o == 2){
  System.out.println("Escape Plan @ Audi_2");
  System.out.println("Enter the of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left = no_of_tickets-r;
  int amount = 100*r;
  System.out.println("To continue this movie booking press 1");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n\n");
  if(h==1){
        System.out.println("*************************");
System.out.println(" Auditorium----------Audi_2");
System.out.println(" Movie------------Stuart Little");
System.out.println(" Amount----------Rs."+amount);
System.out.println("*************************");
}
}
}

if(n == 3){
    System.out.println("____________Audi_3_____________");
System.out.println("Select a movie ");
System.out.println(" Available Movies are \n 1. Escape Plan  \n 2. Stuart Little ");
Scanner a = new Scanner(System.in);
int o = a.nextInt();
if(o == 1){
  System.out.println("Harry Potter @ Audi_3");
  System.out.println("Enter the of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left = no_of_tickets-r;
  int amount = 100*r;
  System.out.println("To continue this movie booking press 1");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n\n");
  if(h==1){
        System.out.println("*************************");
System.out.println(" Auditorium----------Audi_3");
System.out.println(" Movie------------Escape Plan");
System.out.println(" Amount----------Rs."+amount);
System.out.println("*************************");
}
}
if(o == 2){
  System.out.println("Escape Plan @ Audi_3");
  System.out.println("Enter the of tickets to be booked");
  Scanner j = new Scanner(System.in);
  int r = j.nextInt();
  int left = no_of_tickets-r;
  int amount = 150*r;
  System.out.println("To continue this movie booking press 1");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  System.out.println("\n\n\n\n");
  if(h==1){
        System.out.println("*************************");
System.out.println(" Auditorium----------Audi_3");
System.out.println(" Movie------------Stuart Little");
System.out.println(" Amount----------Rs."+amount);
System.out.println("*************************");
}
}
}

public class  movieTicket
{
 public static void main(String[] args){
  BookTicket[] movie_name = new BookTicket[2];
  movie_name[0]=ob;
  Audi a = new Audi();
  movie_name[1] = a;
 
  System.out.println("*********************************************************\n");
  System.out.println("------1. List of movies and their prices------\n-----2.access and book tickets through theaters");
  System.out.println("\n*************************************************************");
  Scanner d = new Scanner(System.in);
  int h = d.nextInt();
  switch(h)
  {
    case 1 : {
             ob.movies();
 break;
 }
    case 2 : {
                a.Audi();
              }
}
}
}     