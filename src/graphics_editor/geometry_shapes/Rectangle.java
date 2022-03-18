package graphics_editor.geometry_shapes;

public class Rectangle extends GeometryShape {
    private int length;
    private int width;

    public Rectangle(Point2D point, int length, int width) throws IllegalFigureValueException {
        this.startPoint = point;
        if (length <= 0) {
            throw new IllegalFigureValueException("Отрицательной длина прямоугольника быть не может.", length);
        }
        else {
            this.length = length;
        }
        if (width <= 0) {
            throw new IllegalFigureValueException("Отрицательной ширина прямоугольника быть не может.", width);
        }
        else {
            this.width = width;
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getSquare() {
        return (double) length * width;
    }

    @Override
    public boolean isFitsOnCanvas(int widthOfCanvas, int lengthOfCanvas, int canvasStartXPoint, int canvasStartYPoint) {
        return startPoint.getX() + length <= lengthOfCanvas && startPoint.getX() >= canvasStartXPoint && startPoint.getY() + width <= widthOfCanvas && startPoint.getY() >= canvasStartYPoint;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник с длиной = %d и шириной = %d в стартовой точке %s, площадь: %.2f", length, width, startPoint, getSquare());
    }
}
