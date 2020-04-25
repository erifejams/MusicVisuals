package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class SpinningCirclesVisual
{
    MyVisual mv;
    float x;
    float y;
    float size;

    public SpinningCirclesVisual(MyVisual mv)
    {
        this.mv = mv;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255),  255, 255
            );
            mv.ellipse(mv.width / 2, mv.height / 2, 100, 100);
            mv.ellipse(mv.width / 2, mv.height / 2, 200, 200);
            mv.ellipse(mv.width / 2, mv.height / 2, 300, 300 );
            mv.ellipse(mv.width / 2, mv.height / 2, 400, 400 );
            mv.ellipse(mv.width / 2, mv.height / 2, 500, 500 );
            mv.ellipse(mv.width / 2, mv.height / 2, 600, 600);
            mv.ellipse(mv.width / 2, mv.height / 2, 700, 700 );
            mv.ellipse(mv.width / 2, mv.height / 2, 700, 700 );
        }

    }
}