import java.util.*;


public class paizaD019 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArray = line.split(" ",2);
        int N = Integer.parseInt(lineArray[1]);
        String[] Array = line.split("",line.length());
        System.out.println(Array[N-1]);
    }
}