package Mili;

public enum GameOption {
    ROCK(1,2), PAPER(2,3), SCISSORS(3,1), EMPTY(-1,-1);

    public int id;
    public int winBy;

    GameOption(int id,int winBy){
        this.id = id;
        this.winBy = winBy;
    }

    public static GameOption valueOf(int userEnteredOption){
        for(GameOption option: GameOption.values()){
            if(userEnteredOption == option.id){
                return option;
            }
        }
        return EMPTY;
    }

}
