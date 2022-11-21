import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Student student = new Student(1L,"Adil Aitbaev", 12,'M',12000);
       Student student1 = new Student(2L,"Kanykei Akjoltoi kyzy", 13,'F',12000);
       Student student2 = new Student(3L,"balamcha tuktncho", 14,'M',12000);
       Student[] students = {student,student1,student2};

       Instructor instructor = new Instructor(4L,"Adil Aitbaev", 13, 'M',10000);
       Instructor instructor1 = new Instructor(5L,"Adil Aitbaev", 13, 'M',10000);
       Instructor instructor2 = new Instructor(6L,"Adil Aitbaev", 13, 'M',10000);
       Instructor[] instructors = {instructor, instructor1, instructor2};

       Mentor mentor = new Mentor(7L,"Adil Aitbaev", 14,'M', 10000);
       Mentor mentor1 = new Mentor(8L,"Adil Aitbaev", 14,'M', 10000);
       Mentor mentor2 = new Mentor(9L,"Adil Aitbaev", 14,'M', 10000);
       Mentor[] mentors = {mentor, mentor1, mentor2};

       Group group = new Group("java", students, 1,10);
       Group group1 = new Group("java", students, 1,10);
       Group group2 = new Group("java", students, 1,10);
       Group[] groups = {group, group1, group2};

       Course course = new Course("java", groups, instructor1, mentors);
       Course course1 = new Course("java", groups, instructor1, mentors);
       Course course2 = new Course("java", groups, instructor1, mentors);
       Course[] courses = {course2, course1, course};

       Peaksoft peaksoft = new Peaksoft("taigan", "talas",courses , "java");
       for (Student studen:students) {
           System.out.println(studen.getContract());
       }
       for (Instructor instructo:instructors) {
          System.out.println(instructo.getSalary());
       }
       for (Mentor ment:mentors) {
          System.out.println(ment.getSalary());
       }
       for (Student studen:students) {
          System.out.println(studen.period(group));
       }
       for (Instructor instructor3:instructors) {
          System.out.println(instructor3.period(group));
       }
       for (Mentor mentor3:mentors){
          System.out.println(mentor3.period(group));
       }
       Person[] people = {student,student1,student2, mentor, mentor1, mentor2, instructor, instructor1, instructor2};
       sortAge(people);


    }
   public static void sortAge(Person[] person){
      int[] a = new int[person.length];
      int index = 0;
      for (Person persons:person) {
         a[index] = persons.getAge();
         index++;
      }
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
}}