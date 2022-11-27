package task3.entity;

public class Course {

    private Long id;
    private String courseName;

    private double price;

    public Course(Long id, String courseName, double price) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
