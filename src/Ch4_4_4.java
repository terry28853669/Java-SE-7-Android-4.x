public class Ch4_4_4 {
   // �D�{��
   public static void main(String[] args) {
      int i = 1, total = 0; // �ܼƫŧi
      // do/while�j��ԭz
      do {
         System.out.print("|" + i);
         total += i;
         i++;
         if ( i > 15 ) break;   // ���X�j��
      } while ( i<1000 );
      System.out.println("\n�`�M: " + total);
      // for�j��ԭz
      for ( total = 0, i = 1; i <= 10; i++ ) {
         if ( (i % 2) == 1 ) continue; // �~��j��
         System.out.print("|" + i);
         total += i;
      }
      System.out.println("\n���ƪ��`�M: " + total);
    }
}