public class Ch5_5_1 {
   // 祘Α
   public static void main(String[] args) {
      // 程㎝程
      System.out.print("程max(34, 78): ");
      System.out.println(Math.max(34,78));
      System.out.print("程min(34, 78): ");
      System.out.println(Math.min(34,78));
      System.out.print("彼きround(34.567):");
      System.out.println(Math.round(34.567));
      System.out.print("彼きround(34.467):");
      System.out.println(Math.round(34.467));
      System.out.print("ceil(34.467):");
      System.out.println(Math.ceil(34.00001));
      System.out.print("floor(34.467):");
      System.out.println(Math.floor(34.999));
      System.out.print("rint(34):");
      System.out.println(Math.rint(34.51));
      System.out.print("睹计random(): ");
      System.out.println(Math.random());
      // 0-10睹计
      double no = Math.floor(Math.random()*11);
      System.out.println("0-10睹计: " + no);
      // 1-100睹计
      no = (int)(Math.random()*100 + 1);
      System.out.println("1-100睹计: " + no);
   }
}