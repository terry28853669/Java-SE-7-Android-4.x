import java.util.*;

public class Ch4_4_1 {
	// �D�{��
	public static void main(String[] args) {
		Scanner sc = // �إ�Scanner����
		new Scanner(System.in);
		System.out.print("�п�Jfor�j�骺�̤j��=> ");
		int max = sc.nextInt(); // ���o�̤j��
		int i, total = 0; // �ܼƫŧi
		// for�j��ԭz
		for (i = 1; i <= max; i++) {
			System.out.print("|" + i);
			total += i;
		}
		System.out.println("\n�q�p��" + max + "�`�M:" + total);
		System.out.println(" ----------------- ");
		// for�j��ԭz
		for (total = 0, i = max; i >= 1; i--) {
			System.out.print("|" + i);
			total += i;
		}
		System.out.println("\n�q" + max + "��p�`�M:" + total);
	}
}