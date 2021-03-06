package CH08;
// 主程式類別
public class Ch8_1_4 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Student類別型態的變數, 並且建立物件
      Student3 mary =
              new Student3("A2255","小龍女",165.0,65);
      // 顯示學生資料
      mary.studentInfo();
   }
}
class Person3 {  // Person類別宣告
	   public String id;          // 身份字號
	   private String name;    // 姓名
	   private double height;  // 身高
	   // 成員方法: 取得姓名
	   public String getName() { return name; }
	   // 成員方法: 取得身高
	   public double getHeight() { return height; }
	   // 成員方法: 設定姓名
	   public void setName(String n) { name = n; }
	   // 成員方法: 設定身高
	   public void setHeight(double h) { height = h; }
	}

class Student3 extends Person3 {  // Student類別宣告
	   private String id;     // 隱藏成員變數
	   private int grade;     // 成績
	   // 建構子
	   public Student3(String id,String n,double h,int grade) {
	      setName(n);  // 呼叫父類別的成員方法
	      setHeight(h);
	      super.id = id;
	      this.grade = grade;
	   }
	   // 成員方法: 顯示學生資料
	   public void studentInfo() {
	      System.out.println("[學生資料]=====");
	      System.out.println("字號: " + super.id);
	      System.out.println("姓名: " + getName());
	      System.out.println("身高: " + getHeight());
	      System.out.println("成績: " + grade);
	   }
	}