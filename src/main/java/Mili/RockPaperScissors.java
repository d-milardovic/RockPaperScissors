package Mili;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        GameController gameController = new GameController();

        Scanner scanner = new Scanner(System.in);

        String userWantToExit;

        System.out.println(gameController.welcomeMessage());

        do {
            System.out.println(gameController.pleaseEnterOptionMessage());

            var userOptionRaw = scanner.next();

            if(!userOptionRaw.equalsIgnoreCase("1") && !userOptionRaw.equalsIgnoreCase("2")
                    && !userOptionRaw.equalsIgnoreCase("3")) {
                do {
                    System.out.println(" Wrong input you need to answer 1, 2 or 3!");
                    userOptionRaw = scanner.next();
                }
                while (!userOptionRaw.equals("1") && !userOptionRaw.equals("2")
                        && !userOptionRaw.equals("3"));
            }

            var userOptionRaw1 = Integer.parseInt(userOptionRaw);

            GameOption userOption = GameOption.valueOf(userOptionRaw1);

            gameController.selectUserChoice(userOption);

            GameOption machineOption = gameController.pickRandomlyMachineChoice();

            Player winner = gameController.calculateResults();

            Score score = gameController.getResults();

            System.out.printf("You played %s and machine played %s \n", userOption.name(), machineOption.name());

            if(Player.USER == winner){System.out.println("You won!");}
            if(Player.TIE == winner){System.out.println("It's tie!");}


            System.out.printf("You won %d game out of %d games! \n", score.getGamesWonByUser(), score.getTotalNumberGames());

            System.out.println("Continue playing (Y = YES, N = NO)?");
            userWantToExit = scanner.next();
            if(!userWantToExit.equalsIgnoreCase("Y") && !userWantToExit.equalsIgnoreCase("N")) {
                do {
                    System.out.println(" Wrong input you need to answer Yes or No (Y/N)!");
                    userWantToExit = scanner.next();
                }
                while (!userWantToExit.equalsIgnoreCase("Y") && !userWantToExit.equalsIgnoreCase("N"));
            }

            }while (userWantToExit.toUpperCase().equals("Y"));
    }
}
