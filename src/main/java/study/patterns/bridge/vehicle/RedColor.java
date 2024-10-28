package study.patterns.bridge.vehicle;

public class RedColor implements Color {
    @Override
    public void fill() {
        System.out.println("Red color fill");
    }
}
