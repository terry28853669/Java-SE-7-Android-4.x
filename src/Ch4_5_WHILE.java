public class Ch4_5_WHILE {
	// �D�{��
	public static void main(String[] args) {
		int i, j; // �ܼƫŧi
		// ��ܼ��D�C
		System.out.print("    ");
		// for (i = 1; i <= 9; i++)
		// System.out.print(i + "      ");
		// System.out.println();
		i = 1;
		while (i <= 9) {
			System.out.print(i + "      ");
			i++;
		}
		System.out.println();
		// �_���j��
		// for (i = 1; i <= 9; ) {
		// // �������D
		//
		i = 1;
		while (i <= 9) {
			System.out.print(i + " ");

			j = 1;
			while (j <= 9) { // �ĤG�h�j��
				System.out.print(i + "X" + j + "=" + (i * j) + " ");
				if ((i * j) < 10 && j != 1)
					System.out.print(" "); // �վ��m
				j++;
			}

			System.out.println();
			i++;
		}
	}
}