public class Ch6_3_2 {
	// �D�{��
	public static void main(String[] args) {
		// �}�C�ŧi
		char[] charArr = { ' ', 'J', 'a', 'v', 'a', ' ' };
		String str = " JAVA "; // �ϥ�String���O�ŧi�r��
		// �ϥΫغc�l�إߦr�ꪫ��
		String str1, str2, str3, str4;
		str1 = new String(charArr); // �ϥΦr���}�C
		str2 = new String("�{���y�����{���]�p");
		str3 = new String("How to use computer!");
		str4 = "use";
		System.out.println("str�r��:\"" + str + "\"");
		System.out.println("str1�r��:\"" + str1 + "\"");
		System.out.println("str2�r��:\"" + str2 + "\"");
		System.out.println("str3�r��:\"" + str3 + "\"");
		System.out.println("str4�r��:\"" + str4 + "\"");
		// �l�r��M�r�����B�z
		System.out.print("�^��str1.charAt(4): ");
		System.out.println(str1.charAt(3));
		System.out.print("����str2.substring(2, 6): ");
		System.out.println(str2.substring(2, 6));
		System.out.print("���N-�^str1.replace('a','b'):");
		System.out.println(str1.replace('a', 'b'));
		System.out.print("�R���ťզr��str1.trim(): ");
		System.out.println(str1.trim());
		String str0 = str1.concat(str2); // �s����r��
		System.out.println("�s��str1.concat(str2): " + str0);
	}
}