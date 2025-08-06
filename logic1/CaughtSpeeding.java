public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }

        if (speed <= 60) return 0;
        if (speed <= 80) return 1;
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false)); // 0
        System.out.println(caughtSpeeding(65, false)); // 1
        System.out.println(caughtSpeeding(65, true));  // 0
    }
}
