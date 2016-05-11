public class Ch5_2_1_2 {
	// 主程式
	public static void main(String[] args) {
		int i, sum = 0;
		; // 變數宣告
			// for迴圈敘述
		for (i = 1; i <= 7; i++) {
			System.out.print("|" + i);
			sum += i;
		}
		System.out.println("\n總和: " + sum);
	}
}