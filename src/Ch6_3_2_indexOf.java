public class Ch6_3_2_indexOf {
	// �D�{��
	public static void main(String[] args) {
		// �ϥΫغc�l�إߦr�ꪫ��
		String str2;
		str2 = new String("�ų����x�W�k����إ���q23��b3A���o�A���L�ɫe�{�ɳQ�����A�Ĥ@�ɶ��O�H�N�����Y���A"
				+ "3A�������������`�нm���ԫ��X�A�u�o���O�ڪ��M�w�C�v����C��m�������s�D���n���X�A"
				+ "�L���i��b�P����(�x�W�ɶ�25��)�b��h�y���o�C�v�N���إJ�N����j�p���C");
		System.out.println("str2�r��:\"" + str2 + "\"");
		// ��ܦr����שM�j�p�g�ഫ
		System.out.println("/str2����:" + str2.length());
		// �j�M�r���M�l�r��
		System.out.print("��-�r��indexOf(\"�A\"): ");
		System.out.println(str2.indexOf("�A"));
		int a = 0;
		while (a !=-1){
			if (a==0){
				a=str2.indexOf("�A",a);
			}else{
				a=str2.indexOf("�A",a+1);
			}			
			if (a==-1){
				break;
			}
			System.out.println("�X�{��m�G"+a);
			System.out.println(str2.substring(a-5, a+5));
		}
	}
}