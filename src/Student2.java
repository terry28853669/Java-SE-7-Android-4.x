class Student2 { // Student���O�ŧi
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
	public void setAge(int v) {
		age = v;
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
}
