import java.util.*;


public class paizaD023 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        int num = 0;

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArray = line.split("",line.length());

        for(int i = 0;i<lineArray.length;i++){
            if(lineArray[i].equals("A"))
                num++;
        }
        System.out.println(num);
    }
}