package factory;

public class GermanTeacherFactory implements TeacherFactory{
    @Override
    public Teacher getTeacher() {
        return new GermanTeacher();
    }
}
