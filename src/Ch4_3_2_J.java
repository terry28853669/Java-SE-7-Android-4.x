import javax.swing.JOptionPane;

public class Ch4_3_2_J {
	// �D�{��
	public static void main(String[] args) {
		String S="";
		int grade = Integer.valueOf(JOptionPane.showInputDialog("�п�J���Z:"));
		// if/else����ԭz
		if (grade >= 80) {
			S="�ǥͦ��Z:A";
		} else if (grade >= 70) {
			S="�ǥͦ��Z:B";
		} else if (grade >= 60) {
			S="�ǥͦ��Z:C";
		} else {
			S="�ǥͦ��Z:D";
		}
		JOptionPane.showMessageDialog(null, S);
	}
}