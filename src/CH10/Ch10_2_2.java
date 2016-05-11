package CH10;

public class Ch10_2_2 {
	// �D�{��
	public static void main(String[] args) {
		int result;
		try {
			// ���o�üƭ�
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			int c = (int) (Math.random() * 10);
			result = cal(a, b, c); // �I�s��k
			System.out.println("�p�⵲�G: " + result);
		} catch (IllegalArgumentException e) {
			// �B�zIllegalArgumentException�ҥ~
			System.out.println("�ҥ~����: " + e.getMessage());
			System.out.println("�ҥ~��]: ");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	// ���O��k: �p��a*b/c����
	static int cal(int a, int b, int c) throws IllegalArgumentException,
			ArrayIndexOutOfBoundsException {
		int index;
		int[] data = { 22, 14, 36, 68, 87 };
		if (c <= 0) { // ��XIllegalArgumentException�ҥ~
			throw new IllegalArgumentException("c����0!");
		} else {
			index = a * b / c;
			if (index >= 5) {
				// ��XArrayIndexOutOfBoundsException�ҥ~
				//throw new ArrayIndexOutOfBoundsException("�}�C���ޭȤj�󵥩�5!");
			}
		}
		return data[index];
	}
}