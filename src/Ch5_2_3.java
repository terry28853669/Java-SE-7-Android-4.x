import javax.swing.JOptionPane;

public class Ch5_2_3 {
	// 主程式
	public static void main(String[] args) {
		double c = Double.valueOf(JOptionPane.showInputDialog("請輸入攝氏溫度!"));
		double f = convertTemp(c);
		JOptionPane.showMessageDialog(null, c + "度C=" + f + "度F");
	}

	static double convertTemp(double c) {
		return (9.0 * c) / 5.0 + 32.0;
	}
}