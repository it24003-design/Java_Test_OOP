public class CustomPRNG {

    private static long seed = System.nanoTime();

    private static long nextSeed() {
        seed = (1664525L * seed + 1013904223L + (seed << 7))
                ^ (seed >>> 9);
        return Math.abs(seed);
    }

    public static int randomInt(int bound) {
        return (int) (nextSeed() % bound);
    }

    public static int randomInt(int min, int max) {
        return min + randomInt(max - min + 1);
    }

    public static double randomDouble() {
        return (nextSeed() % 1_000_000) / 1_000_000.0;
    }

    public static float randomFloat() {
        return (nextSeed() % 1_000_000) / 1_000_000f;
    }

    public static double randomMixed(int min, int max) {
        return randomInt(min, max) + randomDouble();
    }
}
