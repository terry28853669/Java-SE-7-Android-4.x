public class Ch4_4_3 {
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = // �إ�Scanner����
                new java.util.Scanner(System.in);
      System.out.print("�п�J�ūפU��=> ");
      int lower = sc.nextInt(); // ���o�ūפU��
      System.out.print("�п�J�ūפW��=> ");
      int upper = sc.nextInt(); // ���o�ūפW��
      int step = 10;   // �W�q
      int c = lower;
      double f;
      // do/while�j��ԭz
      System.out.println("���\t�ؤ�");
      do {
         f = (9.0 * c) / 5.0 + 32.0;
         System.out.println(c + "\t" + f);
         c += step;
      } while ( c <= upper );
   }
}