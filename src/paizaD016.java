import java.util.*;


public class paizaD016 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int N = sc.nextInt();
        String[] lineArray = line.split("",line.length());

        for(int i =0 ;i<N;i++)
        System.out.print(lineArray[i]);
    }
}