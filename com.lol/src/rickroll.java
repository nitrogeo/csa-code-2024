public class rickroll {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Never Gonna Give You Up");
            try {
                Thread.sleep(500); // 500 milliseconds = 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle the exception (optional)
            }
        }
    }
}
