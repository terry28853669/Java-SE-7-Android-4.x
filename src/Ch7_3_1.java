public class Ch7_3_1 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Student類別型態的變數
      Student  current, empty;
      // 建立物件實例
      Student joe = new Student();
      Student jane = new Student();
      current = joe;
      empty = null;  // 指定成null參考
      joe.name = "陳會安";  // 設定joe物件的變數
      joe.address = "台北縣";
      joe.age = 37;
      jane.name = "江小魚"; // 設定jane物件的變數
      jane.address = "台北市";
      jane.age = 30;
      joe.printNameCard();  // 呼叫物件的方法
      jane.printNameCard();
      current.printNameCard();
   }
}

