import java.util.Scanner;

public class Ch4_2_2 {
	// �D�{��
	public static void main(String[] args) {
		// �إ�Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�m�W=> ");
		String name = sc.nextLine(); // ���o�r��
		System.out.print("�п�J���Z=> ");
		int grade = sc.nextInt(); // ���o���
		System.out.print("�п�J����=> ");
		double height = sc.nextDouble(); // ���o�B�I��
		System.out.println("�m�W:" + name);
		System.out.println("���Z:" + grade);
		System.out.println("����:" + height);
	}
}