package siit.model;


import java.util.Date;
import java.util.List;


public class Student {

    private int id;
    private String name;
    private String phone;
    private String email;
    Date date;
    private String city;
    private String qualification;
    List<Enrollment> enrollments;
    List<Batch> batches;
    List<StudentGradePoint> studentGradePoints;



    public Student() {
    }

    public Student(int id, String name, String phone, String email, Date date, String city, String qualification) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.city = city;
        this.qualification = qualification;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public void setBatches(List<Batch> batches) {
        this.batches = batches;
    }

    public List<StudentGradePoint> getStudentGradePoints() {
        return studentGradePoints;
    }

    public void setStudentGradePoints(List<StudentGradePoint> studentGradePoints) {
        this.studentGradePoints = studentGradePoints;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                '}';
    }
}
