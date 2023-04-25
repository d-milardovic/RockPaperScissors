package Mili;

public class Score {
    private int totalNumberGames;
    private int gamesWonByUser;

    public void incrementTotal(){
        totalNumberGames++;
    }

    public void incrementGameWonByUser(){
        gamesWonByUser++;
    }

    public int getTotalNumberGames() {
        return totalNumberGames;
    }

    public int getGamesWonByUser() {
        return gamesWonByUser;
    }
}
