package CH08;
// 主程式類別
public class Ch8_6 {
	// 主程式
	public static void main(String[] args) {
		// 宣告Customer類別型態的變數, 並且建立物件
		Customer joe = new Customer("吳老師", "台北市", "桃園縣");
		joe.customerInfo(); // 呼叫物件的方法
	}
}

class Person5 { // Person類別宣告
	public String name; // 姓名
	public String address;// 地址

	// 成員方法: 傳回姓名
	public final String getName() {
		return name;
	}

	// 成員方法: 傳回地址
	public final String getAddress() {
		return address;
	}

	// 成員方法: 設定姓名
	public final void setName(String n) {
		name = n;
	}

	// 成員方法: 設定地址
	public final void setAddress(String a) {
		address = a;
	}
}

// Customer類別宣告
final class Customer extends Person5 {
	public String shoppingAddress; // 送貨地址

	// 建構子
	public Customer(String n, String a, String shopping) {
		setName(n);
		setAddress(a);
		shoppingAddress = shopping;
	}

	// 成員方法: 顯示客戶資料
	public void customerInfo() {
		System.out.println("-------------------");
		System.out.println(" 姓名: " + getName());
		System.out.println(" 地址: " + getAddress());
		System.out.println(" 送貨地址: " + shoppingAddress);
		System.out.println("-------------------");
	}
}
