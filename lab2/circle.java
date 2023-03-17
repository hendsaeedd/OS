public class circle {
    private double radius;
    private String color;

    public circle() {
        radius = 1.0;
        color = "red";
    }
    public circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        circle circle1 = new circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea()
                + " and color is " + circle1.color);
    }
}
