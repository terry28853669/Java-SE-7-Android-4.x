public class Ch6_6_3_2 {

	// �D�{��
	public static void main(String[] args) {
		// �ŧi�ܼ�
		int[] data = { 89, 34, 78, 45, 12, 99, 23 };
		int i, index;
		System.out.print("��l�}�C: ");
		for (i = 0; i < data.length; i++)
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");
		java.util.Scanner sc = // �إ�Scanner����
		new java.util.Scanner(System.in);
		System.out.print("�п�J���=> ");
		int target = sc.nextInt(); // ���o���
		// �I�s�u�ʷj�M��k
		index = seq(data, target);
		if (index != -1) {
			System.out.print("�j�M���: " + target);
			System.out.println("(" + index + ")");
		} else
			System.out.println("�S���j�M���: " + target);
	}
	// ���O��k: �u�ʷj�M�k
	private static int seq(int[] data, int target) {
		int i; // �ܼƫŧi
		// �j�M�j��
		for (i = 0; i < data.length; i++)
			// ����O�_�O�ؼЭ�
			if (data[i] == target)
				return i;
		return -1;
	}

}