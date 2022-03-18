package graphics_editor;

import graphics_editor.geometry_shapes.FigureFitsException;
import graphics_editor.geometry_shapes.GeometryShape;
import graphics_editor.user.Shape;
import graphics_editor.user.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args)
    {
        Method[] methods = User.class.getDeclaredMethods();
        for (Method m : methods)
        {
            if (m.isAnnotationPresent(Shape.class))
            {
                GeometryShape shape = null;
                try
                {
                    shape = (GeometryShape) m.invoke(null);
                    GraphicsEditor.addFigure(shape);
                }
                catch (IllegalAccessException | InvocationTargetException e)
                {
                    System.err.println(e.getCause().getMessage());
                }
                catch (FigureFitsException e)
                {
                    System.err.println(e.getMessage());
                    System.err.println(e.getFigure());
                }
            }
        }


        System.out.println("\nХолст: ");
        if (GraphicsEditor.getCANVAS().isEmpty())
        {
            System.out.println("Холст пуст");
        }
        else
        {
            for (GeometryShape shape : GraphicsEditor.getCANVAS())
            {
                System.out.println(shape);
            }
        }
    }
}
