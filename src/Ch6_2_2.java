public class Ch6_2_2 {
	// �D�{��
	public static void main(String[] args) {
		// �ܼƫŧi
		int i, j, total, sum;
		// �إߤG���}�C
		int[][] grades = { { 54, 68 }, { 67, 78 }, { 89, 93 } };
		// �ϥα_���j��p���`�M
		total = 0;
		for (j = 0; j < grades.length; j++) {
			sum = 0;
			for (i = 0; i < grades[j].length; i++) {
				System.out.print(grades[j][i] + " ");
				sum += grades[j][i];
				total += grades[j][i];
			}
			System.out.println("==>�p�p: " + sum);
		}
		System.out.println("���Z�`�M: " + total);		
	}
}