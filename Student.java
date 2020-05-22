import java.util.Scanner;

public class Student {

  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentId;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int courseCost = 600;
  private static int id = 1000;

  // constructor: prompt user to enter name and year
  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();
    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();
    System.out.println("Enter student grade level:\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n");
    this.gradeYear = in.nextInt();
    setStudentId();
  }

  // generate id
  private void setStudentId() {
    id++;
    this.studentId = gradeYear + "" + id;
  }

  // enroll in courses
  public void enroll() {
    do {
      System.out.println("Enter course to enroll (Q to quit)");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();
      if (!course.toLowerCase().equals("q")) {
        courses = courses + "\n" + course;
        tuitionBalance = tuitionBalance + courseCost;
      } else {
        break;
      }
    } while (1 != 0);
  }

  // view balance
  public void viewBalance() {
    System.out.println("Your balance is: $" + tuitionBalance);
  }

  // pay tuition
  public void payTuition() {
    viewBalance();
    System.out.println("Enter your payment amount: ");
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();
    tuitionBalance = tuitionBalance - amount;
    System.out.println("Thankyou for your payment of $" + amount);
    viewBalance();
  }

  // show status
  public void showInfo() {
    System.out.println("Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent Id: "
        + studentId + "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance);
  }

}