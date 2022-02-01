package Java2.Lesson1;

public class RunningTrack extends Obstacle {
    private int distance = 15;

    public RunningTrack() {

    }

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
