
public class Ch7_4_2 {
   // 主程式
   public static void main(String[] args) {
      Counter c = new Counter(10); // 建立物件
      // 串流呼叫方法
      int count = c.count(2).count(3.0).getCount();
      // 顯示計數值
      System.out.println("目前計數: " + count);
   }
}
class Counter { // Counter類別宣告
	   private int count;
	   // 建構子
	   public Counter(int count) {
	       this.count = count;
	   }
	   // 過載方法: 不同型態
	   public Counter count(double num) {
	      count += num;
	      return this;
	   }
	   public Counter count(int num) {
	      count += num;
	      return this;
	   }
	   // 取得計數值
	   public int getCount() { return count; }
	}