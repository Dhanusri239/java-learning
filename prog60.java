import java.util.Scanner;
class prog60{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
     System.out.println("The factors of given numbers are:");
    for(int i=1;i<=num;i++){
        if(num%i==0){
            System.out.print(i+" ");
        }
    }

}
}