package CH09;

import CH09.myShape.Circle;
import CH09.myShape.Rectangle;
import CH09.myShape.Triangle;
// import ch9_5_2.myShape.*;
public class Ch9_5_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧi���O���A���ܼ�, �åB�إߪ���
      Circle c = new Circle(5.0, 10.0, 4.0);
      Rectangle r = new Rectangle(10.0,10.0,20.0,20.0);
      Triangle t = new Triangle(10.0,10.0,25.0,5.0);
      // �I�s��H�������󪺩�H��karea()
      c.area();     // ���
      r.area();     // �����
      t.area();     // �T����
   }
}