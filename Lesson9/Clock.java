public class Clock {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        for(int hours = 0; hours <= 11; hours++) {
            for(int minutes = 0; minutes <= 59; minutes++) {
                for(int seconds = 0; seconds <= 59; seconds++) {
                    Thread.sleep(1000);
                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                }
            }
        }


        System.out.println();
    }
}
