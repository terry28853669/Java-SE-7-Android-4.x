package CH10;

public class Ch10_1_3 {
   // �D�{��
   public static void main(String[] args) {
      int i;
      // �ҥ~�B�z�{���ԭz
      try {
         // ���Ͱ��H�s���ҥ~
         for ( i = 2; i > -1; i-- )
            System.out.println("�p�⵲�G: "+10/i);
      }
      catch( ArithmeticException e ) {
         // ��ܨҥ~��T
         System.out.println("�ҥ~����: "+e.getMessage());
         System.out.println("�ҥ~��]: ");
         e.printStackTrace();
      }
      finally {
         System.out.println("�ҥ~�B�z����");
      }
      System.out.println("Java�{�����浲��!");
   }
}