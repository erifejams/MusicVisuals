package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class CirclesVisual {
    MyVisual mv;
    float x;
    float y;
    float size;

    public CirclesVisual(MyVisual mv)
    {
        this.mv = mv;
    }

    float r = 0;
    float d =8;
    float n =5;

    public void render()
    {
        float k = 7;
        mv.translate(mv.width /2 , mv.height/2);
        mv.beginShape();
        mv.stroke(255);
        /*
        mv.ellipse(650+r,170,mv.random(15,45), mv.random(15,45));
        mv.rect(750+r,170,mv.random(15,45), mv.random(15,45));
        */

        mv.noFill();
        mv.strokeWeight(4);
        for (float a = 0; a< PConstants.TWO_PI; a += 0.1) {//polar to cartesian transformation
            float r = 200 * MyVisual.cos(k * a);
            float x = r * MyVisual.cos(a);
            float y = r* MyVisual.sin(a);
            mv.vertex(x,y);
        }
        mv.endShape(PConstants.CLOSE);
        
    }
}