public class Ch4_5_WHILE {
	// 主程式
	public static void main(String[] args) {
		int i, j; // 變數宣告
		// 顯示標題列
		System.out.print("    ");
		// for (i = 1; i <= 9; i++)
		// System.out.print(i + "      ");
		// System.out.println();
		i = 1;
		while (i <= 9) {
			System.out.print(i + "      ");
			i++;
		}
		System.out.println();
		// 巢狀迴圈
		// for (i = 1; i <= 9; ) {
		// // 顯示欄標題
		//
		i = 1;
		while (i <= 9) {
			System.out.print(i + " ");

			j = 1;
			while (j <= 9) { // 第二層迴圈
				System.out.print(i + "X" + j + "=" + (i * j) + " ");
				if ((i * j) < 10 && j != 1)
					System.out.print(" "); // 調整位置
				j++;
			}

			System.out.println();
			i++;
		}
	}
}