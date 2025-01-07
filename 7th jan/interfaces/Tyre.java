package interfaces;

public class Tyre implements Bounceable{
    private int bf;

    public Tyre()
    {
        this.bf = Bounceable.BBF;
    }

    @Override
    public void bounce() {
        System.out.println("Tyre is bouncing with bounce factor:"+this.bf);
    }

    @Override
    public void setBounceFactor(int multiple) {
       this.bf = this.bf + multiple;
    }
}
