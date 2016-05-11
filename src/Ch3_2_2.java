import javax.swing.JOptionPane;

public class Ch3_2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		   double grade =Double.valueOf(JOptionPane.showInputDialog("請輸入成績"));
		   char gpa = 'B';  // 指定變數值
		   boolean B;
		   // 顯示訊息
		   System.out.print("GPA: ");
		   System.out.println(gpa);
		   System.out.print("成績: ");
		   System.out.println(grade);
		   System.out.print("是否及格: ");
		   if (grade>60){
			   B=true;
		   }else{
			   B=false;
		   }
		   System.out.println(B);
	}

}
