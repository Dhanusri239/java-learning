import java.util.Scanner;
public class prog48 {

    void addition(int a,int b){
        System.out.println("The addtion of two integer is :" + (a+b));

    }
    double addition(double a,double b,double c){
        return a+b+c;
    }
    void addition(int a,double b){
        System.out.println("The addition of an integer and double is:"+(a+b));
    }
    void multiply(int a,int b){
        System.out.println("The multiplication of an integers are:"+ (a*b));
    }
    void multiply(int a,double b){
        System.out.println("The multiplication of an integer and double are:"+ (a*b));
    }
    public static void main(String[]args){
        prog48 obj=new prog48();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose any one option...");
        System.out.println("1. Add two integers");
        System.out.println("2. Add three doubles");
        System.out.println("3. Add an integer and a double");
        System.out.println("4. Multiply two integers");
        System.out.println("5. Multiply a double and an integer");
        System.out.print("Enter your choice (1-5): ");
        int choice=sc.nextInt();
        double result=0;
        switch (choice) {
            case 1:
                int a=sc.nextInt();
                int b=sc.nextInt();
                obj.addition(a,b);
                break;
            case 2:
                double d=sc.nextDouble();
                double e=sc.nextDouble();
                double c=sc.nextDouble();
                result=obj.addition(d, e, c);
                System.out.println("The addition of three double values are:"+(result));
                break;
            case 3:
                int f=sc.nextInt();
                double g =sc.nextDouble();
                obj.addition(f, g);
                break;
            case 4:
                int h=sc.nextInt();  
                int i=sc.nextInt();
                obj.multiply(h, i);
                break;
            case 5:
                int k=sc.nextInt();
                double l =sc.nextDouble();
                obj.multiply(k, l);
                break;
        
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}