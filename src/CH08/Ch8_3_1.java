package CH08;
// 主程式類別
public class Ch8_3_1 {
   // 主程式
   public static void main(String[] args) {
      // 宣告類別型態的變數, 並且建立物件
      Circle3 c = new Circle3(16.0, 15.0, 16.0);
      c.area();       // 呼叫介面方法area()
      c.perimeter();  // 呼叫介面方法perimeter()
   }
}

interface IArea3 {   // IArea介面宣告
   // 常數的宣告
   final double PI = 3.1415926;
   // 介面方法: 計算面積
   void area();
}

// IShape介面宣告, 繼承IArea
interface IShape extends IArea3 {
   // 介面方法: 計算周長
   void perimeter();
}

class Circle3 implements IShape { // Circle類別宣告
   public double x;   // X座標
   public double y;   // y座標
   private double r;  // 半徑
   // 建構子
   public Circle3(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // 實作IShape介面的方法area()
   public void area() {
      System.out.println("圓面積: " + PI*r*r);
   }
   // 實作IShape介面的方法perimeter()
   public void perimeter() {
      System.out.println("圓周長: " + 2.0*PI*r);
   }
}
