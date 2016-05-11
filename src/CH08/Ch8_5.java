package CH08;
// 主程式類別
public class Ch8_5 {
	// 主程式
	public static void main(String[] args) {
		Shape s; // 抽象類別的物件變數
		Rectangle r; // 類別的物件變數
		// 宣告Rectangle類別型態的變數, 並且建立物件
		Rectangle r1 = new Rectangle(5.0, 15.0, 6.0, 5.0);

		// 顯示長方形r1的資料
		System.out.println("長方形r1的資料 =====");
		System.out.println("X,Y座標:" + r1.x + "," + r1.y);
		System.out.println("寬/高:" + r1.width + "/" + r1.height);
		r1.area(); // 呼叫物件的方法
		r1.perimeter();
	}
}

abstract class Shape { // Shape抽象類別宣告
	public double x; // X座標
	public double y; // y座標

	// 抽象方法: 計算面積
	public abstract void area();
}

interface IPerimeter { // IPerimeter介面宣告
	// 介面方法: 計算周長
	void perimeter();
}

// Rectangle類別宣告
class Rectangle extends Shape implements IPerimeter {
	public double width;
	public double height;

	// 建構子
	public Rectangle(double x, double y, double w, double h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}

	// 成員方法: 實作抽象方法area()
	public void area() {
		System.out.println("長方形面積:" + width * height);
	}

	// 成員方法: 實作介面方法perimeter()
	public void perimeter() {
		System.out.println("長方形周長:" + 2 * (width + height));
	}
}