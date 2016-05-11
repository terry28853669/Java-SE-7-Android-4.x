// 主程式類別
public class Ch7_3_2 {
	// 主程式
	public static void main(String[] args) {
		// 宣告Student物件變數且建立物件
		Student2 joe = new Student2();
		Student2 jane = new Student2();
		joe.setName("陳會安"); // 呼叫方法設定joe資料
		joe.setAddress("台北縣");
		joe.setAge(37);
		jane.setName("江小魚"); // 呼叫方法設定jane資料
		jane.setAddress("台北市");
		jane.setAge(30);
		jane.printNameCard(); // 呼叫方法顯示學生資料
		// 取得學生資料
		String name = joe.getName();
		String address = joe.getAddress();
		int age = joe.getAge();
		// 顯示學生資料
		System.out.println("[姓名]: " + name);
		System.out.println("[地址]: " + address);
		System.out.println("[年齡]: " + age);
	}
}

