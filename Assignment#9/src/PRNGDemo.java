public class PRNGDemo {

    public static void main(String[] args) {

        System.out.println("Random Integer:");
        System.out.println(CustomPRNG.randomInt(100));

        System.out.println("Random Double:");
        System.out.println(CustomPRNG.randomDouble());

        System.out.println("Random Float:");
        System.out.println(CustomPRNG.randomFloat());

        System.out.println("Random Range Integer:");
        System.out.println(CustomPRNG.randomInt(10, 50));

        System.out.println("Random Mixed:");
        System.out.println(CustomPRNG.randomMixed(5, 20));
    }
}
