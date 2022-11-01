package CodeGame.Model;

public class Game {

    private int id;
    private String codelabel;
    private String codeimage;
    private String codequestion;
    private String codekey;

    private String codeimageD;

    public Game(int id, String codelabel, String codeimage, String codequestion, String codekey) {
        this.id = id;
        this.codelabel = codelabel;
        this.codeimage = codeimage;
        this.codequestion = codequestion;
        this.codekey = codekey;
    }

    public Game(String codelabel, String codeimage, String codequestion, String codekey) {
        this.codelabel = codelabel;
        this.codeimage = codeimage;
        this.codequestion = codequestion;
        this.codekey = codekey;
    }

    public Game() {

    }

    public int getId() {
        return id;
    }


    public String getCodelabel() {
        return codelabel;
    }

    public void setCodelabel(String codelabel) {
        this.codelabel = codelabel;
    }

    public String getCodeimage() {
        return codeimage;
    }

    public void setCodeimage(String codeimage) {
        this.codeimage = codeimage;
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
