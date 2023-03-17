public class Student extends Person {
  private int numCourses;
  private String[] courses;
  private int[] grades;

  public Student(String name, String address) {
    super(name, address);
    numCourses = 0;
    courses = new String[30];
    grades = new int[30];
  }

  public void addCourseGrade(String course, int grade) {
    courses[numCourses] = course;
    grades[numCourses] = grade;
    numCourses++;
  }

  public void printGrades() {
    System.out.print(getName() + "'s grades: ");
    for (int i = 0; i < numCourses; i++) {
      System.out.print(courses[i] + ":" + grades[i] + " ");
    }
    System.out.println();
  }

  public double getAverageGrade() {
    int sum = 0;
    for (int i = 0; i < numCourses; i++) {
      sum += grades[i];
    }
    return (double) sum / numCourses;
  }
}