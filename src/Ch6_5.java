public class Ch6_5 {
	// �D�{��
	public static void main(String[] args) {
		// String����}�C
		String[] username = new String[5];
		username[0] = "�P�ǽ�";
		username[1] = "���L";
		username[2] = "������";
		username[3] = "���p��";
		username[4] = "�p�s�k";
		// �ϥΰj����ܰ}�C���e
		for (int i = 0; i < username.length; i++) {
			System.out.println(username[i] + " / " + username[i].length());
		}
	}
}