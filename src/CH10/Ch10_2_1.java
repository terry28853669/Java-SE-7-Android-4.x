package CH10;

public class Ch10_2_1 {
   // 主程式
   public static void main(String[] args) {
      try {  // 例外處理程式敘述
         // 取得亂數值
         int index = (int)(Math.random()*20);
         if ( index < 10 ) // 丟出ArithmeticException例外
            throw new ArithmeticException("值小於10");
      }
      catch ( ArithmeticException e ) {
         // 處理ArithmeticException例外
         System.out.println("例外說明: "+e.getMessage());
         System.out.println("例外原因: ");
         e.printStackTrace();
      }
      finally {
         System.out.println("例外處理結束");
      }
   }
}