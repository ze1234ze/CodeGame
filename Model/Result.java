package CodeGame.Model;

public class Result {
    private int tempresult;
    private String resultFromSql;

    public Result() {
    }

    public Result(int tempresult) {
        this.tempresult = tempresult;
    }

    public String getResultFromSql() {
        return resultFromSql;
    }

    public void setResultFromSql(String resultFromSql) {
        this.resultFromSql = resultFromSql;
    }

    public int getTempresult() {
        return tempresult;
    }

    public void setTempresult(int tempresult) {
        this.tempresult = tempresult;
    }

}
