package CH08;
// �D�{�����O
public class Ch8_2_3 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧi���O���A���ܼ�, �åB�إߪ���
		Circle2 c = new Circle2(16.0, 15.0, 15.0);
		// �I�s���󪺤�����karea()
		c.area();
		// �I�s���󪺤�����kshow()
		c.show();
	}
}

interface IArea2 { // IArea�����ŧi
	// �`�ƪ��ŧi
	final double PI = 3.1415926;

	// ������k: �p�⭱�n
	void area();
}

interface IShow { // IShow�����ŧi
	// ������k: ��ܰ򥻸��
	void show();
}

class Circle2 implements IArea2, IShow { // Circle���O�ŧi
	public double x; // X�y��
	public double y; // y�y��
	private double r; // �b�|

	// �غc�l
	public Circle2(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	// ��@IArea��������karea()
	public void area() {
		System.out.println("�ꭱ�n: " + PI * r * r);
	}

	// ��@IShow��������kshow()
	public void show() {
		System.out.println("���X�y��: " + x);
		System.out.println("���Y�y��: " + y);
		System.out.println("��b�|: " + r);
	}
}