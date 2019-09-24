import java.util.Scanner;

public class ConsoleAdventure {
    public static void main(String[] args) {

        welcomePlayer();
        playTheGame();


    }


    public static String playerName = "";
    public static String playerUpperCase = "";
    public static String yesNo = "y";
    public static String userChoice = " ";
    public static Scanner input = new Scanner(System.in);
    public static int userHealth = 100;
    public static int looperHealth = 100;
    public static int attacks = 5;
    public static int attacksCounter;
    public static int potion = 5;
    public static int postionCounter;


    public static String welcomePlayer() {

        String welcome = "\n" +
                "                                                     \n" +
                "                  ,--.                               \n" +
                ",--.   ,--. ,---. |  | ,---. ,---. ,--,--,--. ,---.  \n" +
                "|  |.'.|  || .-. :|  || .--'| .-. ||        || .-. : \n" +
                "|   .'.   |\\   --.|  |\\ `--.' '-' '|  |  |  |\\   --. \n" +
                "'--'   '--' `----'`--' `---' `---' `--`--`--' `----' \n";


        System.out.println(welcome);
        System.out.println("Please enter your name adventurer:");
        // checks if user name is valid and not empty
        playerName = input.nextLine();
        playerUpperCase = Character.toUpperCase(playerName.charAt(0)) + playerName.substring(1);
        while (playerUpperCase.isEmpty()) {
            System.out.println("Are you saying you dont have a name? Please enter it!");
            playerName = input.nextLine();
            playerUpperCase = Character.toUpperCase(playerName.charAt(0)) + playerName.substring(1);
        }
        return playerUpperCase;
    }

