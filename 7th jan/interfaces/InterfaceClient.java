package interfaces;

public class InterfaceClient {
    public static void main(String[] args) {
        Bounceable b;

        b = new Ball(2,"red");
        b.bounce();
        b.setBounceFactor(5);
        b.bounce();
        System.out.println(b.getInterfaceInfo());
        System.out.println(Bounceable.getBBF());


        meth(b);
        meth(new Ball(4,"black"));
        meth(new Tyre());

    }

    public static void meth(Bounceable b)
    {
        b.bounce();
        b.setBounceFactor(5);
        b.bounce();

    }
}
