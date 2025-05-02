import java.util.*;
public class prog117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[3]; 
         //getting msg
        try{
            System.out.println(m/n);
        }
        catch(Exception obj){
            System.out.println((obj.getMessage()));
        }
        //getting msg along with exception
        try{
            System.out.println(m/n);
        }
        catch(Exception obj){
            System.out.println((obj.toString()));
        }
          String s="9igk";
         int a=Integer.parseInt(s);
         //getting msg for string along with exception
         try{
            System.out.println(a);
        }
        catch(Exception o){
            System.out.println(o.toString());
        }
         //getting msg for string
         try{
             System.out.println(a);
         }
         catch(Exception o){
             System.out.println(o.getMessage());
         }
        System.out.println("Nested try");
        try{
             try{
                System.out.println(5/0);
             }
             catch(Exception e){
                System.out.println(e.getMessage());
             }
             try{
                System.out.println(arr[3]);
             }
             catch(Exception e){
               System.out.println(e.toString());
             }
        }
        catch(Exception o){
            System.out.println("byeee");
        } 
    }
    
}
