public class rectangle {
  private double width;
  private double height;

  public rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return width * height;
  }

  public static void main(String[] args) {
    rectangle rectangle1 = new rectangle(5, 10);
    rectangle rectangle2 = new rectangle(3, 7);

    System.out.println("Area of rectangle1: " + rectangle1.area());
    System.out.println("Area of rectangle2: " + rectangle2.area());
  }
}
