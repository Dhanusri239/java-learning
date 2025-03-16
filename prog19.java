import java.util.Scanner;
class prog19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1=sc.nextDouble();
        System.out.print("Enter the operation to perform +,-,*,/:");
        char operator=sc.next().charAt(0);
        System.out.print("Enter the second number:");
        double num2=sc.nextDouble();
        sc.close();
        double result;
        switch(operator){
            case '+':
                result=num1+num2;
                break;
             case '-':
                result=num1-num2;
                break;
             case '*':
                result=num1*num2;
                break;
             case '/':
                if(num2!=0){
                result=num1+num2;
                }
                else{
                    System.out.println("Divide by zero error");
                    return;
                }
                break;  
                default:
                    System.out.println("Invalid operator");  
                    return;      

        }System.out.println("Result:"+result);

    }
}