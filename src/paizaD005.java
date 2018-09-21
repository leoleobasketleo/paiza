import java.util.*;


public class paizaD005 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int[] array = new int[2];
        for(int i = 0;i<2 ;i++){
            int N = sc.nextInt();
            array[i] = N;
        }
        for(int i =0 ;i<9;i++) {
            System.out.print(array[0] + i * array[1] + " ");
        }
        System.out.println(array[0] + 9 * array[1]);

    }
}