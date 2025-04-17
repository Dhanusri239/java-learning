import java.util.*;
public class prog91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
          String a=new StringBuilder(arr[i]).reverse().toString();
          System.out.print(a+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
