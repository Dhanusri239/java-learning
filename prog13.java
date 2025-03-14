import java.util.Scanner;
class prog13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            long n=sc.nextLong();
            System.out.println(n+"can be fitted:");
            try{
                if(x<=-128 && x>=127)
                System.out.println("*byte");
                if(x<=-32568 && x>=32567)
                System.out.println("*short");
                if(x<=-2147483648L && x>=2147483647L)
                System.out.println("*int");
            System.out.println("*long");
            }
            catch(Exception e){
                System.out.println(sc.next()+ "can't be fitted in it.");
                sc.nextLine();
            }

            
        }
        sc.close();
    }
}