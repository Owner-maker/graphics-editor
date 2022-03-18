package graphics_editor.user;

import graphics_editor.geometry_shapes.*;

public class User
{

    private User()
    {
    }

    @Shape
    public static Rectangle getRectangle() throws IllegalFigureValueException
    {
        return new Rectangle(new Point2D(3, 9), 10, -30);
    }

    @Shape
    public static Rectangle getRectangle2() throws IllegalFigureValueException
    {
        return new Rectangle(new Point2D(80, 49), 10, 30);
    }

    public static Square getSquare() throws IllegalFigureValueException
    {
        return new Square(new Point2D(40, 49), 40);
    }

    @Shape
    public static Square getSquare2() throws IllegalFigureValueException
    {
        return new Square(new Point2D(6, 4), 40);
    }

    @Shape
    public static Circle getCircle() throws IllegalFigureValueException
    {
        return new Circle(new Point2D(50, 40), 20);
    }

    @Shape
    public static Circle getCircle2() throws IllegalFigureValueException
    {
        return new Circle(new Point2D(50, 40), 50);
    }
}
