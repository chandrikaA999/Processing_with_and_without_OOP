import processing.core.PApplet;

public class Ball {

    private PApplet p;
    private int xAxis=0;
    private int yAxis;
    private int velocity;
    private int diameter;

    Ball(PApplet p,int xAxis,int yAxis,int diameter,int velocity){
        this.p=p;
        this.xAxis=xAxis;
        this.yAxis=yAxis;
        this.diameter=diameter;
        this.velocity=velocity;
    }
    void display(){
        p.ellipse(xAxis,yAxis,diameter,diameter);
        xAxis=xAxis+velocity;
    }
}
