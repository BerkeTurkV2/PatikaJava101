package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("X", 10, 100, 100, 40, 50);
        Fighter f2 = new Fighter("Y", 13, 80, 90, 45, 50);

        Match match = new Match(f1, f2, 80, 100);
        match.run();
    }
}
