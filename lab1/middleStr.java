public class middleStr {
  public static void main(String[] args) {
    String s1 = "Ault";
    String s2 = "Kelly";
    int len1 = s1.length();
    int mid = len1 / 2;
    String s3 = s1.substring(0, mid) + s2 + s1.substring(mid);
    System.out.println(s3);
  }
}