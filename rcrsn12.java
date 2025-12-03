import java.util.*;
public class rcrsn12{
    public static void printA(int[] a,int i){
        if(i==a.length) return;
        System.out.print(a[i]);
        printA(a, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printA(a, 0);
    }
}
