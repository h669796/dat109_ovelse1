import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Legg inn 2-4 spillere: ");
        int antallSpillere = scanner.nextInt();
        Stigespill spill1 = new Stigespill(antallSpillere);

        spill1.spill();
    }
}