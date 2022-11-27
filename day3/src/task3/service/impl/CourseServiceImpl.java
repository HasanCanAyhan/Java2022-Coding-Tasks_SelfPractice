package task3.service.impl;

import task3.entity.Category;
import task3.entity.Course;
import task3.logger.Logger;
import task3.repository.CourseRepository;
import task3.service.CourseService;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl  implements CourseService {

    private final CourseRepository courseRepository;
    private final Logger logger;

    private final List<Course> courses;

    public CourseServiceImpl(CourseRepository courseRepository, Logger logger, List<Course> courses) {
        this.courseRepository = courseRepository;
        this.logger = logger;
        this.courses = courses;
    }

    @Override
    public Course save(Course course) throws Exception {

        for (Course eachCourse : courses) {

            if (eachCourse.getCourseName().equals(course.getCourseName())){
                throw new Exception("Course's name can not be repeated! " + course.getCourseName());
            }

            if (eachCourse.getPrice() == course.getPrice() && course.getPrice() <= 0){
                throw new Exception("Course's price can not be same! " + course.getPrice());
            }


        }

       courseRepository.save(course);
       logger.log(course.getCourseName());
       return course;
    }

    @Override
    public Course findById(Long id) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
