import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();
        Stigespill spill1 = new Stigespill(numOfPlayers);

        spill1.spill();
    }
}