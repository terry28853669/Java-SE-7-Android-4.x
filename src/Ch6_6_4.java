public class Ch6_6_4 {
   // ���O��k: �G���j�M�����j��k
   static int binarySearch(int[] d,int l,int h,int v) {
      // ���j���פ����
      if ( l > h) return -1;
      else {
         // ���o��������
         int m = (l + h) / 2;
         if ( v == d[m]) // ���
            return m;    // �Ǧ^���ޭ�
         else if ( v < d[m]) // �e�b����
                 return binarySearch(d, l, m-1, v);
              else   // ��b����
                 return binarySearch(d, m+1, h, v);
       }
   }
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = // �إ�Scanner����
            new java.util.Scanner(System.in);
      System.out.print("�п�J���=> ");
      int t = sc.nextInt(); // ���o���
      int[] data = {12, 13, 24, 35, 44, 67, 78, 98};      
      // �I�s�G���j�M�k
      int i = binarySearch(data,0,data.length-1,t);
      if ( i != -1 )
         System.out.println("�j�M���: "+ t +"("+i+")");
      else
         System.out.println("�S���j�M���: "+ t);
   }
}