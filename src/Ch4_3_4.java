public class Ch4_3_4 {
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = // �إ�Scanner����
                new java.util.Scanner(System.in);
      System.out.print("�п�J�p��=> ");
      int hour = sc.nextInt(); // ���o�p��
      char type;
      // ����ԭz�B��l
      System.out.println("24�p�ɨ�ɶ�: " + hour);
      type = (hour >= 12) ? 'P' : 'A';
      hour = (hour >= 12) ? hour-12 : hour;
      
      if (hour >= 12){
    	  type ='P';
      }else{
    	  type ='A';
      }
      
      System.out.println("12�p�ɨ�ɶ�: "+hour+type);
   }
}