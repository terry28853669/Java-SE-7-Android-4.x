package CH09.myShape;

public class Rectangle extends Shape {  // Rectangle���O�ŧi
   private double width;     // �e
   private double height;    // ��
   // �غc�l
   public Rectangle(double x,double y,
                    double w,double h) {
      this.x = x;
      this.y = y;
      width = w;
      height = h;
   }
   // ������k: ��@��H��karea()
   public void area() {
      System.out.println("����έ��n: "+(height*width));
   }
}
