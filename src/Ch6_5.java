public class Ch6_5 {
	// 主程式
	public static void main(String[] args) {
		// String物件陣列
		String[] username = new String[5];
		username[0] = "周傑輪";
		username[1] = "楊過";
		username[2] = "陳允傑";
		username[3] = "江小魚";
		username[4] = "小龍女";
		// 使用迴圈顯示陣列內容
		for (int i = 0; i < username.length; i++) {
			System.out.println(username[i] + " / " + username[i].length());
		}
	}
}