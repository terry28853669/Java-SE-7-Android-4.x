import javax.swing.JOptionPane;

public class Ch5_2_3 {
	// �D�{��
	public static void main(String[] args) {
		double c = Double.valueOf(JOptionPane.showInputDialog("�п�J���ū�!"));
		double f = convertTemp(c);
		JOptionPane.showMessageDialog(null, c + "��C=" + f + "��F");
	}

	static double convertTemp(double c) {
		return (9.0 * c) / 5.0 + 32.0;
	}
}