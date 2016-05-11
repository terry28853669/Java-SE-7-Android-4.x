public class Ch7_3_1_2 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Student類別型態的變數
      Student[] joe = new Student[2];
      joe[0]=new Student();      
      joe[0].name="吳老師";
      joe[0].address = "新北市";
      joe[0].age = 37;
      joe[1]=new Student(); 
      joe[1].name = "江小魚"; // 設定jane物件的變數
      joe[1].address = "台北市";
      joe[1].age = 30;
      joe[0].printNameCard();  // 呼叫物件的方法
      joe[1].printNameCard(); 
      for (int i=0;i<joe.length;i++){
          joe[i].printNameCard();  // 呼叫物件的方法
      }
   }
}

