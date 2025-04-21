import java.util.*;
public class prog96 {
    public static int tail(int n){
        if(n==0) 
        return n;
        System.out.print(n+" ");
        return tail(n-1);
    }
    public static int head(int n){
        if(n==0)
        return n;
        head(n-1);
        System.out.print(n + " ");
        return n;
    }
    public static void tree(int n){
        if(n==0){
         return ;
        }
        System.out.print(n+ " ");
        tree(n-1);
        tree(n-1);
    }
    public static void id(int n,int sum,int o){
       if(n<=0){
       System.out.println("The sum of even num is "+sum);
       id1(o,0);
       return;
    }
        if(n%2==0){
          sum+=n;
          }
       id(n-1,sum,o);
    }
    public static void id1(int n,int sum){
         if(n<=0){
         System.out.println("The sum of odd number is "+sum);
         return;
         }

         if(n%2!=0){
         sum+=n;
         } 
         id1(n-1,sum);
    }
     static int c=0;
    public static int nd(int n){
        c++;
        if(n>100){
           return n-10;
        }
        else{
            return nd(nd(n+11));
        }
    }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Tail Recursion");
        tail(n);
        System.out.println();
        System.out.println("Head Recursion");
        head(n);
        System.out.println();
        System.out.println("Tree Recursion");
        tree(n);
        System.out.println();
        System.out.println("Indirect recursion");
        id(n,0,n);
        //System.out.println();
        System.out.println("Nested recursion");
        int re=nd(n);
        System.out.print(re);
        System.out.println();
        System.out.println("The count for mcarthy recursive is"+c);


    }
    
}

       