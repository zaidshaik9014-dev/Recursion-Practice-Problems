import java.util.*;
public class rcrsn10{
    public static boolean isPow(int n){
        if(n==1) return true;
        if(n==0||n%2!=0) return false;
        return isPow(n/2); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
    }
}

