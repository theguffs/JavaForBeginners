public enum Direction {
    North("north"), South("south"), East("east"), West("west");
    private String name;
    Direction(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public Direction left() {
    return switch (this) {
        case North -> West;
        case South -> East;
        case East -> North;
        case West -> South;
    };
}
public Direction right() {
    return switch (this) {
        case North -> East;
        case South -> West;
        case East -> South;
        case West -> North;
    };
}
