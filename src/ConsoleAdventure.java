import java.util.Scanner;

public class ConsoleAdventure {
    public static void main(String[] args) {

        welcomePlayer();
        playTheGame();


    }

    public static String playerName = "";
    public static String yesNo = "y";
    public static String userChoice = " ";
    public static String loserMsg = "You Lose!";
    public static Scanner input = new Scanner(System.in);
    public static int userHealth = 100;
    public static int looperHealth = 100;
    public static int attacks = 100;
    public static int potion = 5;


    public static String welcomePlayer() {

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

    public static void playTheGame() {
        System.out.println(" Welcome " + playerName + "!" + " Do you want to go on an adventure ?" + " Y/N");
        yesNo = input.nextLine();
        if (yesNo.equalsIgnoreCase("y")) {
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
            System.out.println("Here are your stats:\n" +
                    "Health: " + userHealth + "% \n" +
                    "The Looper's Health is: " + looperHealth + "\n" +
                    "You have " + attacks + " attacks \n" +
                    "You have " + potion + " potions \n");
            userOptions();
        } else {
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

    public static void userOptions() {
        System.out.println("Please choose from the following options: \n" +
                "1. Attack \n" +
                "2. Drink Potion \n" +
                "3. Retreat!");
        userChoice = input.nextLine();
        if (userChoice.equals("1")) {
            looperHealth = looperHealth - 20;
            System.out.println("You hit the looper head on! \n" +
                    "The Looper's health is down to: " + looperHealth + "% \n");
            looperAttack();
            userOptions();
        }else if(userChoice.equals("2")){
            if(userHealth != 95){
            userHealth = userHealth + potion;
            System.out.println("You drank the potion! \n" +
                    "Your health is now: " + userHealth +"%");
            }else{
                System.out.println("You can't drink potion, you're a maxed out");
                userOptions();
            }

        }
    }

    public static void looperAttack() {
        userHealth = userHealth - 10;
        System.out.println("Looper attacked you back! \n" +
                "Your health is now: " + userHealth + "% \n");
    }


}
