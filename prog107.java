import java.util.*;
public class prog107 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter siz e of 1st array:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter siz e of 2nd array:");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        Set<Integer>i=new HashSet<>();
        Set<Integer>re=new HashSet<>();
        for(int nu:arr1){
            i.add(nu);
        }
        for(int ne:arr2){
            if(i.contains(ne)){
                re.add(ne);
            }
        }
        System.out.println(re);
    }
}
