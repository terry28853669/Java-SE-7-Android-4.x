public class Ch4_4_2 {
	// 主程式
	public static void main(String[] args) {
		java.util.Scanner sc = // 建立Scanner物件
		new java.util.Scanner(System.in);
		System.out.print("請輸入最大階層值=> ");
		int max = sc.nextInt(); // 取得最大階層值
		double n = 1;
//		int level = 1; // 變數宣告
//		// while迴圈敘述
//		while (level <= max) {
//			n *= level; // 計算階層
//			System.out.println(level + "!=" + n);
//			level++;
//		}
		for (int level = 1;level <= max;level++){
			n *= level; // 計算階層
			System.out.println(level + "!=" + n);			
		}	
	}
}