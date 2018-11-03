public class Cylinder extends Circle{
    private double height;

    public Cylinder(){}
    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    public String toString(){
        return "A Cylinder have height is: "
                + getHeight()
                + " and Volume is: "
                + getVolume()
                + super.toString();
    }

}
