public class Gctest1 {
    public static void main(String[] args){

            String s = new String("ABCDEFGHIJKLMNOPQRSTUBVWXYZ");
            //利用可能なメモリの大きさをみる
            long free = Runtime.getRuntime().freeMemory();
            //全メモリの大きさをみる
            long total = Runtime.getRuntime().totalMemory();
            //最大メモリの大きさを得る
            long max = Runtime.getRuntime().maxMemory();

            System.out.println(max);
        
    }
}
