public class Ch6_3_2 {
	// 主程式
	public static void main(String[] args) {
		// 陣列宣告
		char[] charArr = { ' ', 'J', 'a', 'v', 'a', ' ' };
		String str = " JAVA "; // 使用String類別宣告字串
		// 使用建構子建立字串物件
		String str1, str2, str3, str4;
		str1 = new String(charArr); // 使用字元陣列
		str2 = new String("程式語言的程式設計");
		str3 = new String("How to use computer!");
		str4 = "use";
		System.out.println("str字串:\"" + str + "\"");
		System.out.println("str1字串:\"" + str1 + "\"");
		System.out.println("str2字串:\"" + str2 + "\"");
		System.out.println("str3字串:\"" + str3 + "\"");
		System.out.println("str4字串:\"" + str4 + "\"");
		// 子字串和字元的處理
		System.out.print("英文str1.charAt(4): ");
		System.out.println(str1.charAt(3));
		System.out.print("中文str2.substring(2, 6): ");
		System.out.println(str2.substring(2, 6));
		System.out.print("取代-英str1.replace('a','b'):");
		System.out.println(str1.replace('a', 'b'));
		System.out.print("刪除空白字元str1.trim(): ");
		System.out.println(str1.trim());
		String str0 = str1.concat(str2); // 連接兩字串
		System.out.println("連接str1.concat(str2): " + str0);
	}
}