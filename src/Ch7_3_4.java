// �D�{�����O
public class Ch7_3_4 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiDate���O���A���ܼ�, �åB�إߪ���
		Date myBirthday = new Date();
		Date oneBirthday = new Date();
		Date today = new Date();
		Date myday = new Date();
		// ���w������
		myBirthday.setDate(13, 9, 1970);
		oneBirthday.setDate(12, 6);
		today.setDate(5L, 10L, 2011L);
		myday.setDate("10", "10", "1973");
		System.out.print("�ڪ��ͤ�: ");
		myBirthday.printDate(); // �I�s���󪺤�k
		System.out.print("�k�ͥͤ�: ");
		oneBirthday.printDate();
		System.out.print("����: ");
		today.printDate();
		System.out.print("����2: ");
		myday.printDate();
	}
}
class Date { // Date���O�ŧi
	private int day;
	private int month;
	private int year;

	// ������k(1): �]�w������
	public void setDate(int d, int m, int y) {
		day = d; // �]�w���
		month = m; // �]�w���
		year = y; // �]�w�~��
	}

	// ������k(2): �]�w������
	public void setDate(int d, int m) {
		day = d; // �]�w���
		month = m; // �]�w���
		year = 1975; // �]�w�~��
	}

	// ������k(3): �]�w������
	public void setDate(long d, long m, long y) {
		day = (int) d; // �]�w���
		month = (int) m; // �]�w���
		year = (int) y; // �]�w�~��
	}
	public void setDate(String d, String m, String y) {
		day = Integer.valueOf(d); // �]�w���
		month = Integer.valueOf(m); // �]�w���
		year = Integer.valueOf(y); // �]�w�~��
	}
	// ������k: ��ܤ�����
	public void printDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}