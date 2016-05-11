package CH09;

// �D�{�����O
public class Ch9_4_1 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧi���O���A���ܼ�, �åB�إߪ���
		Circle c = new Circle(5.0, 10.0, 5.0);
		Rectangle r = new Rectangle(10.0, 10.0, 15.0, 15.0);
		Triangle t = new Triangle(10.0, 10.0, 20.0, 5.0);
		// �I�s��H�������󪺩�H��karea()
		c.area();// ���
		r.area();// �����
		t.area();// �T����
	}
}

abstract class Shape { // Shape��H���O�ŧi
	public double x; // X�y��
	public double y; // y�y��

	// ��H��k: �p�⭱�n
	public abstract void area();
}

class Circle extends Shape { // Circle���O�ŧi
	private double r; // �b�|

	// �غc�l
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	// ������k: ��@��H��karea()
	public void area() {
		System.out.println("��έ��n: " + Math.PI*Math.pow(r, 2));
	}
}

class Rectangle extends Shape { // Rectangle���O�ŧi
	private double width; // �e
	private double height; // ��

	// �غc�l
	public Rectangle(double x, double y, double w, double h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}

	// ������k: ��@��H��karea()
	public void area() {
		System.out.println("����έ��n: " + (height * width));
	}
}

class Triangle extends Shape { // Triangle���O�ŧi
	private double height; // ��
	private double bottom; // �T���Ω�

	// �غc�l
	public Triangle(double x, double y, double h, double b) {
		this.x = x;
		this.y = y;
		height = h;
		bottom = b;
	}

	// ������k: ��@��H��karea()
	public void area() {
		System.out.println("�T���έ��n: " + height * bottom / 2.0);
	}
}