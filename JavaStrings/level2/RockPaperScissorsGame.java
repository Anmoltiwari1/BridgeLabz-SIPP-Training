import java.util.*;

public class RockPaperScissorsGame {

    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String user, String comp) {
        if (user.equalsIgnoreCase(comp)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && comp.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && comp.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && comp.equals("Paper")))
            return "User";
        return "Computer";
    }

    public static String[][] playGame(int rounds, Scanner sc) {
        String[][] results = new String[rounds][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }

        // Stats summary
        System.out.println("\nRound\tUser\tComputer\tWinner");
        for (int i = 0; i < rounds; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }

        double userPct = (userWins * 100.0) / rounds;
        double compPct = (compWins * 100.0) / rounds;
        System.out.println("\nUser Win %: " + userPct + "\nComputer Win %: " + compPct);

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        playGame(games, sc);
    }
}
