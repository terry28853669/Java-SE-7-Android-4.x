public class Ch5_2_1_1 {
	// 主程式
	public static void main(String[] args) {
		int i, j; // 變數宣告
		for (i = 7; i >= 1; i--) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}