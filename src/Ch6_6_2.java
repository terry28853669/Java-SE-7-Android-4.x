public class Ch6_6_2 {
	// ���O��k: �w�j�ƧǪk
	public static void main(String[] args) {
		// �ŧi�ܼ�
		int[] data = { 89, 34, 78, 45 };
		int i;
		System.out.print("��l�}�C: ");
		for (i = 0; i < data.length; i++)
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");
		int j, temp; // �ܼƫŧi
		// �Ĥ@�h�j��
		for (j = data.length; j > 1; j--)
			// �ĤG�h�j��
			for (i = 0; i < j - 1; i++)
				// ����۾F���}�C����
				if (data[i + 1] < data[i]) {
					temp = data[i + 1]; // �洫�⤸��
					data[i + 1] = data[i];
					data[i] = temp;
				}
		System.out.print("�Ƨǰ}�C: ");
		for (i = 0; i < data.length; i++)
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");
	}
}