package task3;

import task3.entity.Category;
import task3.entity.Course;
import task3.entity.Teacher;
import task3.logger.DatabaseLogger;
import task3.logger.FileLogger;
import task3.logger.MailLogger;
import task3.repository.impl.CategoryRepositoryImpl;
import task3.repository.impl.CourseRepositoryImpl;
import task3.repository.impl.TeacherRepositoryImpl;
import task3.service.CategoryService;
import task3.service.CourseService;
import task3.service.TeacherService;
import task3.service.impl.CategoryServiceImpl;
import task3.service.impl.CourseServiceImpl;
import task3.service.impl.TeacherServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {

        List<Category> categories = new ArrayList<>();
        Category categories1 = new Category(1L, "Programlama");
        Category categories2 = new Category(2L, "Software Developer Bootcamp");

        categories.addAll(Arrays.asList(categories1,categories2));

        Category category3 = new Category(3l,"Java Entwickler");// new data to save in to db

        CategoryService categoryService = new CategoryServiceImpl(new CategoryRepositoryImpl(),new FileLogger(), categories);
        categoryService.save(category3);
        categoryService.save(categories1);// It will give error, bcs you try to save same object in to db!

        //----------------------------------------------------------------

        List<Course> courses = new ArrayList<>();
        Course course1 = new Course(1L, "Java Yazılım Kursu",12.99);
        Course course2 = new Course(2L, "C# Yazılım Kursu",13.99);
        Course course3 = new Course(3L, "JavaScript Yazılım Kursu",14.99);

        courses.addAll(Arrays.asList(course1,course2,course3));

        CourseService courseService = new CourseServiceImpl(new CourseRepositoryImpl(),new DatabaseLogger(), courses);

        //----------------------------------------------------------------

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher(1L,"Engin","Demirog");

        teachers.add(teacher1);

        TeacherService teacherService = new TeacherServiceImpl(new TeacherRepositoryImpl(), new MailLogger(), teachers);




    }















}
