import java.util.*;

public class Ch4_4_1 {
	// 主程式
	public static void main(String[] args) {
		Scanner sc = // 建立Scanner物件
		new Scanner(System.in);
		System.out.print("請輸入for迴圈的最大值=> ");
		int max = sc.nextInt(); // 取得最大值
		int i, total = 0; // 變數宣告
		// for迴圈敘述
		for (i = 1; i <= max; i++) {
			System.out.print("|" + i);
			total += i;
		}
		System.out.println("\n從小到" + max + "總和:" + total);
		System.out.println(" ----------------- ");
		// for迴圈敘述
		for (total = 0, i = max; i >= 1; i--) {
			System.out.print("|" + i);
			total += i;
		}
		System.out.println("\n從" + max + "到小總和:" + total);
	}
}