package CH08;
// 主程式類別
public class Ch8_1_3 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Student類別型態的變數, 並且建立物件
      Student2 tom = new Student2(2234,"張無忌",185.0,55);
      // 顯示學生資料
      tom.printClassName();
      tom.personInfo();
   }
}

class Person2 {  // Person類別宣告
	   private int id;         // 身份字號
	   private String name;    // 姓名
	   private double height;  // 身高
	   // 類別方法: 顯示類別名稱
	   public static void printClassName() {
	      System.out.println("類別名稱: Person");
	   }
	   // 成員方法: 取得身份字號
	   public int getID() { return id; }
	   // 成員方法: 取得姓名
	   public String getName() { return name; }
	   // 成員方法: 取得身高
	   public double getHeight() { return height; }
	   // 成員方法: 設定身份字號
	   public void setID(int id) { this.id = id; }
	   // 成員方法: 設定姓名
	   public void setName(String n) { name = n; }
	   // 成員方法: 設定身高
	   public void setHeight(double h) { height = h; }
	   // 成員方法: 顯示個人資料
	   public void personInfo() {
	      System.out.println("字號: " + id);
	      System.out.println("姓名: " + name);
	      System.out.println("身高: " + height);
	   }
	}
	class Student2 extends Person2 {  // Student類別宣告
	   private int grade;     // 成績
	   private double height;  // 身高
	   // 建構子
	   public Student2(int id,String n,double h, int grade) {
	      setID(id);      // 呼叫父類別的成員方法
	      setName(n);
	      setHeight(h);
	      this.grade = grade;
	   }
	   public void setHeight(double h) { height = h; }
	   public double getHeight() { return height; }
	   // 隱藏類別方法: 顯示類別名稱
	   public static void printClassName() {
	      System.out.println("類別名稱: Student");
	   }
	   // 成員方法: 顯示學生資料
	   public void personInfo() {
	      System.out.println("[學生資料]=====");
	      System.out.println("字號: " + getID());
	      System.out.println("姓名: " + getName());
	      System.out.println("身高: " + getHeight());
	      System.out.println("成績: " + grade);
	   }
	}