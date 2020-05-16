package c18387973;

import processing.core.*;

public class CirclesVisual extends MyVision {
    MyVisual mv;
    
    public CirclesVisual(MyVisual mv)
    {
        this.mv = mv;
    }

    float angle = 0;

    public void render()
    {
        //this is the flower visual inside the shape, i used rose mathematics to help create the shape
        float k = 7;
        mv.translate(mv.width /2 , mv.height/2);
        mv.beginShape();
        mv.stroke(128, 0, 255); //was meant to turn the flower purple, but it didn't work
        mv.strokeWeight(2);
        for (float a = 0; a< PConstants.TWO_PI; a += 0.1) {//polar to cartesian transformation
            float r = 100 * MyVisual.cos(k * a);
            float x = r * MyVisual.cos(a);
            float y = r* MyVisual.sin(a);
            mv.circle(x, y, r );
            angle = angle + 2;
        }
        mv.endShape(PConstants.CLOSE);
    }

    //displays the shapes
    public void display()
    {
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.rotate(angle); //rotating the shapes
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255),  255, 255);
            mv.fill(0);
            //mv.noFill();
            //shapes, that make random sizes of the shape, plus with the rotate, it helps to rotate the shape
            mv.ellipse(590 +angle,170,mv.random(15,35), mv.random(15,45));
            mv.rect(500 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.ellipse(420 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.rect(320 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.ellipse(240 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.rect(120 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.ellipse(20 + angle,170,mv.random(15,35), mv.random(15,45));
        }
    }
}