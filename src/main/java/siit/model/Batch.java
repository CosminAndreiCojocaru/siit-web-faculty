package siit.model;

public class Batch {
   private int batchid;
   private int bstrength;


    public Batch(int batchid, int bstrength) {
        this.batchid = batchid;
        this.bstrength = bstrength;
    }

    public Integer getBatchid() {
        return batchid;
    }

    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    public int getBstrength() {
        return bstrength;
    }

    public void setBstrength(int bstrength) {
        this.bstrength = bstrength;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchid='" + batchid + '\'' +
                ", bstrength=" + bstrength +
                '}';
    }
}
