public class Ch5_5_1 {
   // �D�{��
   public static void main(String[] args) {
      // �̤j�ȩM�̤p��
      System.out.print("�̤j��max(34, 78): ");
      System.out.println(Math.max(34,78));
      System.out.print("�̤p��min(34, 78): ");
      System.out.println(Math.min(34,78));
      System.out.print("�|�ˤ��Jround(34.567):");
      System.out.println(Math.round(34.567));
      System.out.print("�|�ˤ��Jround(34.467):");
      System.out.println(Math.round(34.467));
      System.out.print("ceil(34.467):");
      System.out.println(Math.ceil(34.00001));
      System.out.print("floor(34.467):");
      System.out.println(Math.floor(34.999));
      System.out.print("rint(34):");
      System.out.println(Math.rint(34.51));
      System.out.print("�ü�random(): ");
      System.out.println(Math.random());
      // 0-10���ü�
      double no = Math.floor(Math.random()*11);
      System.out.println("0-10�ü�: " + no);
      // 1-100���ü�
      no = (int)(Math.random()*100 + 1);
      System.out.println("1-100�ü�: " + no);
   }
}