package homework_Oct31;

public class C13T13Test {
    public static void main(String[] args) {
        Course course = new Course("java");
        course.addStudents("小红");
        course.addStudents("小明");
        course.getNumberOfStudent();
        Course course1 = (Course) course.clone();
        System.out.println("course==course1:" + (course1 == course1));


    }
}

