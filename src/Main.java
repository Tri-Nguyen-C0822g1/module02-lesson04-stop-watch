
public class Main {
    public static void main(String[] args) {
    Stop_watch stop_watch1 = new Stop_watch();
        System.out.println("Start time is: ");
        stop_watch1.setStartTime();
        System.out.println(stop_watch1.getStartTime());

        for (int i = 1; i < 10000000; i++){
            System.out.print("");
        }
        System.out.println("End time is:");
        stop_watch1.setEndTime();
        System.out.println(stop_watch1.getEndTime());

        System.out.println("Elapsed time is:");
        System.out.println(stop_watch1.getElapsedTime());
    }

}