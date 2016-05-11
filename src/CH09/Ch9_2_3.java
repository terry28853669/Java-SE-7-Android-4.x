package CH09;

//主程式類別
public class Ch9_2_3 {
	// 主程式
	public static void main(String[] args) {
		// 建立MyValue物件
		MyValue2 mv = new MyValue2();
		// 取得IValue介面物件
		IValue2 c = mv.getIValueObject();
		// 顯示方法的傳回值
		System.out.println("取得值= " + c.value());
	}
}

interface IValue2 { // IValue介面
	int value();
}

class MyValue2 { // MyValue類別
	private int v = 50;

	// 取得IValue物件
	public IValue2 getIValueObject() {
		final int v2 = 10;
		// 建立匿名內層類別的物件
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
