// �D�{�����O
public class Ch7_3_3 {
	// �D�{��
	public static void main(String[] args) {
		int age; // �ܼƫŧi
		String name, address;
		// �ŧiStudent�����ܼƥB�إߪ���
		Student3 joe = new Student3();
		joe.setName("������"); // �I�s��k�]�wjoe���
		joe.setAddress("�x�_��");
		joe.setAge(19);
		joe.printNameCard(); // ��ܾǥ͸��
		// ���o�ǥ͸��
		name = joe.getName();
		address = joe.getAddress();
		age = joe.getAge();
		// ��ܾǥ͸��
		System.out.println("[�m�W]: " + name);
		System.out.println("[�a�}]: " + address);
		System.out.println("[�~��]: " + age);
	}
}

class Student3 { // Student���O�ŧi
	// �����ܼ�
	private String name; // �m�W
	private String address;// �a�}
	private int age; // �~��

	// ������k: ��ܾǥͦW�P���
	public void printNameCard() {
		System.out.println("�m�W: " + name);
		System.out.println("�a�}: " + address);
		System.out.println("�~��: " + age);
		System.out.println("-------------------");
	}

	// ������k: �]�w�m�W���
	public void setName(String n) {
		name = n;
	}

	// ������k: �]�w�a�}���
	public void setAddress(String a) {
		address = a;
	}

	// ������k: �]�w�~�ָ��
	public boolean setAge(int v) {
		if (validAge(v)) { // �ˬd�O�_�X�k
			age = v; // �]�w�~��
			return true; // �]�w���\
		} else
			return false; // �]�w����
	}

	// ������k: �Ǧ^�m�W
	public String getName() {
		return name;
	}

	// ������k: �Ǧ^���
	public String getAddress() {
		return address;
	}

	// ������k: �Ǧ^�~��
	public int getAge() {
		return age;
	}

	// ������k: �ˬd�~�ָ��
	private boolean validAge(int a) {
		// �ˬd�~�ָ�ƬO�_�b�d��
		if (a < 20 || a > 50)
			return false;
		else
			return true; // �X�k���~�ָ��
	}
}