package CodeGame.Model;

public class Jobs {

    private String jobTitel;
    private String jobText;

    public Jobs(){

    }

    public Jobs(String jobTitel, String jobText) {
        this.jobTitel = jobTitel;
        this.jobText = jobText;
    }

    public String getJobTitel() {
        return jobTitel;
    }

    public void setJobTitel(String jobTitel) {
        this.jobTitel = jobTitel;
    }

    public String getJobText() {
        return jobText;
    }

    public void setJobText(String jobText) {
        this.jobText = jobText;
    }

}
