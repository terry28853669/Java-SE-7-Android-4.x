package CH09;

//�D�{�����O
public class Ch9_4_2 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧi���O���A���ܼ�, �åB�إߪ���
		Circle2 c = new Circle2(6.0);
		Rectangle2 r = new Rectangle2(10.0, 15.0);
		Triangle2 t = new Triangle2(20.0, 15.0);
		// �I�s������������karea()
		c.area();// ���
		r.area();// �����
		t.area();// �T����
	}
}

interface IArea { // IArea�����ŧi
	// ������k: �p�⭱�n
	void area();
}

class Circle2 implements IArea { // Circle���O�ŧi
	private double r; // �b�|

	// �غc�l
	public Circle2(double r) {
		this.r = r;
	}

	// ������k: ��@������karea()
	public void area() {
		System.out.println("��έ��n: " + 3.1416 * r * r);
	}
}

class Rectangle2 implements IArea { // Rectangle���O�ŧi
	private double width; // �e
	private double height; // ��

	// �غc�l
	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// ������k: ��@������karea()
	public void area() {
		System.out.println("����έ��n: " + (width * height));
	}
}

class Triangle2 implements IArea { // Triangle���O�ŧi
	private double height; // ��
	private double bottom; // �T���Ω���

	// �غc�l
	public Triangle2(double height, double bottom) {
		this.height = height;
		this.bottom = bottom;
	}

	// ������k: ��@������karea()
	public void area() {
		System.out.println("�T���έ��n: " + height * bottom / 2.0);
	}
}
