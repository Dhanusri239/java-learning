import java.util.Scanner;
class prog20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        while(true){
            System.out.println("----ATM----");
            System.out.println("1.check balance");
            System.out.println("2.cash withdrawl");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            System.out.print("Choose any one option:");
            int choice=sc.nextInt();
             switch(choice){
                case 1:
                    System.out.println("Balance:"+balance);
                    break;
                case 2:
                    double amount=sc.nextDouble();
                    if(amount>0 && amount<balance){
                    balance-=amount;
                    System.out.println("withdrawl amount"+amount);  
                    System.out.println("Balance:"+balance);
                    }    
                    else{
                        System.out.println("Invalid amount");
                        return;
                    }
                    break;
                    case 3:
                    double deposit=sc.nextDouble();
                    if(deposit>0){
                    balance+=deposit;
                    System.out.println("Deposit amount"+deposit);  
                    System.out.println("Balance:"+balance);
                    }    
                    else{
                        System.out.println("Invalid amount");
                        return;
                    }
                    break;
                    case 4:
                        System.out.println("Thank youb for using ATM,Good bye!!");
                        sc.close();
                        break;
                    default:
                        System.out.println("Invalid choice,choose correct option among choices");


             }
        }
    }
}
