package task3.repository.impl;

import task3.entity.Course;
import task3.repository.CourseRepository;
import task3.service.CourseService;

public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public void save(Course course) {
        System.out.println(course.getCourseName() + " is added to DataBase");
    }
}
