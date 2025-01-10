package abstractclasses;

public abstract class Shape {
    private double side1,side2;
    private double radius;
    private double height;
    private String shapeType;

    public Shape(){
        System.out.println("Shape no arg constructor called...");
    };
    //used for circle, square
    public Shape(double val,String shapeType) {
        this.shapeType = shapeType;
        if(shapeType.equals("circle"))
        this.radius = val;
        else if(shapeType.equals("square")) {
            this.side1 = this.side2 = val;
        }
    }

    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Shape(double base,double height,String shapeType)
    {
        if(shapeType.equals("triangle"))
        {
            this.side1 = base;
            this.height = height;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public abstract double calcArea();


    public abstract double calcPerimeter();

}
