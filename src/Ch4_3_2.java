import java.util.Scanner;

public class Ch4_3_2 {
	// 主程式
	public static void main(String[] args) {
		Scanner sc = // 建立Scanner物件
		new Scanner(System.in);
		System.out.print("請輸入成績=> ");
		int grade = sc.nextInt(); // 取得成績
		// if/else條件敘述
		if (grade >= 80) {
			System.out.println("學生成績:A");
		} else if (grade >= 70) {
			System.out.println("學生成績:B");
		} else if (grade >= 60) {
			System.out.println("學生成績:C");
		} else {
			System.out.println("學生成績:D");
		}
	}
}