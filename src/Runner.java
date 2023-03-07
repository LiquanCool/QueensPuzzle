import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How big is the board?");
        int n = s.nextInt();
        QueensPuzzle yes = new QueensPuzzle(n);
        yes.findSolutions();
    }
}
