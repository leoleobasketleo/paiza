import java.util.*;

public class paizaD002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] resultArray = line.split(" ", 0);
        int a = 0;
        int b = 0;
        for (int i = 0; i < resultArray.length; i++) {
            a = Integer.parseInt(resultArray[0]);
            b = Integer.parseInt(resultArray[1]);
        }

        if (a < b) {
            System.out.println(b);
        } else if (a > b) {
            System.out.println(a);
        } else {
            System.out.println("eq");
        }
    }
}
