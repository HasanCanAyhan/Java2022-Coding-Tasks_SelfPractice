package task3.service.impl;

import task3.entity.Teacher;
import task3.logger.Logger;
import task3.repository.TeacherRepository;
import task3.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final Logger logger;

    private final List<Teacher> teachers;

    public TeacherServiceImpl(TeacherRepository teacherRepository, Logger logger, List<Teacher> teachers) {
        this.teacherRepository = teacherRepository;
        this.logger = logger;
        this.teachers = teachers;
    }

    @Override
    public Teacher save(Teacher teacher) {

        teacherRepository.save(teacher);
        logger.log(teacher.getFirstName() + " " + teacher.getLastName());
        return teacher;
    }

    @Override
    public Teacher findById(Long aLong) {
        return null; // gerek yoktu simdilik
    }

    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
