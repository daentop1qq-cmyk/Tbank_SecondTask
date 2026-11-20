public class Student {
    String name;
    int grade;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String toString(){
        return this.name + ":" + this.grade;
    }

    public boolean isExcellent(){
        return this.grade == 5;
    }
}
