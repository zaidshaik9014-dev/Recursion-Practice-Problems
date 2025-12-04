import java.util.*;
public class rcrsn13{
    public static int findMax(int[] a,int i){
        if(i==a.length-1) return a[i];
        int maxRest=findMax(a, i+1);
        if(a[i]>maxRest) return a[i];
        else return maxRest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(findMax(a, 0)); 
    }
}
