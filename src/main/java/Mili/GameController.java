package Mili;

import java.util.Random;
import java.util.Scanner;

public class GameController {

    private GameOption userChoice = GameOption.EMPTY;
    private GameOption machineChoice = GameOption.EMPTY;
    private Score totalScore = new Score();

    String welcomeMessage(){
        return """
                      Welcome to        \s
                Rock Paper Scissors Game\s
                                          \s""".indent(1);}

    String pleaseEnterOptionMessage(){
        return """
                 Please enter:            \s
                 1. ROCK                  \s
                 2. PAPER                 \s
                 3. SCISSORS              \s
                                          \s
                """;}

    void selectUserChoice(GameOption option){
        this.userChoice = option;
    }

    GameOption pickRandomlyMachineChoice(){
        int randomNumberBetween1and3 = new Random().nextInt(3)+1;
        GameOption machineOption = GameOption.valueOf(randomNumberBetween1and3);
        this.machineChoice = machineOption;
        return machineOption;}

    Player calculateResults(){
        totalScore.incrementTotal();

        if (machineChoice == userChoice){
            return Player.TIE;
        }

        if(userChoice.id == machineChoice.winBy){
            totalScore.incrementGameWonByUser();
            return Player.USER;
        }
        return Player.MACHINE;}

    Score getResults(){
        return totalScore;}


}
