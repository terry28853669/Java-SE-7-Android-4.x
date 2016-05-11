import javax.swing.JOptionPane;

public class Ch5_2_1 {
	// 主程式
	public static void main(String[] args) {
		// 類別方法的呼叫
		int a = Integer.valueOf(JOptionPane.showInputDialog("請輸入三角形星星數!"));
		printT(a);
		// 另一種類別方法的呼叫
		int b = Integer.valueOf(JOptionPane.showInputDialog("1加總到多少?"));
		Ch5_2_1.sumO(b);
	}

	public static void printT(int n) {
		int i, j; // 變數宣告
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	public static void sumO(int n) {
		int i, sum = 0;
		; // 變數宣告
			// for迴圈敘述
		for (i = 1; i <= n; i++) {
			System.out.print("|" + i);
			sum += i;
		}
		System.out.println("\n總和: " + sum);
	}
}