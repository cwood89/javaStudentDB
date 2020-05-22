import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // ask how many students
    System.out.println("Enter number of new students to enroll: ");
    Scanner in = new Scanner(System.in);
    int numOfStudents = in.nextInt();
    Student[] students = new Student[numOfStudents];

    // create number of new students
    for (int i = 0; i < numOfStudents; i++) {
      students[i] = new Student();
      students[i].enroll();
      students[i].payTuition();
    }
    students[0].showInfo();
    students[1].showInfo();
    students[2].showInfo();

  }
}