public class Ch5_2_4 {
	// �D�{��
	public static void main(String[] args) {
		// �ܼƫŧi
		int c = 1; // �Ʀr
		boolean b = true; // ���L
		String str = "�i�L��"; // �r��
		int arr[] = { 1, 2, 3 }; // �}�C
		System.out.println("�I�sfuncA�e: " + c + "-" + b);
		// �I�s���O��k
		funcA(c, b);
		System.out.println("�I�sfuncA��: " + c + "-" + b);
		
		System.out.println("�I�sfuncB�e: " + arr[1] + "-" + str);
		// �I�s���O��k
		funcB(arr, str);
		System.out.println("�I�sfuncB��: " + arr[1] + "-" + str);
	}

	// ���O��k: integer�Mboolean���A�ѼƬ��ǭ�
	static void funcA(int c, boolean b) {
		c++;
		b = false;
		System.out.println("�bfuncA�� :" + c + "-" + b);
	}

	// ���O��k: �}�C�P�r�ꪫ��ѼƬ��ǧ}
	static void funcB(int temp[], String a) {
		temp[1] = 150;
		a = "���p��";
		System.out.println("�bfuncB�� : " + temp[1] + "-" + a);
	}

}
