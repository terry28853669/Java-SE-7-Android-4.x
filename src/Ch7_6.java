// �D�{�����O
public class Ch7_6 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiStudent���O���A���ܼ�, �åB�إߪ���
		Student6 std1 = new Student6(1, 68.0, 88.0, 56.0);
		Student6 std2 = new Student6(2, 75.0, 46.0, 90.0);
		System.out.println("�Ѯv�s��(Student): " + Student6.teacherNo);
		// �I�s���󪺤�k
		std1.printStudent();
		std2.printStudent();
		// ��ܾǥͤH��
		System.out.println("�ǥͤH��(std1): " + std1.getStudentCount());
		System.out.println("�ǥͤH��(std2): " + std2.getStudentCount());
		System.out.println("�ǥͤH��(Student): " + Student6.getStudentCount());
		Student6.teacherNo = "T101"; // ��s�Ѯv�s��
		std1.teacherNo = "T102";
		// ��ܦѮv�s��
		System.out.println("�Ѯv�s��(std1): " + std1.teacherNo);
		System.out.println("�Ѯv�s��(std2): " + std2.teacherNo);
		System.out.println("�Ѯv�s��(Student): " + Student6.teacherNo);
	}
}

class Student6 { // Student���O�ŧi
	// ���O�ܼ�: �Ѯv�s��
	public static String teacherNo = "T100";
	// ���O�ܼ�: �ǥͤH��
	private static int count = 0;
	private int stdno;
	private double test1, test2, test3;
	// �غc�l: �ϥΰѼƳ]�w��l��
	public Student6(int no, double t1, double t2, double t3) {
		stdno = no;
		this.test1 = t1; // �]�w���Z
		this.test2 = t2;
		this.test3 = t3;
		count++; // �ǥͤH�ƥ[�@
	}

	// ���O��k: �Ǧ^�ǥͪ��Ӽ�
	public static int getStudentCount() {
		return count;
	}

	// ������k: �p�⥭��
	private double getAverage() {
		return (test1 + test2 + test3) / 3;
	}

	// ������k: ��ܾǥ͸��
	public void printStudent() {
		// ��ܾǥͪ��򥻩M���Z���
		System.out.println("===�ǥ͸��============== ");
		System.out.println("�ǥ;Ǹ� : " + stdno);
		System.out.println("�ǥͦ��Z(1) : " + test1);
		System.out.println("�ǥͦ��Z(2) : " + test2);
		System.out.println("�ǥͦ��Z(3) : " + test3);
		System.out.println("���Z���� : " + getAverage());
	}
}