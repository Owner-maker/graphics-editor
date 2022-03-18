package graphics_editor.geometry_shapes;

public class FigureFitsException extends Exception
{
    private final transient GeometryShape figure;

    public GeometryShape getFigure()
    {
        return figure;
    }

    public FigureFitsException(String message, GeometryShape figure)
    {

        super(message);
        this.figure = figure;
    }
}
