package CH09;

//�D�{�����O
public class Ch9_2_1 {
   // �D�{��
   public static void main(String[] args) {
      String str = "";
      // �إ�MyNumber����
      MyNumber myNum = new MyNumber();
      // ���o�����ܼ�result
      str = myNum.result;
      // ��ܦ����ܼƭ�
      System.out.println(str);
   }
}
class MyNumber { // MyNumber���O�ŧi
	   public String result;
	   // �غc�l
	   public MyNumber() {
	      MyInt myInt = new MyInt(100) {
	         // �мg��k 
	         public String getResult() {
	            return "��ƭȡG " + value;
	         }
	      };
	      result = myInt.getResult();
	   }
	   class MyInt {   // MyInt���O�ŧi
	      public int value;
	      public MyInt(int v) { value = v; }
	      public String getResult(){return "Int:"+value;}
	   }
	}