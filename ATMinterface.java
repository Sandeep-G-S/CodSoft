import java.util.*;

class ATMinterface{
  
  public static void withdraw(int amount){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the amount to be withdrawn :");
    int wdamt = sc.nextInt();
    if ( wdamt > 10000 ){
      System.out.println("Insufficient funds");
    }
    else{
    int dispense = amount - wdamt;
    System.out.println("Amount withdrawn successfully");
    System.out.println("Balance amount :"+dispense);
    }
  }
  public static void deposit(int amount){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the amount to be deposited :");
    int dpamt = sc.nextInt();
    int deposit = amount + dpamt;
    System.out.println("Amount deposited successfully");
    System.out.println("Balance amount :"+deposit);
  }

  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int amount = 10000;
    System.out.println("Choose the method \n 1.Withdraw \n 2.Deposit \n 3.Check Balance");
    int method = sc.nextInt();

    switch (method){
      case 1:
        withdraw(amount);
        break;
      case 2:
        deposit(amount);
        break;
      case 3:
        System.out.println(amount);
        break;
    }
  }
}