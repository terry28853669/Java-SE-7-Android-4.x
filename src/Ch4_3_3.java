import java.util.Scanner;

public class Ch4_3_3 {
	// �D�{��
	public static void main(String[] args) {
		Scanner sc = // �إ�Scanner����
		new Scanner(System.in);
		System.out.print("�п�J���Z=> ");
		int grade = sc.nextInt(); // ���o���Z
		char gpa; // �ܼƫŧi
		System.out.println("����: " + grade);
		// if else if����ԭz
		if (grade >= 80) {
			System.out.println("�ǥͦ��Z:A");
			gpa = 'A';
		} else if (grade >= 70) {
			System.out.println("�ǥͦ��Z:B");
			gpa = 'B';
		} else {
			System.out.println("�ǥͦ��Z:C");
			gpa = 'C';
		}
		System.out.println("GPA: " + gpa);
		// switch ����ԭz
		switch (gpa) {
		case 'A':
			System.out.println("�ǥͦ��Z�W�L:80");
			break;
		case 'B':
			System.out.println("�ǥͦ��Z:70~79");
			break;
		case 'C':
			System.out.println("�ǥͦ��Z:60~69");
			break;
		default:
			System.out.println("�ǥͦ��Z���ή�!");
		}
	}
}