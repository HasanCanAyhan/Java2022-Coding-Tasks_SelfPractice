package task3.repository.impl;

import task3.entity.Teacher;
import task3.repository.TeacherRepository;

public class TeacherRepositoryImpl implements TeacherRepository {
    @Override
    public void save(Teacher teacher) {
        System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " is added to DataBase");
    }
}
