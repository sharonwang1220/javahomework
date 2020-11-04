package homework_Oct31;

public class Course {
    public String coursename;
    public String[] students = new String[100];
    public int numberOfStudent;


    public Course(String coursename) {
        this.coursename = coursename;
    }

    //添加学生
    public int addStudents(String s) {

        for (int i = 0; i < students.length; i++) {
            if (numberOfStudent < students.length) {
                students[i] = s;
            }
        }
        numberOfStudent++;
        System.out.println("添加学生：" + s);
        return numberOfStudent;
    }

    //get学生
    public String[] getStudents() {
        return students;
    }

    //get学生数
    public void getNumberOfStudent() {
        System.out.println("学生数量为：" + numberOfStudent);
    }

    //深度克隆学生
    @Override
    public Object clone() {
        try {
            //shadow clone
            Course coursecopy = (Course) super.clone();
            //deep copy on students
            coursecopy.students = (String[]) students.clone();
            return coursename;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

}
