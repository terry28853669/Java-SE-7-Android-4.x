package CH10;

public class Ch10_2_1 {
   // �D�{��
   public static void main(String[] args) {
      try {  // �ҥ~�B�z�{���ԭz
         // ���o�üƭ�
         int index = (int)(Math.random()*20);
         if ( index < 10 ) // ��XArithmeticException�ҥ~
            throw new ArithmeticException("�Ȥp��10");
      }
      catch ( ArithmeticException e ) {
         // �B�zArithmeticException�ҥ~
         System.out.println("�ҥ~����: "+e.getMessage());
         System.out.println("�ҥ~��]: ");
         e.printStackTrace();
      }
      finally {
         System.out.println("�ҥ~�B�z����");
      }
   }
}