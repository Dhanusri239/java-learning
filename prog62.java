import java.util.Scanner;
class prog62{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int n1=sc.nextInt();
        System.out.println();
        System.out.print("Enter the number 2:");
        int n2=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                sum1=sum1+i;
            }
        }
        for(int i=1;i<=n2;i++){
            if(n2%i==0){
                sum2=sum2+i;
            }
        }
        if(sum1==sum2){
            System.out.println("yes the given number is amicable pair");
        }
        else{
            System.out.println("No it's not a amicable pair");
        }
    }
}