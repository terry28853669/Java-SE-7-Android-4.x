public class Ch6_4_1 {
   // �D�{��
   public static void main(String[] args) {
      // �ϥ�parse???()��k�N�r���ഫ���ƭ�
      byte   num1 = Byte.parseByte("5");
      byte   num1_2 = Byte.valueOf("5");
      short  num2 = Short.valueOf("100");
      int    num3 = Integer.parseInt("2000");
      long   num4 = Long.parseLong("135");
      float  num5 = Float.parseFloat("245.675");
      double num6 = Double.parseDouble("145.67891234");
      // ��ܼƭ�
      System.out.println("byte��ƭ�: " + num1);
      System.out.println("short��ƭ�: " + num2);
      System.out.println("int��ƭ�: " + num3);
      System.out.println("long��ƭ�: " + num4);
      System.out.println("float�B�I�ƭ�: " + num5);
      System.out.println("double�B�I�ƭ�: " + num6);
   }
}