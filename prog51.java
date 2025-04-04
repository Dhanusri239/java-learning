import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class prog51 {
    public static int findb(int a){
        if(a<10){
            return a+10;
        }
        ArrayList<Integer> digits=new ArrayList<>();
        for(int i=9;i>=2;i--){
            while(a%i==0){
            digits.add(i);
            a=a / i;
        }
    }
        Collections.sort(digits);
        int b=0;
        for(int digit:digits){
            b=b*10+digit;
    }
    return b;
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=findb(a);
    if(b==-1){
        System.out.println("Not possible");
    }
    else{
        System.out.println(b);
    }
}
}
