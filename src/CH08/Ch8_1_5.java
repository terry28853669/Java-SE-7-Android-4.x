package CH08;
// �D�{�����O
public class Ch8_1_5 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�, �åB�إߪ���
      Student4 joe = new Student4(1234,"���|�w","S102",85);
      Student4 tom = new Student4(3467,"������","S222",75);
      // ��ܾǥ͸��
      joe.personInfo();
      tom.personInfo();
   }
}
class Person4 {  // Person���O�ŧi
	   public static int count = 0; // �p��ǥͼ�
	   public int id;               // �����r��
	   public String name;          // �m�W
	   // �غc�l
	   public Person4(int id, String name) {
	      this.id = id;
	      this.name = name;
	      count++;
	   }
	   // ������k: ��ܭӤH���
	   public void personInfo() {
	      System.out.println("===[�ӤH���]=====");
	   }
	}
	class Student4 extends Person4 {  // Student���O�ŧi
	   private String id;    // ���æ����ܼ�
	   private String name;
	   private int grade;    // ���Z
	   // �غc�l
	   public Student4(int id,String n,String no,int grade) {
	      super(id, n);      // �I�s�����O���غc�l
	      name = "�ǥ�";
	      this.id = no;
	      this.grade = grade;
	   }
	   // ������k: ��ܾǥ͸��
	   public void personInfo() {
	      super.personInfo();
	      System.out.println("�m�W(��): " + super.name);
	      System.out.println("�r��(��): " + super.id);
	      System.out.println("¾�~(�l): " + name);
	      System.out.println("�Ǹ�(�l): " + id);
	      System.out.println("�ǥͼ�: " + count);
	      System.out.println("���Z: " + grade);
	   }
	}