package CH09.myShape;

public class Circle extends Shape {  // Circle���O�ŧi
   private double r;     // �b�|
   // �غc�l
   public Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // ������k: ��@��H��karea()
   public void area() {
      System.out.println("��έ��n: " + 3.1416*r*r);
   }
}
