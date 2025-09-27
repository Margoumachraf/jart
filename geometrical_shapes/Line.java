package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point start;
    private Point end;
    Color color;

    public Line() {
        this.start = new Point();
        this.end = new Point();
        this.color = getColor();
    }

    public Line(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    @Override
    public void draw(Displayable displayable) {

        int dx = Math.abs(this.end.x - this.start.x);
        int dy = Math.abs(this.end.y - this.start.y);
        int sx = this.start.x < this.end.x ? 1 : -1;
        int sy = this.start.y < this.end.y ? 1 : -1;
        int err = dx - dy;

        int x = this.start.x;
        int y = this.start.y;

        while (true) {
            displayable.display(x, y, color);

            if (x == this.end.x && y == this.end.y) {
                break;

            }

            int e2 = 2 * err;

            if (e2 > -dy) {
                err -= dy;
                x += sx;
            }

            if (e2 < dx) {
                err += dx;
                y += sy;
            }
        }

    }
}
