package CH10;
import java.util.*;
public class Ch10_6_2 {
   public static void main(String[] args) {
      // ���X����ArrayList�ŧi
      ArrayList<String> alist = new ArrayList<String>(4);
      String name = "�d�Ѯv";
      alist.add("�d�Ѯv");  // �s�W����
      alist.add("���p��");
      alist.add("������");
      alist.add("�L�T�N");
      // ��ܤؤo�M����
      System.out.println("����ؤo=" + alist.size());
      System.out.println("���X����: " + alist);
      // ���J���w��m������
      alist.add(2, name);
      // ��ܶ��X���󤺮e
      System.out.print("���X����(1):" );
      for ( int i = 0; i < alist.size(); i++ )
         System.out.print(" "+ i +":"+ alist.get(i));
      System.out.println();
      System.out.print("���X����(2):" );
      for ( String element : alist )
         System.out.print(element + " ");
      System.out.println();
      // �j�M����
      System.out.println("�j�M: " + name);
      System.out.println("indexOf():" +alist.indexOf(name));
      System.out.println("lastIndexOf():" +alist.lastIndexOf(name));
      alist.set(3, "�i�T��"); // ���N����
      System.out.println("���N����3: " + alist);
      alist.remove(0);  // �R������
      System.out.println("�R������0: " + alist);
   }
}