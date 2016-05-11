package CH09;
// �D�{�����O
public class Ch9_1_1 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧi�����ܼƥB�إߪ���
      Order order1 = new Order("order001",false,false);
      Order order2 = new Order("order002",true,false);
      order1.printOrder();  // ��ܭq����
      order2.printOrder();
   }
}
class Order {          // Order�~�h���O
	   private String orderNo;
	   private OrderStatus orderStatus;
	   class OrderStatus { // OrderStatus���h���O
	      private boolean isShipped;
	      private boolean isPaid;
	      // �غc�l: OrderStatus���h���O
	      public OrderStatus(boolean shipped,boolean paid) {
	         isShipped = shipped;
	         isPaid = paid;
	      }
	      // ������k: ��ܭq�檬�A
	      public void printStatus() {
	         System.out.println("->[���h���O]");
	         System.out.println("->�O�_�e�f: " + isShipped);
	         System.out.println("->�O�_�I��: " + isPaid);
	      }
	   }
	   // �غc�l: Order�~�h���O
	   public Order(String no,boolean shipped,boolean paid) {
	      this.orderNo = no;
	      orderStatus = new OrderStatus(shipped,paid);
	   }
	   // ������k: ��ܭq����
	   public void printOrder() {
	      System.out.println("====[�q����]====");
	      System.out.println("�s��: " + orderNo);
	      System.out.println("�e�f: "+orderStatus.isShipped);
	      System.out.println("�I��: "+orderStatus.isPaid);
	      orderStatus.printStatus(); // �I�s���h���O��������k
	   }
	}