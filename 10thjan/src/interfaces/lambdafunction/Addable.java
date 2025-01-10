package interfaces.lambdafunction;

/*
by @FunctionalInterface anno compiler ensures that it's a functional intf meaning it
has only one abstract method (there may 0 or more default and static methods.)
 */
//Functional interface
@FunctionalInterface
public interface Addable {
   double add(double no1,double no2);


   default void meth(){
      System.out.println("inside meth");
   };
}
