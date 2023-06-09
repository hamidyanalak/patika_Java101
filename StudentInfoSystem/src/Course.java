public class Course {
    //Nitelikler
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note = 0;
    int verbal = 0;
    double percentEffect;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    void addTeacher(Teacher teacher) {
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else {
            System.out.println("Öğretmen ve ders branşları uyuşmuyor.");
        }
    }
    void printTeacher() {
        this.teacher.print();
    }
}
