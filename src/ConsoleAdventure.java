import java.util.Scanner;

public class ConsoleAdventure {
    public static void main(String[] args) {

       welcomePlayer();
       playTheGame();


    }

    public static String playerName = "";
    public static String yesNo = "y";
    public static Scanner input = new Scanner(System.in);



    public static String welcomePlayer () {

        String welcome = "\n" +
                "                                                     \n" +
                "                  ,--.                               \n" +
                ",--.   ,--. ,---. |  | ,---. ,---. ,--,--,--. ,---.  \n" +
                "|  |.'.|  || .-. :|  || .--'| .-. ||        || .-. : \n" +
                "|   .'.   |\\   --.|  |\\ `--.' '-' '|  |  |  |\\   --. \n" +
                "'--'   '--' `----'`--' `---' `---' `--`--`--' `----' \n";


        System.out.println(welcome);
        System.out.println("Please enter your name adventurer");
        // checks if user name is valid and not empty
        playerName = input.nextLine();
        while (playerName.isEmpty()) {
            System.out.println("Are you saying you dont have a name? Please enter it!");
            playerName = input.nextLine();
        }
        return playerName;
    }

    public static void playTheGame () {
        System.out.println(" Welcome " + playerName + "!" + " Do you want to go on an adventure ?" + " Y/N");
        yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase("y")){
            System.out.println("Then you must defeat");
            System.out.println("\n" +
                    "_________          _______   _________ _        _______ _________ _       __________________ _______    _        _______  _______  _______  _______  _______ \n" +
                    "\\__   __/|\\     /|(  ____ \\  \\__   __/( (    /|(  ____ \\\\__   __/( (    /|\\__   __/\\__   __/(  ____ \\  ( \\      (  ___  )(  ___  )(  ____ )(  ____ \\(  ____ )\n" +
                    "   ) (   | )   ( || (    \\/     ) (   |  \\  ( || (    \\/   ) (   |  \\  ( |   ) (      ) (   | (    \\/  | (      | (   ) || (   ) || (    )|| (    \\/| (    )|\n" +
                    "   | |   | (___) || (__         | |   |   \\ | || (__       | |   |   \\ | |   | |      | |   | (__      | |      | |   | || |   | || (____)|| (__    | (____)|\n" +
                    "   | |   |  ___  ||  __)        | |   | (\\ \\) ||  __)      | |   | (\\ \\) |   | |      | |   |  __)     | |      | |   | || |   | ||  _____)|  __)   |     __)\n" +
                    "   | |   | (   ) || (           | |   | | \\   || (         | |   | | \\   |   | |      | |   | (        | |      | |   | || |   | || (      | (      | (\\ (   \n" +
                    "   | |   | )   ( || (____/\\  ___) (___| )  \\  || )      ___) (___| )  \\  |___) (___   | |   | (____/\\  | (____/\\| (___) || (___) || )      | (____/\\| ) \\ \\__\n" +
                    "   )_(   |/     \\|(_______/  \\_______/|/    )_)|/       \\_______/|/    )_)\\_______/   )_(   (_______/  (_______/(_______)(_______)|/       (_______/|/   \\__/\n" +
                    "                                                                                                                                                             \n");
            System.out.println("muhahaha! He is here to throw infinite loops at your code you have worked so hard on!");
        }else {
            System.out.println("okay...see you later");
            System.out.println("\n" +
                    "      _ \n" +
                    "     / )\n" +
                    " _  / / \n" +
                    "(_)( (  \n" +
                    "   | |  \n" +
                    " _ ( (  \n" +
                    "(_) \\ \\ \n" +
                    "     \\_)\n" +
                    "        \n");
        }



    }


}
