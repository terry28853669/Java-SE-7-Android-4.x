package CH08;
// �D�{�����O
public class Ch8_1_4 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�, �åB�إߪ���
      Student3 mary =
              new Student3("A2255","�p�s�k",165.0,65);
      // ��ܾǥ͸��
      mary.studentInfo();
   }
}
class Person3 {  // Person���O�ŧi
	   public String id;          // �����r��
	   private String name;    // �m�W
	   private double height;  // ����
	   // ������k: ���o�m�W
	   public String getName() { return name; }
	   // ������k: ���o����
	   public double getHeight() { return height; }
	   // ������k: �]�w�m�W
	   public void setName(String n) { name = n; }
	   // ������k: �]�w����
	   public void setHeight(double h) { height = h; }
	}

class Student3 extends Person3 {  // Student���O�ŧi
	   private String id;     // ���æ����ܼ�
	   private int grade;     // ���Z
	   // �غc�l
	   public Student3(String id,String n,double h,int grade) {
	      setName(n);  // �I�s�����O��������k
	      setHeight(h);
	      super.id = id;
	      this.grade = grade;
	   }
	   // ������k: ��ܾǥ͸��
	   public void studentInfo() {
	      System.out.println("[�ǥ͸��]=====");
	      System.out.println("�r��: " + super.id);
	      System.out.println("�m�W: " + getName());
	      System.out.println("����: " + getHeight());
	      System.out.println("���Z: " + grade);
	   }
	}