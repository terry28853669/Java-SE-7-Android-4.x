package CH08;
// �D�{�����O
public class Ch8_3_1 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧi���O���A���ܼ�, �åB�إߪ���
      Circle3 c = new Circle3(16.0, 15.0, 16.0);
      c.area();       // �I�s������karea()
      c.perimeter();  // �I�s������kperimeter()
   }
}

interface IArea3 {   // IArea�����ŧi
   // �`�ƪ��ŧi
   final double PI = 3.1415926;
   // ������k: �p�⭱�n
   void area();
}

// IShape�����ŧi, �~��IArea
interface IShape extends IArea3 {
   // ������k: �p��P��
   void perimeter();
}

class Circle3 implements IShape { // Circle���O�ŧi
   public double x;   // X�y��
   public double y;   // y�y��
   private double r;  // �b�|
   // �غc�l
   public Circle3(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // ��@IShape��������karea()
   public void area() {
      System.out.println("�ꭱ�n: " + PI*r*r);
   }
   // ��@IShape��������kperimeter()
   public void perimeter() {
      System.out.println("��P��: " + 2.0*PI*r);
   }
}
