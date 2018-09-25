import java.util.*;


public class paizaD017 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int[] Array = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            Array[i] = sc.nextInt();
        }
        int max = Array[0];
        int min = Array[0];
        for(int i = 0;i<5;i++){
          max = Math.max(max,Array[i]);
          min = Math.min(min,Array[i]);
        }

        System.out.println(max);
        System.out.println(min);

    }
}