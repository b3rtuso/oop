public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Black", true);
        System.out.printf("The Circle Radius is: %.2fcm \n",circle.getRadius());
        System.out.printf("The Circle Area is: %.2fcm \n",circle.getArea());
        System.out.printf("The Circle Perimeter is: %.2fcm \n" ,circle.getPerimeter());
        System.out.println(circle.toString());
        System.out.println();

        Rectangle rectangle = new Rectangle(14, 13, "Yellow", false);
        System.out.printf("The Rectangle Length is: %.2fcm \n",rectangle.getLength());
        System.out.printf("The Rectangle Width is: %.2fcm \n",rectangle.getWidth());
        System.out.printf("The Rectangle Area is: %.2fcm \n",rectangle.getArea());
        System.out.printf("The Rectangle Perimeter is: %.2fcm \n" ,rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println();
        
        Square square = new Square(14, 14, 14, "Blue", true);
        System.out.printf("The Square Side is: %.2fcm \n",square.getSide());
        System.out.printf("The Square Length is: %.2fcm \n",square.getLength());
        System.out.printf("The Square Width is: %.2fcm \n",square.getWidth());
        System.out.printf("The Square Area is: %.2fcm \n",square.getArea());
        System.out.printf("The Square Perimeter is: %.2fcm \n" ,square.getPerimeter());
        System.out.println(square.toString());
    }
}

abstract class Shape{
    protected String Color;
    protected Boolean Filled;

    public void setColor(String Color){
    this.Color = Color;
    }
    public void setFilled(Boolean Filled) {
        this.Filled = Filled;
    }
    public String getColor(){
        return Color;
    }
    public String isFilled(){
        if (Filled){
            return "Filled.";
        }else{
            return "Not Filled.";
        }
    }
    abstract double getArea();

    abstract double getPerimeter();

    public String toString(){

    return "The Shape is color " + Color +" and it is " + Filled +".";     
    }
}

class Circle extends Shape{
    private double Radius;

    public Circle(double Radius, String Color, boolean Filled){
        this.Radius = Radius;
        this.Color = Color;
        this.Filled = Filled;
    }
    public void setRadius(double Radius){
        this.Radius = Radius;
    }
    public double getRadius(){
        return Radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(Radius, 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * Radius;
    }
    public String toString(){
        return "The Circle is Color " + Color +" and it is " + isFilled() +" It has a Radius of "+ String.format("%.2fcm", getRadius())+", Area of "+String.format("%.2fcm",getArea())+" and Perimeter of "+String.format("%.2fcm",getPerimeter())+".";
    }
}
class Rectangle extends Shape{
    protected double Length;
    protected double Width;
    
        public Rectangle (double Length, double Width, String Color, boolean Filled){
            this.Length = Length;
            this.Width = Width;
            this.Color = Color;
            this.Filled = Filled;
        }
        public Rectangle(){}
        public void setLength(double Length){
            this.Length = Length;
        }
        public void setwidth(double Width){
            this.Width = Width;
        }
        public double getLength(){
            return Length;
        }
        public double getWidth(){
            return Width;
        }
        public double getArea(){
            return Length * Width;
        }
        public double getPerimeter(){
            return 2 * (Length + Width);
        }
        public String toString(){
            return "The Rectangle is Color " + Color +" and it is " + isFilled() +" It has a Length of "+String.format("%.2fcm",getLength())+" and Width of "+String.format("%.2fcm",getWidth())+", Area of "+String.format("%.2fcm",getArea())+" and Perimeter of "+ String.format("%.2fcm",getPerimeter())+".";
        }
    }
    
    class Square extends Rectangle{
        private double Side;
        
        public Square (double Side, double Length, double Width, String Color, boolean Filled){
            this.Side = Side;
            this.Length = Length;
            this.Width = Width;
            this.Color = Color;
            this.Filled = Filled;
         }
        public void setSide(double Side){
            this.Side = Side;
        }
        public double getSide(){
            return Side;
        }
        public double getArea(){
            return Side * Side;
    }
    public double getPerimeter(){
        return 4 * Side;
    }
    public String toString(){
        return "The Square is Color "+ Color + " and it is " +isFilled()+ " It has a Side of "+String.format("%.2fcm",getSide() )+" with an Area of "+ String.format("%.2fcm", getArea())+" and a Perimeter of "+String.format("%.2fcm", getPerimeter());
    }
}