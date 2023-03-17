public class Teacher extends Person {
  private static final int MAX_COURSES = 5;
  private String[] courses;
  private int numCourses;

  public Teacher(String name, String address) {
    super(name, address);
    courses = new String[MAX_COURSES];
    numCourses = 0;
  }

  public boolean addCourse(String course) {
    if (numCourses >= MAX_COURSES) {
      return false;
    }
    courses[numCourses] = course;
    numCourses++;
    return true;
  }

  public boolean removeCourse(String course) {
    for (int i = 0; i < numCourses; i++) {
      if (courses[i].equals(course)) {
        for (int j = i; j < numCourses - 1; j++) {
          courses[j] = courses[j + 1];
        }
        courses[numCourses - 1] = null;
        numCourses--;
        return true;
      }
    }
    return false;
  }

  public void printCourses() {
    System.out.print(getName() + "'s courses: ");
    for (int i = 0; i < numCourses; i++) {
      System.out.print(courses[i] + " ");
    }
    System.out.println();
  }
}