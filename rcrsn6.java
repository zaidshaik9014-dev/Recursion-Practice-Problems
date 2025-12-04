import java.util.*;
public class rcrsn6{
    public static int sumDig(int n){
        if(n==0) return 0;
        return (n%10)+sumDig(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumDig(n));
    }
}


