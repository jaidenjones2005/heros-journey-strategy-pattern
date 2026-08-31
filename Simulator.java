public class Simulator {

    public static void main(String[] args) {

        Hero dragon = new Hero(new WalkMove());

        dragon.performMove();

        dragon.setMovementStrategy(new FlyMove());
        dragon.performMove();

        dragon.setMovementStrategy(new SwimMove());
        dragon.performMove();
    }
}