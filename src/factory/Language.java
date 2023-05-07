package factory;

import java.util.List;

import static factory.TeachingLanguage.RUSSIAN;

public class Language {

    public static void main(String[] args) {

        List <Teacher> teacherList= List.of(new RussianTeacher(),new EnglishTeacher(),new GermanTeacher());
        teacherList.forEach(Teacher::teachLanguage);

//        var teacherFactory = getTeacherFactoryByLanguage(RUSSIAN);
//        var teacher = teacherFactory.getTeacher();
//        teacher.teachLanguage();

    }

    private static TeacherFactory getTeacherFactoryByLanguage(TeachingLanguage teachingLanguage) {

        return switch (teachingLanguage) {
            case ENGLISH -> new EnglishTeacherFactory();
            case GERMAN -> new GermanTeacherFactory();
            case RUSSIAN -> new RussianTeacherFactory();

        };

    }

}
