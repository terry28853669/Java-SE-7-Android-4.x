package CH10;

public class Ch10_1_4a {
	// ���O��k: ��ܨҥ~�T��
	static void printErrMsg(Exception e) {
		System.out.println("�ҥ~����: " + e.getMessage());
		System.out.print("�ҥ~��]: ");
		e.printStackTrace();
	}

	// �D�{��
	public static void main(String[] args) {
		int i;
		int[] data = { 22, 14, 36, 68, 87 };
		// �ҥ~�B�z�{���ԭz
		try {
			int index = (int) (Math.random() * 10);
			i = data[index]; // ���ͶW�L�}�C�d��ҥ~
			// ���Ͱ��H�s���ҥ~
			for (i = 2; i > -1; i--) {
				System.out.println("�p�⵲�G: " + 10 / i);
			}
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			printErrMsg(e);
		} finally {
			System.out.println("�ҥ~�B�z����");
		}
	}
}