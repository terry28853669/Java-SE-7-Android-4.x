import java.util.Scanner;

public class Ch4_3_2 {
	// �D�{��
	public static void main(String[] args) {
		Scanner sc = // �إ�Scanner����
		new Scanner(System.in);
		System.out.print("�п�J���Z=> ");
		int grade = sc.nextInt(); // ���o���Z
		// if/else����ԭz
		if (grade >= 80) {
			System.out.println("�ǥͦ��Z:A");
		} else if (grade >= 70) {
			System.out.println("�ǥͦ��Z:B");
		} else if (grade >= 60) {
			System.out.println("�ǥͦ��Z:C");
		} else {
			System.out.println("�ǥͦ��Z:D");
		}
	}
}