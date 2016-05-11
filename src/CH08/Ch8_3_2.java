package CH08;
// �D�{�����O
public class Ch8_3_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧi���O���A���ܼ�, �åB�إߪ���
      Circle4 c = new Circle4(16.0, 15.0, 16.0);
      c.area();       // �I�s������karea()
      c.perimeter();  // �I�s������kperimeter()
      c.show();       // �I�s������kshow()
   }
}
interface IArea4 {  // IArea�����ŧi
   // �`�ƪ��ŧi
   final double PI = 3.1415926;
   // ������k: �p�⭱�n
   void area();
}
interface IShow2 {  // IShow�����ŧi
   // ������k: ��ܰ򥻸��
   void show();
}
// IShape�����ŧi, �~��IArea�MIShow
interface IShape2 extends IArea4, IShow2 {
   // ������k: �p��P��
   void perimeter();
}
class Circle4 implements IShape2 { // Circle���O�ŧi
   public double x;   // X�y��
   public double y;   // y�y��
   private double r;  // �b�|
   // �غc�l
   public Circle4(double x, double y, double r) {
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
   // ��@IShape��������kshow()
   public void show() {
      System.out.println("���X�y��: " + x);
      System.out.println("���Y�y��: " + y);
      System.out.println("��b�|: " + r);
   }
}
