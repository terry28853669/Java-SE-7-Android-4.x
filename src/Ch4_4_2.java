public class Ch4_4_2 {
	// �D�{��
	public static void main(String[] args) {
		java.util.Scanner sc = // �إ�Scanner����
		new java.util.Scanner(System.in);
		System.out.print("�п�J�̤j���h��=> ");
		int max = sc.nextInt(); // ���o�̤j���h��
		double n = 1;
//		int level = 1; // �ܼƫŧi
//		// while�j��ԭz
//		while (level <= max) {
//			n *= level; // �p�ⶥ�h
//			System.out.println(level + "!=" + n);
//			level++;
//		}
		for (int level = 1;level <= max;level++){
			n *= level; // �p�ⶥ�h
			System.out.println(level + "!=" + n);			
		}	
	}
}