import java.util.*;


public class paizaD027 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0;i<N+1;i++){
            sum+= i;
        }
        System.out.println(sum);
    }
}