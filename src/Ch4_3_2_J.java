import javax.swing.JOptionPane;

public class Ch4_3_2_J {
	// 主程式
	public static void main(String[] args) {
		String S="";
		int grade = Integer.valueOf(JOptionPane.showInputDialog("請輸入成績:"));
		// if/else條件敘述
		if (grade >= 80) {
			S="學生成績:A";
		} else if (grade >= 70) {
			S="學生成績:B";
		} else if (grade >= 60) {
			S="學生成績:C";
		} else {
			S="學生成績:D";
		}
		JOptionPane.showMessageDialog(null, S);
	}
}