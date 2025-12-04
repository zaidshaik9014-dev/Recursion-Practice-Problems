import java.util.*;
public class rcrsn8{
    public static int sumEven(int n){
        if(n==0) return 0;
        if(n%2==0){
            return n+sumEven(n-1);
        }else{
            return sumEven(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumEven(n));
    }
}
