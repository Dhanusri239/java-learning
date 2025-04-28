import java.util.*;
public class prog110 {
    String accountname;
    int accountnum;
    int pin;
    int balance;
 void accountdetails(){
  System.out.println("Account name: "+accountname);
  System.out.println("Account number: " +accountnum);
  System.out.println("Account balance: "+balance);
 }
 void depositmoney(int amount){
    if(amount>0){
        this.balance+=amount;
        System.out.println(amount+"deposited successfully:Balance: "+balance);
    }
    else{
        System.out.println("Invalid amount");
    }
 }
 void withdrawmoney(int amount){
    if(amount>0 && amount<balance ){
        this.balance-=amount;
        System.out.println(amount+"withdrawn successfully:Balance: "+balance);
    }
    else{
        System.out.println("Invalid amount");
    }
 }
 void checkbalance(int pin){
    this.pin=pin;
        System.out.println("Balance is: "+balance);
    
 }
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter account name :");
    String accountname=sc.nextLine();
    System.out.println("Enter account number:");
    int accountnum=sc.nextInt();
    System.out.println("Enter account balance :");
    int balance=sc.nextInt();
    System.out.println("Enter account pin :");
    int pin=sc.nextInt();
    prog110 obj=new prog110();
    obj.accountname=accountname;
    obj.accountnum=accountnum;
    obj.balance=balance;
    obj.pin=pin;
    obj.accountdetails();
    System.out.println("Enter the amount to deposit:");
    int a=sc.nextInt();
    obj.depositmoney(a);
    System.out.println("Enter the amount to withdraw:");
    int aw=sc.nextInt();
    obj.withdrawmoney(aw);
    obj.checkbalance(pin);
 }

}
