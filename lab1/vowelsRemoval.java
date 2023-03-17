public class vowelsRemoval {
  public static void main(String[] args) {
    String str = "mobile";
    str = str.replaceAll("[AEIOUaeiou]", "");
    System.out.println(str);
  }
}
