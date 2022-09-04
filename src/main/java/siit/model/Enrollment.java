package siit.model;

import java.util.Date;

public class Enrollment {
    private int batchid;
    private int id;
    Date edate;

    public Enrollment(int batchid, int id, Date edate) {
        this.batchid = batchid;
        this.id = id;
        this.edate = edate;
    }

    public int getBatchid() {
        return batchid;
    }

    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "batchid=" + batchid +
                ", id=" + id +
                ", edate=" + edate +
                '}';
    }
}
