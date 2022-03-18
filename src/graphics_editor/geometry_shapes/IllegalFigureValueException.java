package graphics_editor.geometry_shapes;

public class IllegalFigureValueException extends Exception
{
    private final int length;

    public int getLength()
    {
        return length;
    }

    public IllegalFigureValueException(String message, int length)
    {

        super(message);
        this.length = length;
    }
}
