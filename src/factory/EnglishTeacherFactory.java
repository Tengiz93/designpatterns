package factory;

public class EnglishTeacherFactory implements  TeacherFactory{
    @Override
    public Teacher getTeacher() {
        return new EnglishTeacher();
    }
}
