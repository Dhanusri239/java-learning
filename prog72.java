import java.util.*;
public class prog72 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(s<1 || e>20 || s>e){
            System.out.println("Invalid");
        } 
        for(int i=s;i<=e;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println(fact);
        }
       
    }
}