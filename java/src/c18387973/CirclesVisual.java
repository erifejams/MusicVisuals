package c18387973;

import processing.core.*;
import ie.tudublin.*;

// This is an example of a visual that renders the waveform
public class CirclesVisual extends Visual {
    MyVisual mv;
    float x;
    float y;
    float size;

    public CirclesVisual(MyVisual mv)
    {
        this.mv = mv;
    }

    float r = 0;

    public void render()
    {
        //mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 50, 200),  200, 255);
            mv.fill(255 * mv.getAudioBuffer().size());
            mv.rotate(r); //rotating the angle of the shape
            mv.ellipse(650+r,170,mv.random(15,45), mv.random(15,45));
            mv.rect(750+r,170,mv.random(15,45), mv.random(15,45));
            mv.triangle(450,170, 300, 450, 400,100);
            r= r +0.4F; // for rotating by the angle
        }
    }
}