public class Ch6_2_2 {
	// 主程式
	public static void main(String[] args) {
		// 變數宣告
		int i, j, total, sum;
		// 建立二維陣列
		int[][] grades = { { 54, 68 }, { 67, 78 }, { 89, 93 } };
		// 使用巢狀迴圈計算總和
		total = 0;
		for (j = 0; j < grades.length; j++) {
			sum = 0;
			for (i = 0; i < grades[j].length; i++) {
				System.out.print(grades[j][i] + " ");
				sum += grades[j][i];
				total += grades[j][i];
			}
			System.out.println("==>小計: " + sum);
		}
		System.out.println("成績總和: " + total);		
	}
}