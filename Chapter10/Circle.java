//(Project:
// Shape
// Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3. Each Two-
//DimensionalShape
// should contain method getArea to calculate the area of the two-dimensional
//shape. Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the
//surface area and volume, respectively, of the three-dimensional shape. Create a program that uses
//an array of Shape references to objects of each concrete class in the hierarchy. The program should
//print a text description of the object to which each array element refers. Also, in the loop that pro-
//cesses all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
//ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimension-
//alShape, display its area and volume.


package JavaHowToProgram.Chapter10;

public class Circle extends TwoDimensional{
    private double radius;

    public Circle(double radius){
        setRadius(radius);

    }

    public double getRadius() {return radius;}
    public final void setRadius(double radius){
        if(radius <= 0)
            throw new IllegalArgumentException("Radius must be positive~");
        else
            this.radius = radius;
    }


    @Override
    public double getArea(){return Math.PI * Math.pow(getRadius(), 2);}

    @Override
    public String toString(){
        return String.format("%s: %2f", "Radius equals", getRadius());
    }
}
