package CH09.myShape;

public class Triangle extends Shape {  // Triangle���O�ŧi
   private double height;    // ��
   private double bottom;    // �T���Ω�
   // �غc�l
   public Triangle(double x,double y,double h,double b) {
      this.x = x;
      this.y = y;
      height = h;
      bottom  = b;
   }
   // ������k: ��@��H��karea()
   public void area() {
      System.out.println("�T���έ��n: "+height*bottom/2.0);
   }
}
