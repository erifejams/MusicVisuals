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

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        ellipse(width / 2, height / 2, 100, 100);
        fill(100,50,200);
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255),255, 255);
        ellipse(width / 2, height / 2, 200, 200);
        fill(255,0,200);
        ellipse(width / 2, height / 2, 300, 300);

        fill(255,255,255);
        ellipse(width , height , 200, 200);

        fill(255,255,255);
        ellipse(width , height , 450, 450);

    }
}