package CH09;

//主程式類別
public class Ch9_4_2 {
	// 主程式
	public static void main(String[] args) {
		// 宣告類別型態的變數, 並且建立物件
		Circle2 c = new Circle2(6.0);
		Rectangle2 r = new Rectangle2(10.0, 15.0);
		Triangle2 t = new Triangle2(20.0, 15.0);
		// 呼叫介面的介面方法area()
		c.area();// 圓形
		r.area();// 長方形
		t.area();// 三角形
	}
}

interface IArea { // IArea介面宣告
	// 介面方法: 計算面積
	void area();
}

class Circle2 implements IArea { // Circle類別宣告
	private double r; // 半徑

	// 建構子
	public Circle2(double r) {
		this.r = r;
	}

	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("圓形面積: " + 3.1416 * r * r);
	}
}

class Rectangle2 implements IArea { // Rectangle類別宣告
	private double width; // 寬
	private double height; // 高

	// 建構子
	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("長方形面積: " + (width * height));
	}
}

class Triangle2 implements IArea { // Triangle類別宣告
	private double height; // 高
	private double bottom; // 三角形底長

	// 建構子
	public Triangle2(double height, double bottom) {
		this.height = height;
		this.bottom = bottom;
	}

	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("三角形面積: " + height * bottom / 2.0);
	}
}
