public class Ch6_2_3 {
   // ���O��k: �p��Ѽƪ��`�M
   public static double sum(double... numbers) {
      double total = 0.0;
      int count = numbers.length;
      for (int i = 0; i < count; i++) { 
         total += numbers[i];
      }
      return total;
   }
   // �D�{��
   public static void main(String[] args) {
      // �ܼƫŧi
      double total1, total2;
      // �I�s���O��k
      total1 = sum(20.0, 10.0, 5.0); 
      total2 = sum(20.0, 10.0, 5.0, 3.0);
      // ��ܰѼƩM
      System.out.println("3�ӰѼƪ��`�M: " + total1);
      System.out.println("4�ӰѼƪ��`�M: " + total2);
   }
}
