public class Ch7_3_1_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�
      Student[] joe = new Student[2];
      joe[0]=new Student();      
      joe[0].name="�d�Ѯv";
      joe[0].address = "�s�_��";
      joe[0].age = 37;
      joe[1]=new Student(); 
      joe[1].name = "���p��"; // �]�wjane�����ܼ�
      joe[1].address = "�x�_��";
      joe[1].age = 30;
      joe[0].printNameCard();  // �I�s���󪺤�k
      joe[1].printNameCard(); 
      for (int i=0;i<joe.length;i++){
          joe[i].printNameCard();  // �I�s���󪺤�k
      }
   }
}

