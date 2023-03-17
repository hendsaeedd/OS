public class charLocator {
  public static void main(String[] args) {
    String str = "This is javaScript";
    char ch = 'i';
    StringBuilder results = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) {
        results.append(i);
        results.append(",");
      }
    }
      System.out.println("[" + results.toString() +"]");
  }
}