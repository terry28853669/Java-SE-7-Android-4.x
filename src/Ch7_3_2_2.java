// �D�{�����O
public class Ch7_3_2_2 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiStudent�����ܼƥB�إߪ���
		Student2[] joe = new Student2[2];
		joe[0].setName("���|�w"); // �I�s��k�]�wjoe���
		joe[0].setAddress("�x�_��");
		joe[0].setAge(37);
		joe[0].printNameCard(); // �I�s��k��ܾǥ͸��
		// ���o�ǥ͸��
		String name = joe[0].getName();
		String address = joe[0].getAddress();
		int age = joe[0].getAge();
		// ��ܾǥ͸��
		System.out.println("[�m�W]: " + name);
		System.out.println("[�a�}]: " + address);
		System.out.println("[�~��]: " + age);
	}
}

