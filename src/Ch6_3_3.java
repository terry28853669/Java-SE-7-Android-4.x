public class Ch6_3_3 {
   // 主程式
   public static void main(String[] args) {
      // 使用建構子建立字串物件
      StringBuffer sb = new StringBuffer("Java程式最佳教材");
      // 插入字串內容
      sb.insert(6, "設計");
      System.out.println("插入中文字串: " + sb);
      sb.insert(4, " SE");
      System.out.println("插入英文字串: " + sb);
      // 取代字串內容
      sb.setCharAt(5, 'E');
      System.out.println("取代字元: " + sb);
      sb.replace(0, 7, "JDK SE");
      System.out.println("取代字串 : " + sb);
      sb.reverse();       // 反轉字串
      System.out.println("反轉後字串 : " + sb);
      
   }
}