public class random {

    public int randInt(int i, Object object) {
        if (i <= 0) {
            throw new IllegalArgumentException("i must be positive");
        }
        return (int) (Math.random() * i);
    }

}
