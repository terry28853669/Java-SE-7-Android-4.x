package CH09;

//�D�{�����O
public class Ch9_2_2 {
	// �D�{��
	public static void main(String[] args) {
		// �إ�MyValue����
		MyValue mv = new MyValue();
		// ���oIValue��������
		IValue c = mv.getIValueObject();
		// ��ܤ�k���Ǧ^��
		System.out.println("���o��= " + c.value());
	}
}

interface IValue { // IValue����
	int value();
}

class MyValue { // MyValue���O
	// ���oIValue����
	public IValue getIValueObject() {
		// �إ߰ΦW���h���O������
		IValue temp = new IValue() {
			private int v = 50;

			public int value() {
				return v;
			}
		};
		return temp;
	}
}