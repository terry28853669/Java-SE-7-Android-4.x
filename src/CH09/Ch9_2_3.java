package CH09;

//�D�{�����O
public class Ch9_2_3 {
	// �D�{��
	public static void main(String[] args) {
		// �إ�MyValue����
		MyValue2 mv = new MyValue2();
		// ���oIValue��������
		IValue2 c = mv.getIValueObject();
		// ��ܤ�k���Ǧ^��
		System.out.println("���o��= " + c.value());
	}
}

interface IValue2 { // IValue����
	int value();
}

class MyValue2 { // MyValue���O
	private int v = 50;

	// ���oIValue����
	public IValue2 getIValueObject() {
		final int v2 = 10;
		// �إ߰ΦW���h���O������
		IValue2 temp = new IValue2() {
			private int v = 20;

			public int value() {
				int v = 30;
				return MyValue2.this.v + this.v + v + v2;
			}
		};
		return temp;
	}
}
