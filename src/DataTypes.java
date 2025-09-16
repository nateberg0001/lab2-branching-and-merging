public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0;
        for (long number : numbers) {
            s += number;
        }
        return s;
    }
}
