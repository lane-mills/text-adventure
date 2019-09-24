import java.util.Scanner;

public class ConsoleAdventure {
    public static void main(String[] args) {

        welcomePlayer();
        playTheGame();


    }


    private static String playerName = "";
    private static String playerUpperCase = "";
    private static String yesNo = "y";
    private static String userChoice = " ";
    private static Scanner input = new Scanner(System.in);
    private static int userHealth = 100;
    private static int looperHealth = 100;
    private static int attacks = 5;
    private static int attacksCounter;
    private static int potion = 5;
    private static int postionCounter;
    private static int damage = (int) (Math.random() * ((50 - 1) + 1)) + 1;


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
            System.out.println(
                    "\n" +
                    "Then you must defeat...\n" +
                    ConsoleColors.RED +
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
                    "                                                                                   \n" +
                    ConsoleColors.RESET);
            System.out.println("MuhahaaHaaa! He's here to throw infinite loops at your code that you've worked so hard on! Get Ready...");
            System.out.println("===================================================================================================================================================================");
//
            try {

                Thread.sleep(5000);
                getStats();
                userOptions();

            } catch (InterruptedException ex) {
                System.out.println("Error");
            }


//            userOptions();
        } else {
            System.out.println("okay...see you later");
            System.out.println("\n");
            restart();






        }
    }


    public static void userOptions() {
        while (userHealth > 0) {
            System.out.println("\n" +
                    "Please choose from the following options: \n" +
                    "1. Attack \n" +
                    "2. Drink Potion \n" +
                    "3. RUN! \n" +
                    "4. See Stats");
            userChoice = input.nextLine();
            if (userChoice.equals("1")) {

                looperHealth = looperHealth - damage ;
                System.out.println("========================================\n" +
                        "\n" +
                        "You hit The Looper with a break statement and \n" +
                        "broke out of an infinite loop he tried to \n" +
                        "throw at you! \n" +
                        "________________________________________\n" +
                        "\n" +
                        "The Looper's health is down to: " + looperHealth + "% \n" +
                        "========================================\n");
                looperAttack();
                looperDead();
                playerDead();
                attacks = attacks - 1;
                System.out.println("*** You have " + attacks + " attacks left! ***");
                if(attacks <= 0){
                    playerDead();
                 gameOver();
                }
                userOptions();
            } else if (userChoice.equals("2")) {
                drinkPotion();

            } else if (userChoice.equals("3")) {
                runAway();
            } else if (userChoice.equals("4")) {
                getStats();
                userOptions();
            } else {
                System.out.println("INVALID ENTRY \n");
                userOptions();
            }
        }
    }


    public static void getStats() {
        System.out.println("\n" +
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
            userHealth = userHealth - damage;
            System.out.println("=====================================\n");
            System.out.println("The Looper didn't like that he sneak attacked you \n" +
                    "with another infinite loop! \n" +
                    "\n" +
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
        if (potion <= 0){
            System.out.println("You don't have any more potion!");
        }
    }

    public static void looperDead() {
        if (looperHealth <= 0) {
            System.out.println("\n" +
                    "Congratulations, " + playerUpperCase + "! You did it! You've successfully defeated The Infinite Looper! \n" +
                    ConsoleColors.GREEN +
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
                    "********************************************************************************** "+
                    ConsoleColors.RESET);

            restart();

        }
    }

    public static void playerDead() {
        if (userHealth <= 0 || attacks <= 0) {
            for (int i = 0; i < 200; i++)
                try {

                    Thread.sleep(20);
                    System.out.print("*******************Trapped in the INFINTE LOOP!**************************\n");

                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }
            gameOver();
        }
    }

    public static void gameOver() {
        System.out.println("\n" +
                ConsoleColors.RED +
                " _______  _______  _______  _______    _______           _______  _______  _ \n" +
                "(  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )( )\n" +
                "| (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|| |\n" +
                "| |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|| |\n" +
                "| | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)| |\n" +
                "| | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (   (_)\n" +
                "| (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__ _ \n" +
                "(_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/(_)\n" +
                "                                                                             \n" +
                ConsoleColors.RESET);

              restart();







    }

    public static void runAway() {
        if (userHealth <= 20) {
            System.out.println("sorry you cant run away..You must defeat the Infinite Looper!");
            userOptions();
        } else {
            System.out.println("How disappointing...");
            gameOver();

        }
    }

    public static void restart(){
        System.out.println("\n" +
                "Restart?");
        String replay = input.nextLine();
        if(replay.equalsIgnoreCase("y")){
            userHealth = 100;
            looperHealth = 100;
            attacks = 5;
        welcomePlayer();
        playTheGame();
        userOptions();
        getStats();
        drinkPotion();
        looperDead();
        playerDead();
        gameOver();
        }else {
            System.out.println("\n' +" +
                    "Maybe another time!");
        }
        }

}
