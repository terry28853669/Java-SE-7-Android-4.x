public class Ch6_3_3_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ϥΫغc�l�إߦr�ꪫ��
      StringBuffer sb = new StringBuffer("�{��");
      char[] charArr = { 'J','a','v','a' };
      String S="Java";
      System.out.println("��l�r�ꤺ�e: " + sb);
      // �s�W�r�ꤺ�e
      sb.append('-');   // �r��
      System.out.println("�s�W�r��\'-\': " + sb);
      sb.append(charArr);  // �r���}�C
      System.out.println("�s�W�r���}�C: " + sb);
      sb.append("�{���̨αЧ�");
      System.out.println("�s�W�r��: " + sb);
      // �R���r�ꤺ�e
      sb.deleteCharAt(2);
      System.out.println("�R����3�Ӧr: " + sb);
      sb.delete(0, 2);
      System.out.println("�R���e2�Ӧr: " + sb);
   }
}