package CH08;
// �D�{�����O
public class Ch8_6 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiCustomer���O���A���ܼ�, �åB�إߪ���
		Customer joe = new Customer("�d�Ѯv", "�x�_��", "��鿤");
		joe.customerInfo(); // �I�s���󪺤�k
	}
}

class Person5 { // Person���O�ŧi
	public String name; // �m�W
	public String address;// �a�}

	// ������k: �Ǧ^�m�W
	public final String getName() {
		return name;
	}

	// ������k: �Ǧ^�a�}
	public final String getAddress() {
		return address;
	}

	// ������k: �]�w�m�W
	public final void setName(String n) {
		name = n;
	}

	// ������k: �]�w�a�}
	public final void setAddress(String a) {
		address = a;
	}
}

// Customer���O�ŧi
final class Customer extends Person5 {
	public String shoppingAddress; // �e�f�a�}

	// �غc�l
	public Customer(String n, String a, String shopping) {
		setName(n);
		setAddress(a);
		shoppingAddress = shopping;
	}

	// ������k: ��ܫȤ���
	public void customerInfo() {
		System.out.println("-------------------");
		System.out.println(" �m�W: " + getName());
		System.out.println(" �a�}: " + getAddress());
		System.out.println(" �e�f�a�}: " + shoppingAddress);
		System.out.println("-------------------");
	}
}
