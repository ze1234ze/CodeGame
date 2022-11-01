package CodeGame.Model;

public class GameD {
    private int id;
    private String codelabel;
    private String codeimageD;
    private String codequestion;
    private String codekey;

    public GameD(String codelabel, String codeimageD, String codequestion, String codekey) {
        this.codelabel = codelabel;
        this.codeimageD = codeimageD;
        this.codequestion = codequestion;
        this.codekey = codekey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodelabel() {
        return codelabel;
    }

    public void setCodelabel(String codelabel) {
        this.codelabel = codelabel;
    }

    public String getCodeimageD() {
        return codeimageD;
    }

    public void setCodeimageD(String codeimageD) {
        this.codeimageD = codeimageD;
    }

    public String getCodequestion() {
        return codequestion;
    }

    public void setCodequestion(String codequestion) {
        this.codequestion = codequestion;
    }

    public String getCodekey() {
        return codekey;
    }

    public void setCodekey(String codekey) {
        this.codekey = codekey;
    }
}
