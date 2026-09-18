import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(5, 3));
        rectangles.add(new Rectangle(6, 4));
        rectangles.add(new Rectangle(7, 5));
        rectangles.add(new Rectangle(8, 2));
        rectangles.add(new Rectangle(10, 5));

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter > 10:");
        System.out.println("--------------------------------");

        for (Rectangle rectangle : rectangles)
        {
            double perimeter =
                    2 * (rectangle.getWidth() + rectangle.getHeight());

            if (filter.accept(rectangle))
            {
                System.out.println(
                        "Width: " + rectangle.getWidth()
                                + ", Height: " + rectangle.getHeight()
                                + ", Perimeter: " + perimeter
                );
            }
        }
    }
}
