package CH08;
// �D�{�����O
public class Ch8_1_2 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiStudent���O���A���ܼ�, �åB�إߪ���
		Student joe = new Student(1234, "�d�Ѯv", 175.0, 85);
		Student jane = new Student(3456, "���p��", 150.0, 65);
		// ��鶴�� - �I�s�~�Ӫ���k
		jane.setHeight(158.0);
		// ��ܾǥ͸��
		joe.studentInfo();
		jane.studentInfo();
	}
}

class Person { // Person���O�ŧi
	private int id; // �����r��
	private String name; // �m�W
	private double height; // ����

	// ������k: �]�w�����r��
	public void setID(int id) {
		this.id = id;
	}

	// ������k: �]�w�m�W
	public void setName(String n) {
		name = n;
	}

	// ������k: �]�w����
	public void setHeight(double h) {
		height = h;
	}

	// ������k: ��ܭӤH���
	public void personInfo() {
		System.out.println("�r��: " + id);
		System.out.println("�m�W: " + name);
		System.out.println("����: " + height);
	}
}

class Student extends Person { // Student���O�ŧi
	private int grade; // ���Z

	// �غc�l
	public Student(int id, String n, double h, int grade) {
		setID(id); // �I�s�����O��������k
		setName(n);
		setHeight(h);
		this.grade = grade;
	}

	// ������k: ��ܾǥ͸��
	public void studentInfo() {
		System.out.println("[�ǥ͸��]=====");
		personInfo(); // �I�s�����O��������k
		System.out.println("���Z: " + grade);
	}
}