import java.util.Scanner;
public class Ch4_3_1 {
   // 主程式
   public static void main(String[] args) {      
      Scanner sc = // 建立Scanner物件
                new Scanner(System.in);
      System.out.print("請輸入身高(1)=> ");
      int height = sc.nextInt(); // 取得身高
      // if條件敘述
      if ( height >= 150 ) {
         System.out.print("身高: " + height);
         System.out.println("購買全票!");
      }else{
    	  System.out.println("身高: "+height+"購買半票!");
      }

         
   }
}