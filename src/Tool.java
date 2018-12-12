import java.awt.*;

public class Tool {
    private Graphics graphics;
    private int step =0;
    private int width;
    private int height;

    public void cls() {
        this.graphics.setColor(Color.white);
        this.graphics.fillRect(0, 0, (int) getWidth() , (int) getHeight());
    }

    public void write(double x, double y, String text) {
        this.graphics.setColor(Color.red);
        this.graphics.drawString(text, (int)x, (int) y);
    }

    public void line(double x1, double y1, double x2, double y2, Color color) {
        graphics.setColor(color);
        graphics.drawLine((int) x1, (int)y1, (int)x2, (int)y2);
    }

    public void circle(double x, double y, Color color, double ray) {
        this.graphics.setColor(color);
        this.graphics.drawOval((int) (x - ray), (int) (y - ray) , (int) (ray*2), (int) (ray*2));

    }

    public int getStep() {
        return this.step;
    }

    public void addStep() {
        this.step++;
    }
    public void setSize(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getWidth() {
        return this.width;
    }


    public int getHeight() {
        return this.height;
    }

    public double getHalfWidth() {
        return this.width / 2;
    }


    public double getHalfHeight() {
        return this.height / 2;
    }

    public void addGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
}
