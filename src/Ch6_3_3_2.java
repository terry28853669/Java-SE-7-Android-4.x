public class Ch6_3_3_2 {
   // 主程式
   public static void main(String[] args) {
      // 使用建構子建立字串物件
      StringBuffer sb = new StringBuffer("程式");
      char[] charArr = { 'J','a','v','a' };
      String S="Java";
      System.out.println("原始字串內容: " + sb);
      // 新增字串內容
      sb.append('-');   // 字元
      System.out.println("新增字元\'-\': " + sb);
      sb.append(charArr);  // 字元陣列
      System.out.println("新增字元陣列: " + sb);
      sb.append("程式最佳教材");
      System.out.println("新增字串: " + sb);
      // 刪除字串內容
      sb.deleteCharAt(2);
      System.out.println("刪除第3個字: " + sb);
      sb.delete(0, 2);
      System.out.println("刪除前2個字: " + sb);
   }
}