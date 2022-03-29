public class RectangleDimension
{
    float length;
    float breadth;

}
class Rectangle extends RectangleDimension
{
    float area;
    public float rectangleArea()
    {
        area=length*breadth;
        return area;
    }
}
