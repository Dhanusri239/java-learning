import java.util.*;
public class prog99 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        List<Map.Entry<String,Integer>> students =new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
             int m=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            students.add(new AbstractMap.SimpleEntry<>(s,m));
       }
       Iterator<Map.Entry<String,Integer>>it=students.iterator();
       while(it.hasNext()){
        Map.Entry<String,Integer>s=it.next();
        if(s.getValue()<50){
            it.remove();
        }
       }
        students.sort((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<students.size();i++){
            System.out.println((i+1)+") "+students.get(i).getKey()+" - "+students.get(i).getValue());
        }
    }
}
