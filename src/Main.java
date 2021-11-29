public class Main {

    public static void main(String[] args) {

        CardGame game = new CardGame();

        game.addPlayers(new Citizen("Roman", 60, Layer.NOBLEMAN, 0.7),
                new Citizen("Ivan", 20, Layer.JESTER, 0.2),
                new Citizen("Bob", 40, Layer.MERCHANT, 0.35),
                new Queen("Red Queen", 35));

        game.addSoldiers(new Soldier("Peter", 30), new Soldier("Sam", 25));
        game.startGame();
    }
}
