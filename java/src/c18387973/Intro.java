package c18387973;

import processing.core.*;

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
            mv.fill(PApplet.map(i, 0, mv.getAudioBuffer().size(), 50, 255),  200, 255);
            //mv.fill(102, 0, 51);
            mv.textSize(50);
            mv.text("Dionysus (BTS)", 500,  270 );
            mv.text("(By EJ) ",580,370);
        }
    }
}