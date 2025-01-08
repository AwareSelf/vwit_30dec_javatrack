package abstractclasses;

public class UseShape {
    public static void main(String[] args) {
        Shape s;
      //  s = new Shape(); //error - you can't instantiate abstract class

        meth(new Square(4)); //on-fly square object passed

        s = new Square(2);  //Square is object passed via reference
        meth(s); //3000

        s = new Square(5);// assigned ans used directly instead of passing to method
        System.out.println("For Shape type:"+s.getShapeType());
        System.out.println("Area:"+s.calcArea());
        System.out.println("Perimeter:"+s.calcPerimeter());

        /*
        s = new Reactangle(4,6);
        System.out.println("For Shape type:"+s.getShapeType());
        System.out.println("Area:"+s.calcArea());
        System.out.println("Perimeter:"+s.calcPerimeter());

        meth1(s);
        */

    }

    public static void meth(Shape s) //4000
    {
        System.out.println("For Shape type:"+s.getShapeType());
        System.out.println("Area:"+s.calcArea());
        System.out.println("Perimeter:"+s.calcPerimeter());

    }
}
