package CH10;

import java.util.*;
public class Ch10_6_4 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����ArrayList�ŧi
      ArrayList<String> alist = new ArrayList<String>(4);
      alist.add("�d�Ѯv");  // �s�W����
      alist.add("���p��");
      alist.add("�p�s�k");
      alist.add("������");
      System.out.println("ArrayList����: " + alist);
      // �ϥ�ListIterator�������List����
      System.out.print("List����(ListIterator):");
      ListIterator<String> iterator =
                           alist.listIterator(0);
      while (iterator.hasNext() )
         System.out.print(" " + iterator.next());
      System.out.println();
      // �ϥ�ListIterator�����ϦV���List����
      System.out.print("�ϦV��ܤ���(ListIterator):");
      ListIterator<String> iterator1 =
                   alist.listIterator(alist.size());
      while (iterator1.hasPrevious() )
         System.out.print(" "+iterator1.previous());
      System.out.println();
   }
}