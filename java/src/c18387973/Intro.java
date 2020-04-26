package c18387973;

import processing.core.*;
//translate and rotate
// This is an example of a visual that renders the waveform
public class Intro
{
    MyVisual mv;

    public Intro(MyVisual mv)
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
            mv.textSize(50);
            mv.text("Dionysus (BTS)", 100, 270, mv.getAudioBuffer().get(i));
            mv.text("(By EJ) ",180,370);
        }
    }
}