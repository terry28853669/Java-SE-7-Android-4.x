package CH10;

public class Ch10_1_3a {
   // 主程式
   public static void main(String[] args) {
      int i;
      // 產生除以零的例外
      for ( i = 2; i > -1; i-- )
         System.out.println("計算結果: "+10/i);
      System.out.println("Java程式執行結束!");
   }
}