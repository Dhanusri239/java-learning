import java.util.*;
public class prog119 {
    public static void main(String[]args)throws Exception{
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        System.out.println("--Select number of options to perform operation");
        System.out.println("1.Addition");
        System.out.println("2.substraction");
        System.out.println("3.multipilication");
        System.out.println("4.Division");
        int op=sc.nextInt();
        double result=0;
        boolean v=true;
        switch(op){
              case 1:
                result=n1+n2;
                break;
                case 2:
                result=n1-n2;
                break;
                case 3:
                result=n1*n2;
                break;
                case 4:
                if(n2==0){
                    throw new Exception("Can't divide by zero!");
                }
                else{
                    result=(double)n1/n2;
                }
                break;
                default:
                System.out.println("Invalid operation..");
                v=false;
            }
            if(v){
                System.out.println("Result: "+result);
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
            }
        catch(ArithmeticException e ){
            System.out.println(e.getMessage());
        }
        finally{
                    System.out.println("End of the calculation");
                }
        }
    
    }

