package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    Color color;

    public Rectangle(Point p1, Point p3) {
        this.p1 = p1;
        this.p2 = new Point(p1.x, p3.y);
        this.p3 = p3;
        this.p4 = new Point(p3.x, p1.y);
        this.color = getColor();
    }

    @Override
    public void draw(Displayable displayable) {
        Line line1 = new Line(this.p1,this.p2, this.color);
        Line line2 = new Line(this.p2,this.p3, this.color);
        Line line3 = new Line(this.p3,this.p4, this.color);
        Line line4 = new Line(this.p4,this.p1, this.color);
        line1.draw(displayable);
        line2.draw(displayable);
        line3.draw(displayable);
        line4.draw(displayable);
    }

}
