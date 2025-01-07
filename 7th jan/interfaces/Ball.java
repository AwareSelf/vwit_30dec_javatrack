package interfaces;

public class Ball implements Bounceable {
    private int ballbf;
    private String color;

    public Ball(int ballbf, String color) {
        this.ballbf = ballbf;
        this.color = color;
    }

    @Override
    public void bounce() {
        System.out.println("Ball with color:"+this.color+" is bouncing witg bounce" +
                " factor:"+this.ballbf);
    }

    @Override
    public void setBounceFactor(int multiple) {

        this.ballbf += (Bounceable.BBF * multiple);
        //this,ballbf = this.ballbf + (Bounceable.BBF * multiple)
    }
}
