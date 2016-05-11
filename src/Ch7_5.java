// �D�{�����O
public class Ch7_5 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiCustomer���O���A���ܼƥB�إߪ���
		Customer c1 = new Customer(1, 'L', 1, 15, 1967);
		Customer c2 = new Customer(2, 'H', 5, 25, 1978);
		c1.printCustomer(); // �I�s���󪺹�Ҥ�k
		c2.printCustomer();
	}
}

class Customer { // Customer���O�ŧi
	// �������
	private int id; // �s��
	private char rank; // ����
	private Date2 birthday; // �ͤ�

	// �غc�l: �ϥΰѼƳ]�w��l��
	public Customer(int id, char r, int m, int d, int y) {
		this.id = id;
		rank = r;
		this.birthday = new Date2(m, d, y); // �إ�Date����
	}

	// ������k: ��ܫȤ���
	public void printCustomer() {
		// ��ܫȤ���
		System.out.println("[�Ȥ���]============");
		System.out.println("�s��: " + id);
		System.out.println("����: " + rank);
		System.out.print("�ͤ�: ");
		birthday.printDate();
	}
}

class Date2 { // Date���O�ŧi
	// �������
	private int day;
	private int month;
	private int year;

	// �غc�l: �ϥΰѼƳ]�w������ƪ�l��
	public Date2(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// ������k: ��ܤ�����
	public void printDate() {
		// ��X������ƪ���, ��M�~
		System.out.println(month + "-" + day + "-" + year);
	}
}