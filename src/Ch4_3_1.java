import java.util.Scanner;
public class Ch4_3_1 {
   // �D�{��
   public static void main(String[] args) {      
      Scanner sc = // �إ�Scanner����
                new Scanner(System.in);
      System.out.print("�п�J����(1)=> ");
      int height = sc.nextInt(); // ���o����
      // if����ԭz
      if ( height >= 150 ) {
         System.out.print("����: " + height);
         System.out.println("�ʶR����!");
      }else{
    	  System.out.println("����: "+height+"�ʶR�b��!");
      }

         
   }
}