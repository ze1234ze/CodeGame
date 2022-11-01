package CodeGame.Model;

public class Player {
    private String playername;
    private int score;

    public Player(String playername, int score) {
        this.playername = playername;
        this.score = score;
    }

    public Player(String playername) {
        this.playername = playername;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void insertPlayer(Player newPlayer){}

}

