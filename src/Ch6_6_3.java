public class Ch6_6_3 {
	// 類別方法: 線性搜尋法
	public static void main(String[] args) {
		// 宣告變數
		int[] data = { 89, 34, 78, 45, 12, 99, 23 };
		int i, index = 0;
		System.out.print("原始陣列: ");
		for (i = 0; i < data.length; i++)
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");
		java.util.Scanner sc = // 建立Scanner物件
		new java.util.Scanner(System.in);
		System.out.print("請輸入鍵值=> ");
		int target = sc.nextInt(); // 取得鍵值
		//線性搜尋方法
		for (i = 0; i < data.length; i++) {
			// 比較是否是目標值
			if (data[i] == target) {
				index = i;
				break;
			}
			index = -1;
		}
		if (index != -1) {
			System.out.print("搜尋到值: " + target);
			System.out.println("(" + index + ")");
		} else
			System.out.println("沒有搜尋到值: " + target);
	}
}