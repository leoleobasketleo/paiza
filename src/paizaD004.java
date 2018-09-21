import java.util.*;


public class paizaD004 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //int型の整数を取得
        String[] resultArray = new String[N+1];
        String line = sc.nextLine();
        resultArray[0] =line;
        for(int i = 1;i<=N ;i++) {
            String lines = sc.nextLine();
            resultArray[i] =lines;
        }
        System.out.print("Hello" + " ");
        for(int i = 1;i<N ;i++){
            System.out.print(resultArray[i] + ",");
        }
        System.out.println(resultArray[N] + ".");


    }
}