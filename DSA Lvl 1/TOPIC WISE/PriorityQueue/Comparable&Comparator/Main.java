import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

  static class student implements Comparable<student> {

    String name;
    int ht;
    int wt;
    int marks;

    student(String name, int ht, int wt, int marks) {
      this.name = name;
      this.ht = ht;
      this.wt = wt;
      this.marks = marks;
    }

    public String toString() {
      return this.name + "->" + this.ht + "," + this.wt + "," + this.marks;
    }

    public int compareTo(student other) {
      return this.ht - other.ht;
    }
  }

  static class StudentWeightComparator implements Comparator<student> {

    public int compare(student s1, student s2) {
      return s1.wt - s2.wt;
    }
  }

  static class StudentMarksComparator implements Comparator<student> {

    public int compare(student s1, student s2) {
      return s1.marks - s2.marks;
    }
  }

  public static void main(String[] args) {
    student s[] = new student[3];
    s[0] = new student("A", 180, 75, 97);
    s[1] = new student("B", 150, 85, 76);
    s[2] = new student("C", 156, 95, 99);

    PriorityQueue<student> pqht = new PriorityQueue<>();
    PriorityQueue<student> pqwt = new PriorityQueue<>(
      new StudentWeightComparator()
    );
    PriorityQueue<student> pqmarks = new PriorityQueue<>(
      new StudentMarksComparator()
    );

    for (student stud : s) {
      pqht.add(stud);
      pqwt.add(stud);
      pqmarks.add(stud);
    }

    System.out.println("On the basis of Height");
    while (pqht.size() > 0) {
      student std = pqht.peek();
      System.out.println(std);
      pqht.remove();
    }

    System.out.println("On the basis of Weight");
    while (pqwt.size() > 0) {
      student std = pqwt.peek();
      System.out.println(std);
      pqwt.remove();
    }

    System.out.println("On the basis of Marks");
    while (pqmarks.size() > 0) {
      student std = pqmarks.peek();
      System.out.println(std);
      pqmarks.remove();
    }
  }
}
