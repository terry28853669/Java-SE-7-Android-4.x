package CH10;

// �D�{�����O
public class Ch10_2_3 {
	// �D�{��
	public static void main(String[] args) {
		try {
			int i;
			for (i = 0; i < 10; i++) {
				if (i == 5) {
					// ��X�ۭq���ҥ~
					throw new UserException(5);
				}
				System.out.println("�X������: " + i);
			}
		} catch (UserException e) {
			// �B�z�ۭq���ҥ~
			System.out.println("�ҥ~����: " + e.getMessage());
			System.out.println("�ҥ~��]: ");
			e.printStackTrace();
		} finally {
			System.out.println("�ҥ~�B�z����!");
		}
	}
}

// �ۭqException���O
class UserException extends Exception {
	private static final long serialVersionUID = 1L;
	// �ܼƫŧi
	int data;

	// �غc�l
	public UserException(int data) {
		this.data = data;
	}

	// �мggetMessaeg()��k
	public String getMessage() {
		return ("�X�����ƤӦh: " + data);
	}
}