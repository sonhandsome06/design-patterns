package study.patterns.bridge.vehicle;

public abstract class Shape {
    public Color color;
    public Shape(Color color) {
        this.color = color;
    }
    abstract void draw();
}
