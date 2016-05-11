public class Ch6_3_2_2 {
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
		// 顯示字串str和str1的比較結果
		System.out.print("比較str與str1字串: ");
		System.out.println(str.compareTo(str1));
		System.out.print("比較str與str1字串-不分大小寫: ");
		System.out.println(str.compareToIgnoreCase(str1));
		// 字串str與str1是否相等
		System.out.print("str與str1字串是否相等: ");
		System.out.println(str.equals(str1));
		System.out.print("str與str1是否相等-不分大小寫: ");
		System.out.println(str.equalsIgnoreCase(str1));
		// 檢查字串的字頭和字尾
		System.out.print("str4的結尾是否為\"s\": ");
		System.out.println(str4.endsWith("e"));
		System.out.print("str4的字頭是否為\"u\": ");
		System.out.println(str4.startsWith("u"));
	}
}