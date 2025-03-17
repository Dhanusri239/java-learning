import java.util.Scanner;
class prog23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [] num=new int[5];
        for(int i=0;i<5;i=i+1){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<5;i=i+1){
        System.out.println(num[i]);
        }
    }
}