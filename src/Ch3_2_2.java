import javax.swing.JOptionPane;

public class Ch3_2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		   double grade =Double.valueOf(JOptionPane.showInputDialog("�п�J���Z"));
		   char gpa = 'B';  // ���w�ܼƭ�
		   boolean B;
		   // ��ܰT��
		   System.out.print("GPA: ");
		   System.out.println(gpa);
		   System.out.print("���Z: ");
		   System.out.println(grade);
		   System.out.print("�O�_�ή�: ");
		   if (grade>60){
			   B=true;
		   }else{
			   B=false;
		   }
		   System.out.println(B);
	}

}
