import java.util.Scanner;
class prog31{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ifprime=true;
        if(num<=1){
            ifprime=false;
        }
        else{
            for(int i=2;i<=num;i++){
                if(num%2==0){
                    ifprime=false;
                    break;
                }
            }
        }
        System.out.println(num+ (ifprime? " is a prime number":" is not a prime number"));

    }
}