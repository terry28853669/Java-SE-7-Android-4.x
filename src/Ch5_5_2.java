public class Ch5_5_2 {
   // �D�{��
   public static void main(String[] args) {
      // ��ܼƾǱ`��
      System.out.println("E: " + Math.E);
      System.out.println("PI: " + Math.PI);
      // �ƾǨ��
      double no = -19.536;
      System.out.println("���խ�no: "+no);
      System.out.println("abs(no): "+Math.abs(no));
      System.out.println("ceil(no): "+Math.ceil(no));
      System.out.println("floor(no): "+Math.floor(no));
      System.out.println("rint(no): "+Math.rint(no));
      // ���ƩM��ƨ��
      double x = 13.536;
      double y = 3.57;
      System.out.println("���խ�x/y: " + x + "/" +y);
      System.out.println("exp(x): " + Math.exp(x));
      System.out.println("log(x): " + Math.log(x));
      System.out.println("pow(x,y): " + Math.pow(x,y));
      System.out.println("sqrt(x): " + Math.sqrt(x));
      // �T�����
      double deg = 60.0;
      double rad = Math.toRadians(deg);
      System.out.println("���խ�deg/rad: "+deg+"/"+rad);
      System.out.println("sin(rad): " + Math.sin(rad));
      System.out.println("cos(rad): " + Math.cos(rad));
      System.out.println("tan(rad): " + Math.tan(rad));
   }
}