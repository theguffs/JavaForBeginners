interface Operation {
    int perform(int x, int y);
}
class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        return x + y;
    }
}
class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x - y;
    }
}
class Multiply implements Operation {   
    @Override
    public int perform(int x, int y) {
        return x * y;
    }
}
class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        return x / y;
    }
}
class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x - y;
    }
}