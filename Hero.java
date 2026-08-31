public class Hero {

    private MovementStrategy movementStrategy;

    public Hero(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void performMove() {
        movementStrategy.move();
    }

    public void setMovementStrategy(MovementStrategy strategy) {
        this.movementStrategy = strategy;
    }
}