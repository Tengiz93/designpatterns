package factory;

public class RussianTeacherFactory implements TeacherFactory{
    @Override
    public Teacher getTeacher() {
        return new RussianTeacher();
    }
}
