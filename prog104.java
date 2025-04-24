import java.util.*;
public class prog104 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,String>m=new HashMap<Integer,String>();
        int n=sc.nextInt();
        int a;
        sc.nextLine();
        String s=" ";
        for(int i=0;i<n;i++){
            System.out.println("Enter name of student "+(i+1));
            s=sc.nextLine();
            System.out.println("Enter mark of student "+(i+1));
            a=sc.nextInt();
            sc.nextLine();
            m.put(a,s);
        }
        System.out.println(m);
    }
}
