public class Ch6_2_1 {
	// �D�{��
	public static void main(String[] args) {
		int i, sum = 0; // �ܼƫŧi
		double average, total = 0.0;
		// �إ�int�}�C
		int[] temp; // �ŧi�}�C�ܼ�
		int[] tips = { 150, 200, 300 };
		// �إ�double�}�C
//		double[] sales = new double[4];
//		sales[0] = 145.6; // �Ĥ@�u
//		sales[1] = 178.9; // �ĤG�u
//		sales[2] = 197.3; // �ĤT�u
//		sales[3] = 156.7; // �ĥ|�u
		double[] sales={145.6,178.9,197.3,156.7};
		temp = tips; // ���V�P�@�Ӱ}�C
		// �ϥ�for�j����ܰ}�C�ȩM�p���`�M
		for (i = 0; i < tips.length; i++) {
			sum += temp[i];
			System.out.print("[" + temp[i] + "]");
		}
//		for (int tmp : temp) {
//			sum += tmp;
//			System.out.print("[" + tmp + "]");
//		}
		System.out.println("\n�p�O�`�p: " + sum);
		// �ϥ�foreach�j����ܰ}�C�ȩM�p�⥭��
		for (double ele : sales) {
			total += ele;
			System.out.print("[" + ele + "]");
		}
		System.out.println("\n�~�Z�`�M: " + total);
		average = total /  sales.length;
		System.out.println("�����~�Z: " + average);
	}
}