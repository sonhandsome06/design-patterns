package study.patterns.bridge.vehicle;

public class Main {
    public static void main(String[] args) {
        var RedColor = new RedColor();
        var bike = new BikeShape(RedColor);
        bike.draw();
    }
}
