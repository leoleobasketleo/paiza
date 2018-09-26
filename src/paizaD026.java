import java.util.*;


public class paizaD026 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int num = 0;

        Scanner sc = new Scanner(System.in);
        String[] dayArray = new String [7];
        for(int i =0;i<7 ;i++) {
            dayArray[i]  = sc.nextLine();
            if(dayArray[i].equals("no"))
                num++;
        }
        System.out.println(num);
    }
}