package study.patterns.bridge.vehicle;

public class BikeShape extends Shape {
    public BikeShape(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("BikeShape:");
        color.fill();
        System.out.println("main-branch");
    }
}
