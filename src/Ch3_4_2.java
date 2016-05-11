public class Ch3_4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("負號運算:-7    = " + -7);
		System.out.println("乘法運算:5 * 6 = " + 5 * 6);
		System.out.println("除法運算:7.0/2.0 = " + 7.0 / 2.0);
		System.out.println("餘數運算:7 % 2 = " + 7 % 2);
		System.out.println("加法運算:4 + 3 = " + (4 + 3));
		System.out.println("減法運算:4 - 3 = " + (4 - 3));
		// 字串連接運算子
		String str1 = "Java是";
		String str2 = "一種物件導向程式語言";
		System.out.println("字串連接: " + (str1 + str2));
		int x, y, f, c; // 變數宣告
		x = 6;
		y = 3;
		f = x * x - 2 * x + 3; // 數學公式
		System.out.println("x*x-2*x+3 = " + f);
		f = (x + y) * (x + y) + 5;
		System.out.println("(x+y)*(x+y)+5 = " + f);
		c = 80;
		System.out.print("攝氏: " + c + "度= 華氏: ");
		System.out.println((9.0 * c) / 5.0 + 32.0);
	}

}
