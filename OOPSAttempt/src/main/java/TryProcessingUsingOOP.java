import processing.core.PApplet;

public class TryProcessingUsingOOP extends PApplet{

    public static final int HEIGHT = 980;
    public static final int WIDTH = 1280;
    public static final int DIAMETER = 30;
    private BallSketch[] ball=new BallSketch[4];

    public static void main(String[] args) {
        PApplet.main("TryProcessingUsingOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        ball[0]=new BallSketch(0,HEIGHT/5,1);
        ball[1]=new BallSketch(0,2*HEIGHT/5,2);
        ball[2]=new BallSketch(0,3*HEIGHT/5,3);
        ball[3]=new BallSketch(0,4*HEIGHT/5,4);
    }

    @Override
    public void draw() {
        for(BallSketch ball:ball){
            ball.display();
        }

    }
    private class BallSketch{
       private int xAxis;
        private int yAxis;
        private int velocity;
        BallSketch(int xAxis,int yAxis,int velocity){
            this.velocity=velocity;
            this.xAxis=xAxis;
            this.yAxis=yAxis;
        }
        void display(){
            ellipse(xAxis,yAxis, DIAMETER,DIAMETER);
            xAxis=xAxis+velocity;
        }

    }
}
