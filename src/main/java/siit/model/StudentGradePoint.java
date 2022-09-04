package siit.model;

public class StudentGradePoint {
    private int gradpointaverage;
    private String subject;
    private int id;


    public StudentGradePoint(int gradpointaverage, String subject, int id) {
        this.gradpointaverage = gradpointaverage;
        this.subject = subject;
        this.id = id;
    }

    public int getGradpointaverage() {
        return gradpointaverage;
    }

    public void setGradpointaverage(int gradpointaverage) {
        this.gradpointaverage = gradpointaverage;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentGradePoint{" +
                "gradpointaverage=" + gradpointaverage +
                ", subject='" + subject + '\'' +
                ", id=" + id +
                '}';
    }
}
