public class Ch4_3_4 {
   // 主程式
   public static void main(String[] args) {
      java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
      System.out.print("請輸入小時=> ");
      int hour = sc.nextInt(); // 取得小時
      char type;
      // 條件敘述運算子
      System.out.println("24小時制的時間: " + hour);
      type = (hour >= 12) ? 'P' : 'A';
      hour = (hour >= 12) ? hour-12 : hour;
      
      if (hour >= 12){
    	  type ='P';
      }else{
    	  type ='A';
      }
      
      System.out.println("12小時制的時間: "+hour+type);
   }
}