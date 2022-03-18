package graphics_editor.geometry_shapes;

import java.io.Serializable;

public abstract class GeometryShape implements Serializable {
    public abstract double getSquare();

    protected transient Point2D startPoint;

    public Point2D getStartPoint() {
        return new Point2D(this.startPoint.getX(), this.startPoint.getY());
    }

    public abstract boolean isFitsOnCanvas(int widthOfCanvas, int lengthOfCanvas, int canvasStartXPoint, int canvasStartYPoint);
}
