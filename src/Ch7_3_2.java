// �D�{�����O
public class Ch7_3_2 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiStudent�����ܼƥB�إߪ���
		Student2 joe = new Student2();
		Student2 jane = new Student2();
		joe.setName("���|�w"); // �I�s��k�]�wjoe���
		joe.setAddress("�x�_��");
		joe.setAge(37);
		jane.setName("���p��"); // �I�s��k�]�wjane���
		jane.setAddress("�x�_��");
		jane.setAge(30);
		jane.printNameCard(); // �I�s��k��ܾǥ͸��
		// ���o�ǥ͸��
		String name = joe.getName();
		String address = joe.getAddress();
		int age = joe.getAge();
		// ��ܾǥ͸��
		System.out.println("[�m�W]: " + name);
		System.out.println("[�a�}]: " + address);
		System.out.println("[�~��]: " + age);
	}
}

