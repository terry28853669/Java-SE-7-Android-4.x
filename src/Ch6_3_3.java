public class Ch6_3_3 {
   // �D�{��
   public static void main(String[] args) {
      // �ϥΫغc�l�إߦr�ꪫ��
      StringBuffer sb = new StringBuffer("Java�{���̨αЧ�");
      // ���J�r�ꤺ�e
      sb.insert(6, "�]�p");
      System.out.println("���J����r��: " + sb);
      sb.insert(4, " SE");
      System.out.println("���J�^��r��: " + sb);
      // ���N�r�ꤺ�e
      sb.setCharAt(5, 'E');
      System.out.println("���N�r��: " + sb);
      sb.replace(0, 7, "JDK SE");
      System.out.println("���N�r�� : " + sb);
      sb.reverse();       // ����r��
      System.out.println("�����r�� : " + sb);
      
   }
}