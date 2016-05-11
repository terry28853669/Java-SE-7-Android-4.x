import java.util.Scanner;

public class Ch4_3_3 {
	// 主程式
	public static void main(String[] args) {
		Scanner sc = // 建立Scanner物件
		new Scanner(System.in);
		System.out.print("請輸入成績=> ");
		int grade = sc.nextInt(); // 取得成績
		char gpa; // 變數宣告
		System.out.println("分數: " + grade);
		// if else if條件敘述
		if (grade >= 80) {
			System.out.println("學生成績:A");
			gpa = 'A';
		} else if (grade >= 70) {
			System.out.println("學生成績:B");
			gpa = 'B';
		} else {
			System.out.println("學生成績:C");
			gpa = 'C';
		}
		System.out.println("GPA: " + gpa);
		// switch 條件敘述
		switch (gpa) {
		case 'A':
			System.out.println("學生成績超過:80");
			break;
		case 'B':
			System.out.println("學生成績:70~79");
			break;
		case 'C':
			System.out.println("學生成績:60~69");
			break;
		default:
			System.out.println("學生成績不及格!");
		}
	}
}