
public class Ch7_4_2 {
   // �D�{��
   public static void main(String[] args) {
      Counter c = new Counter(10); // �إߪ���
      // ��y�I�s��k
      int count = c.count(2).count(3.0).getCount();
      // ��ܭp�ƭ�
      System.out.println("�ثe�p��: " + count);
   }
}
class Counter { // Counter���O�ŧi
	   private int count;
	   // �غc�l
	   public Counter(int count) {
	       this.count = count;
	   }
	   // �L����k: ���P���A
	   public Counter count(double num) {
	      count += num;
	      return this;
	   }
	   public Counter count(int num) {
	      count += num;
	      return this;
	   }
	   // ���o�p�ƭ�
	   public int getCount() { return count; }
	}