public class Ch6_3_2_indexOf {
	// 主程式
	public static void main(String[] args) {
		// 使用建構子建立字串物件
		String str2;
		str2 = new String("藍鳥隊台灣右投王建民原訂23日在3A先發，不過賽前臨時被取消，第一時間令人摸不著頭緒，"
				+ "3A水牛城野牛隊總教練布朗指出，「這不是我的決定。」美國媒體《水牛城新聞報》指出，"
				+ "他有可能在星期六(台灣時間25日)在休士頓先發。」意指建仔將重返大聯盟。");
		System.out.println("str2字串:\"" + str2 + "\"");
		// 顯示字串長度和大小寫轉換
		System.out.println("/str2長度:" + str2.length());
		// 搜尋字元和子字串
		System.out.print("中-字串indexOf(\"，\"): ");
		System.out.println(str2.indexOf("，"));
		int a = 0;
		while (a !=-1){
			if (a==0){
				a=str2.indexOf("，",a);
			}else{
				a=str2.indexOf("，",a+1);
			}			
			if (a==-1){
				break;
			}
			System.out.println("出現位置："+a);
			System.out.println(str2.substring(a-5, a+5));
		}
	}
}