import java.util.*;


public class paizaD009 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] Array = line.split(" ",2);

        int a = Integer.parseInt(Array[0]);
        int b = Integer.parseInt(Array[1]);

                System.out.println(b - a);
    }
}