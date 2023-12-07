import java.util.*;
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B =sc.nextInt();
        if(A>0 && B>0) {
        int C = A * B;
        System.out.println(C);
        }
        else {
        System.out.println("Invaild measurement");
        }
    }
}
