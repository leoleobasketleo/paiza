import java.util.*;

public class paizaD011 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int N = 0;

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] al = alp.split("",27);
        for (int i = 0;i<27;i++){
            if(line.equals(al[i]))
                N = i+1;
        }

        System.out.println(N);
    }
}