import processing.core.PApplet;

public class TryProcessing extends PApplet
{
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 980;
    public static final int DIAMETER = 30;
    int m=0,n=0,o=0,p=0;

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
    }

    @Override
    public void draw() {

        drawEllipse(m,HEIGHT/5);
        m++;
        drawEllipse(n,2*HEIGHT/5);
        n=n+2;
        drawEllipse(o,3*HEIGHT/5);
        o=o+3;
        drawEllipse(p,4*HEIGHT/5);
        p=p+4;
    }
    private void drawEllipse(int x,int height) {
        ellipse(x,height, DIAMETER,DIAMETER);

    }

}
