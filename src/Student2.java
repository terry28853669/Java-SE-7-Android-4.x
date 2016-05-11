class Student2 { // Student類別宣告
	// 成員變數
	private String name; // 姓名
	private String address;// 地址
	private int age; // 年齡

	// 成員方法: 顯示學生名牌資料
	public void printNameCard() {
		System.out.println("姓名: " + name);
		System.out.println("地址: " + address);
		System.out.println("年齡: " + age);
		System.out.println("-------------------");
	}

	// 成員方法: 設定姓名資料
	public void setName(String n) {
		name = n;
	}

	// 成員方法: 設定地址資料
	public void setAddress(String a) {
		address = a;
	}

	// 成員方法: 設定年齡資料
	public void setAge(int v) {
		age = v;
	}

	// 成員方法: 傳回姓名
	public String getName() {
		return name;
	}

	// 成員方法: 傳回月份
	public String getAddress() {
		return address;
	}

	// 成員方法: 傳回年齡
	public int getAge() {
		return age;
	}
}
