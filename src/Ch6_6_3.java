public class Ch6_6_3 {
	// ���O��k: �u�ʷj�M�k
	public static void main(String[] args) {
		// �ŧi�ܼ�
		int[] data = { 89, 34, 78, 45, 12, 99, 23 };
		int i, index = 0;
		System.out.print("��l�}�C: ");
		for (i = 0; i < data.length; i++)
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");
		java.util.Scanner sc = // �إ�Scanner����
		new java.util.Scanner(System.in);
		System.out.print("�п�J���=> ");
		int target = sc.nextInt(); // ���o���
		//�u�ʷj�M��k
		for (i = 0; i < data.length; i++) {
			// ����O�_�O�ؼЭ�
			if (data[i] == target) {
				index = i;
				break;
			}
			index = -1;
		}
		if (index != -1) {
			System.out.print("�j�M���: " + target);
			System.out.println("(" + index + ")");
		} else
			System.out.println("�S���j�M���: " + target);
	}
}