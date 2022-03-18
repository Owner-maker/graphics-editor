package graphics_editor.geometry_shapes;

import graphics_editor.GraphicsEditor;

public class Square extends GeometryShape
{
    private int length;

    public Square(Point2D point, int length) throws IllegalFigureValueException
    {
        this.startPoint = point;
        if (length <= 0)
        {
            throw new IllegalFigureValueException("Отрицательной сторона квадрата быть не может.", length);
        }
        else
        {
            this.length = length;
        }
    }

    public int getLength()
    {
        return length;
    }

    @Override
    public double getSquare()
    {
        return (double) length * length;
    }

    @Override
    public boolean isFitsOnCanvas(int widthOfCanvas, int lengthOfCanvas, int canvasStartXPoint, int canvasStartYPoint)
    {
        return startPoint.getX() + length <= lengthOfCanvas && startPoint.getX() >= canvasStartXPoint && startPoint.getY() + length <= widthOfCanvas && startPoint.getY() >= canvasStartYPoint;
    }

    @Override
    public String toString()
    {
        return String.format("Квадрат со стороной = %d в стартовой точке %s, площадь %.2f", length, startPoint, getSquare());
    }
}
