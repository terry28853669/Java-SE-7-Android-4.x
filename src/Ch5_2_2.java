import java.util.Scanner;
public class Ch5_2_2 {
	// �D�{��
	public static void main(String[] args) {
		Scanner sc = // �إ�Scanner����
		new Scanner(System.in);
		System.out.print("�п�J���ū�=> ");
		double c = sc.nextDouble(); // ���o�ū�
		System.out.print("�п�J�̤j��=> ");
		int max = sc.nextInt(); // ���o�̤j��
		convertTemp(c); // ���O��k���I�s
		sumN2N(1, max);
		Ch5_2_2.sumN2N(6, 10);
	}
	// ���O��k: �ഫ�ū�
	static void convertTemp(double c) {
		double f; // �ܼƫŧi
		System.out.println("���\t�ؤ�");
		f = (9.0 * c) / 5.0 + 32.0;
		System.out.println(c + "\t" + f);
	}
	// ���O��k: �p��N��N���Ʀr�`�M
	static void sumN2N(int start, int end) {
		int i, sum = 0; // �ܼƫŧi
		// for�j��ԭz
		for (i = start; i <= end; i++) {
			System.out.print("|" + i);
			sum += i;
		}
		System.out.print("\n" + start + "��" + end);
		System.out.println("���`�M: " + sum);
	}
}