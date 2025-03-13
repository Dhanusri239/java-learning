import java.util.Scanner;
class prog11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark1:");
        int s1=sc.nextInt();
        System.out.println("Enter the mark2:");
        int s2=sc.nextInt();
        System.out.println("Enter the mark3:");
        int s3=sc.nextInt();
        System.out.println("Enter the mark4:");
        int s4=sc.nextInt();
        System.out.println("Enter the mark5:");
        int s5=sc.nextInt();
        int total=s1+s2+s3+s4+s5;
        double avg=total/5;
        if(avg<35){
            System.out.println("coaching class is required");

        }
        else{
            System.out.println("class dose'nt required");
        }
    }
}