public class Ch4_4_3 {
   // 主程式
   public static void main(String[] args) {
      java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
      System.out.print("請輸入溫度下限=> ");
      int lower = sc.nextInt(); // 取得溫度下限
      System.out.print("請輸入溫度上限=> ");
      int upper = sc.nextInt(); // 取得溫度上限
      int step = 10;   // 增量
      int c = lower;
      double f;
      // do/while迴圈敘述
      System.out.println("攝氏\t華氏");
      do {
         f = (9.0 * c) / 5.0 + 32.0;
         System.out.println(c + "\t" + f);
         c += step;
      } while ( c <= upper );
   }
}