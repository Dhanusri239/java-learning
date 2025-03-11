import java.util.Scanner;
class prog6{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your income:");
         int income=sc.nextInt();
         if(income<9000){
            System.out.println("Scholorship is available ");
         }
         else{
            System.out.println("Scholorship is not available");
            }
            }
}