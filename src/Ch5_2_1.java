import javax.swing.JOptionPane;

public class Ch5_2_1 {
	// �D�{��
	public static void main(String[] args) {
		// ���O��k���I�s
		int a = Integer.valueOf(JOptionPane.showInputDialog("�п�J�T���άP�P��!"));
		printT(a);
		// �t�@�����O��k���I�s
		int b = Integer.valueOf(JOptionPane.showInputDialog("1�[�`��h��?"));
		Ch5_2_1.sumO(b);
	}

	public static void printT(int n) {
		int i, j; // �ܼƫŧi
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	public static void sumO(int n) {
		int i, sum = 0;
		; // �ܼƫŧi
			// for�j��ԭz
		for (i = 1; i <= n; i++) {
			System.out.print("|" + i);
			sum += i;
		}
		System.out.println("\n�`�M: " + sum);
	}
}