package CH09;

// �D�{�����O
public class Ch9_1_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiPayment���O���A���ܼ�, �åB�إߪ���
      Payment p1 = new Payment("pay002", 5600.0);
      // �إߤ��h���O������
      Payment.Card master = p1.new Card();
      master.type = "MASTER";  // �s�����h�����ܼ�
      master.number = "2433-4444-7890-1234";
      master.printCard();    // �I�s���h�����k
   }
}
class Payment {   // Payment�~�h���O
	   private String payNo;
	   private double amount;
	   class Card {   // Card���h���O
	      public String type;
	      public String number;
	      // ������k: ��ܫH�Υd���
	      public void printCard() {
	         // �I�s�~�h��k
	         System.out.println("�s��: " + getNo());
	         // ��ܥ~�h�������ܼ�
	         System.out.println("���B: " + amount);
	         // ��ܤ��h�������ܼ�
	         System.out.println("�d�O: " + type);
	         System.out.println("�d��: " + number);
	      }
	   }
	   // �غc�l: �~�hPayment
	   public Payment(String no, double amount) {
	      payNo = no;
	      this.amount = amount;
	   }
	   // ������k: �Ǧ^�I�ڽs��
	   private String getNo() { return payNo; }
	}