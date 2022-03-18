package graphics_editor;

import graphics_editor.geometry_shapes.FigureFitsException;
import graphics_editor.geometry_shapes.GeometryShape;

import java.util.ArrayList;
import java.util.List;

public class GraphicsEditor
{
    static final int CANVAS_LENGTH = 100;
    static final int CANVAS_WIDTH = 100;
    static final int CANVAS_START_X_POINT = 0;
    static final int CANVAS_START_Y_POINT = 0;
    private static final List<GeometryShape> CANVAS = new ArrayList<>();

    private GraphicsEditor()
    {
    }

    public static void addFigure(GeometryShape figure) throws FigureFitsException
    {
        if (!figure.isFitsOnCanvas(CANVAS_WIDTH, CANVAS_LENGTH, CANVAS_START_X_POINT, CANVAS_START_Y_POINT))
        {
            if (figure.getStartPoint().getX() < CANVAS_START_X_POINT || figure.getStartPoint().getY() < CANVAS_START_Y_POINT)
            {
                throw new FigureFitsException("Точка позиционирования фигуры вне холста.", figure);
            }
            throw new FigureFitsException("Фигура не умещается на холсте из-за ее размеров.", figure);
        }
        else
        {
            for (int i = 0; i < CANVAS.size(); i++)
            {
                if (figure.getStartPoint().equals(CANVAS.get(i).getStartPoint()))
                {
                    CANVAS.set(i, figure);
                    return;
                }
            }
            CANVAS.add(figure);
        }
    }

    public static List<GeometryShape> getCANVAS()
    {
        return new ArrayList<>(CANVAS);
    }

    public static int getCanvasStartXPoint()
    {
        return CANVAS_START_X_POINT;
    }

    public static int getCanvasStartYPoint()
    {
        return CANVAS_START_Y_POINT;
    }
}
