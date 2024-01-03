// " Student grade calculator "

import java.util.*;

class StudGradecalc{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students :");
    int noofstud = sc.nextInt();
    char grade ;
    while ( noofstud > 0 ){
      System.out.println("Enter your name :");
      String name = sc.next();
      System.out.println("English :");
      int eng = sc.nextInt();
      System.out.println("Computer science :");
      int cs = sc.nextInt();
      System.out.println("Maths :");
      int math = sc.nextInt();
      System.out.println("Computer architecture :");
      int coa = sc.nextInt();
      System.out.println("Physics :");
      int phy = sc.nextInt();
      System.out.println("Student's name :"+name);
      int sum =  eng + cs + math + coa + phy;
      System.out.println("Sum is :"+sum);
      int avg = sum / 5;
      System.out.println("Average is :"+avg);
      if ( avg > 90 ){
        grade = 'A';
      }
      else if ( avg > 75 && avg < 90 ){
        grade = 'B';
      }
      else if ( avg > 45 && avg < 75 ){
        grade = 'C';
      }
      else {
        grade = 'D';
      }
      System.out.println("Grade is :"+grade);
      noofstud--;
    }
  }
}