    public static void playTheGame() {
        System.out.println(" Welcome " + playerUpperCase + "!" + " Do you want to go on an adventure ?" + " Y/N");
        yesNo = input.nextLine();
        if (yesNo.equalsIgnoreCase("y")) {
            System.out.println("\n"+
                    "Then you must defeat\n" +
                    "_________          _______ \n" +
                    "\\__   __/|\\     /|(  ____ \\\n" +
                    "   ) (   | )   ( || (    \\/\n" +
                    "   | |   | (___) || (__    \n" +
                    "   | |   |  ___  ||  __)   \n" +
                    "   | |   | (   ) || (      \n" +
                    "   | |   | )   ( || (____/\\\n" +
                    "   )_(   |/     \\|(_______/\n" +
                    "                           \n" +
                    "\n" +
                    "_________ _        _______ _________ _       __________________ _______   \n" +
                    "\\__   __/( (    /|(  ____ \\\\__   __/( (    /|\\__   __/\\__   __/(  ____ \\  \n" +
                    "   ) (   |  \\  ( || (    \\/   ) (   |  \\  ( |   ) (      ) (   | (    \\/  \n" +
                    "   | |   |   \\ | || (__       | |   |   \\ | |   | |      | |   | (__      \n" +
                    "   | |   | (\\ \\) ||  __)      | |   | (\\ \\) |   | |      | |   |  __)     \n" +
                    "   | |   | | \\   || (         | |   | | \\   |   | |      | |   | (        \n" +
                    "___) (___| )  \\  || )      ___) (___| )  \\  |___) (___   | |   | (____/\\  \n" +
                    "\\_______/|/    )_)|/       \\_______/|/    )_)\\_______/   )_(   (_______/  \n" +
                    "                                                                          \n" +
                    "\n" +
                    "                           _        _______  _______  _______  _______  _______  _ \n" +
                    "                          ( \\      (  ___  )(  ___  )(  ____ )(  ____ \\(  ____ )( )\n" +
                    "                          | (      | (   ) || (   ) || (    )|| (    \\/| (    )|| |\n" +
                    "                          | |      | |   | || |   | || (____)|| (__    | (____)|| |\n" +
                    "                          | |      | |   | || |   | ||  _____)|  __)   |     __)| |\n" +
                    "                          | |      | |   | || |   | || (      | (      | (\\ (   (_)\n" +
                    "                          | (____/\\| (___) || (___) || )      | (____/\\| ) \\ \\__ _ \n" +
                    "                          (_______/(_______)(_______)|/       (_______/|/   \\__/(_)\n" +
                    "                                                                                   \n");
            System.out.println("muhahaha! He is here to throw infinite loops at your code you have worked so hard on!");
            System.out.println("===================================================================================================================================================================");
//


            getStats();
            userOptions();



//            userOptions();
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
        System.out.println("\n"+
                "Please choose from the following options: \n" +
                "1. Attack \n" +
                "2. Drink Potion \n" +
                "3. RUN! \n" +
                "4. See Stats");
        userChoice = input.nextLine();
        if (userChoice.equals("1")) {
            looperHealth = looperHealth - 20;
            System.out.println("========================================\n"+
                    "\n" +
                    "You hit the with a break statement and \n" +
                    "broke out of an infinite loop he tried to \n" +
                    "throw at you! \n" +
                    "________________________________________\n" +
                    "\n" +
                    "The Looper's health is down to: " + looperHealth + "% \n" +
                    "========================================\n");
            looperAttack();
            looperDead();
            attacks = attacks - 1;
            System.out.println("*** You have " + attacks + " attacks left! ***");
            userOptions();
        } else if (userChoice.equals("2")) {
            drinkPotion();

        } else if (userChoice.equals("3")) {
            runAway();
        } else if (userChoice.equals("4")) {
            getStats();
            userOptions();
        }
    }


    public static void getStats() {
        System.out.println("\n"+
                "Here are your stats:\n" +
                "Health: " + userHealth + " % \n" +
                "You have " + attacks + " attacks \n" +
                "You have " + potion + " potions \n");
        System.out.println("=========================================");
        System.out.println("The Looper's Health is: " + looperHealth + " %");
        System.out.println("=========================================");
    }

    public static void looperAttack() {
        int sneakAttack = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        int userPick = Integer.parseInt(userChoice);
        if (userPick == sneakAttack) {
            userHealth = userHealth - 10;
            System.out.println("=====================================\n");
            System.out.println("The Looper didn't like that he sneak attacked you \n" +
                    "with another infinite loop! \n" +
                    "Your health is now: " + userHealth + "% \n");
            System.out.println("=====================================");
        }
    }

    public static void drinkPotion() {
        if (userHealth <= 95) {
            userHealth = userHealth + potion;
            System.out.println("You drank the potion! \n" +
                    "Your health is now: " + userHealth + "%");
            potion = potion - 1;
            System.out.println("* You now have " + potion + " potions left *");
            System.out.println("________________________________________");

            userOptions();
        } else {
            System.out.println("You can't drink potion, you're health is to high");
            userOptions();
        }
    }

    public static void looperDead() {
        if (looperHealth <= 0) {
            System.out.println("Congratulations, " +playerUpperCase+ "! You did it! You've successfully defeated The Infinite Looper! \n" +
                    " ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄ \n" +
                    "▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌\n" +
                    "▐░▌       ▐░▌ ▀▀▀▀█░█▀▀▀▀ ▐░▌░▌     ▐░▌▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌\n" +
                    "▐░▌       ▐░▌     ▐░▌     ▐░▌▐░▌    ▐░▌▐░▌▐░▌    ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌\n" +
                    "▐░▌   ▄   ▐░▌     ▐░▌     ▐░▌ ▐░▌   ▐░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌\n" +
                    "▐░▌  ▐░▌  ▐░▌     ▐░▌     ▐░▌  ▐░▌  ▐░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌\n" +
                    "▐░▌ ▐░▌░▌ ▐░▌     ▐░▌     ▐░▌   ▐░▌ ▐░▌▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀ ▐░▌\n" +
                    "▐░▌▐░▌ ▐░▌▐░▌     ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌    ▐░▌▐░▌▐░▌          ▐░▌     ▐░▌   ▀ \n" +
                    "▐░▌░▌   ▐░▐░▌ ▄▄▄▄█░█▄▄▄▄ ▐░▌     ▐░▐░▌▐░▌     ▐░▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌  ▄ \n" +
                    "▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░▌      ▐░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌\n" +
                    " ▀▀       ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀ \n" +
                    "                                                                                 \n" +
                    "Congratulations! You did it! You've successfully defeated The Infinite Looper! ");
        }
    }

    public static void runAway() {
        if (userHealth <= 20) {
            System.out.println("sorry you cant run away..You must defeat the Infinite Looper!");
            userOptions();
        } else {
            System.out.println("How disappointing...");
            System.out.println("\n" +
                    " _______  _______  _______  _______    _______           _______  _______  _ \n" +
                    "(  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )( )\n" +
                    "| (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|| |\n" +
                    "| |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|| |\n" +
                    "| | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)| |\n" +
                    "| | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (   (_)\n" +
                    "| (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__ _ \n" +
                    "(_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/(_)\n" +
                    "                                                                             \n");
        }
    }


}
