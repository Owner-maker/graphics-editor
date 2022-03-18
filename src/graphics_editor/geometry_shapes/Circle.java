package graphics_editor.geometry_shapes;

import graphics_editor.GraphicsEditor;

public class Circle extends GeometryShape
{
    int radius;

    public Circle(Point2D center, int radius) throws IllegalFigureValueException
    {
        this.startPoint = center;
        if (radius <= 0)
        {
            throw new IllegalFigureValueException("Отрицательным радиус круга быть не может.", radius);
        }
        else
        {
            this.radius = radius;
        }
    }

    public int getRadius()
    {
        return radius;
    }

    @Override
    public double getSquare()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean isFitsOnCanvas(int widthOfCanvas, int lengthOfCanvas, int canvasStartXPoint, int canvasStartYPoint)
    {
        return startPoint.getX() + radius <= lengthOfCanvas && startPoint.getX() - radius >= canvasStartXPoint && startPoint.getY() + radius <= widthOfCanvas && startPoint.getY() - radius >= canvasStartYPoint;
    }

    @Override
    public String toString()
    {
        return String.format("Круг с радиусом = %d с центром в точке %s, площадь %.2f", radius, startPoint, getSquare());
    }
}
