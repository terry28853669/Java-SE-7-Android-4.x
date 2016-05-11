// 主程式類別
public class Ch7_3_2_2 {
	// 主程式
	public static void main(String[] args) {
		// 宣告Student物件變數且建立物件
		Student2[] joe = new Student2[2];
		joe[0].setName("陳會安"); // 呼叫方法設定joe資料
		joe[0].setAddress("台北縣");
		joe[0].setAge(37);
		joe[0].printNameCard(); // 呼叫方法顯示學生資料
		// 取得學生資料
		String name = joe[0].getName();
		String address = joe[0].getAddress();
		int age = joe[0].getAge();
		// 顯示學生資料
		System.out.println("[姓名]: " + name);
		System.out.println("[地址]: " + address);
		System.out.println("[年齡]: " + age);
	}
}

