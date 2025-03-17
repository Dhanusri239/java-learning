import java.util.Scanner;
class prog24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] num=new int[size];
        for(int i=0;i<=size-1;i=i+1){
            num[i]=sc.nextInt();
            }
            int midindex=size/2;
            if(midindex%2==0){
                System.out.println("The middle value is:"+num[midindex-1]+"and"+num[midindex]);
        }
        else{
            System.out.println("The middle value is:"+num[midindex]);
        }
    }
}