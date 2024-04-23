import processing.core.PApplet;

public class TryProcessing extends PApplet
{
    public static final int HEIGHT = 980;
    public static final int WIDTH = 1280;
    public static final int DIAMETER = 30;
    private Ball[] ball=new Ball[4];

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

        for(int i=0;i<ball.length;i++){
            ball[i]=new Ball(this,0,(i+1)*HEIGHT/5,DIAMETER,i+1);
        }
    }

    @Override
    public void draw() {
        for(Ball ball:ball){
            ball.display();
        }

    }

}


