
public class Main {

  public static void main(String[] args) {
      String str = args[0];
      String number = args[1];
      String reverse = "";
      
      int x = Integer.parseInt(number);
      System.out.println(str);
      
      for(int i = str.length() - 1; i >= 0; i--) {
          reverse += str.charAt(i);
      }
      System.out.println(reverse);
      
      System.out.println(str.length());
      System.out.println(x % 10);
  }

}
