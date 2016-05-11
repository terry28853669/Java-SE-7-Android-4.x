package CH08;
// �D�{�����O
public class Ch8_2_2 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧi���O���A���ܼ�, �åB�إߪ���
		Circle c = new Circle(16.0, 15.0, 15.0);
		// �I�s���󪺤�����karea()
		c.area();
		// ��ܤ������`�ƭ�
		System.out.println("PI�`��: " + IArea.PI);
	}
}

interface IArea { // IArea�����ŧi
	// �`�ƪ��ŧi
	final double PI = 3.1415926;
	// ������k: �p�⭱�n
	void area();
}

class Circle implements IArea { // Circle���O�ŧi
	public double x; // X�y��
	public double y; // y�y��
	private double r; // �b�|
	// �غc�l
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	// ��@IArea��������karea()
	public void area() {
		System.out.println("�ꭱ�n: " + PI * r * r);
	}
}