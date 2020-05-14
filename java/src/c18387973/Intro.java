package c18387973;

import processing.core.*;

public class Intro
{
    MyVisual mv;

    public Intro(MyVisual mv)
    {
        this.mv = mv;
    }

    float r = 0;
    public void render()
    {
        mv.fill(250);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.fill(257 * mv.getAudioBuffer().get(i),25 *mv.getAudioBuffer().get(i),157 *mv.getAudioBuffer().get(i) );//colours didn't happen like i wanted it to, but this cool feature of it flashing did
            mv.textSize(70);
            mv.text("Dionysus (BTS)", 850,  370);
            mv.text("(By EJ) ",850,470);
        }

        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 50, 200),  200, 255);
            mv.fill(255 * mv.getAudioBuffer().size());
            mv.rotate(r);
            float c = mv.random(10,35);
            float b = mv.random(15,45);
            //mv.ellipse(650+r,170,c, c);
            //mv.rect(750+r,170,b, b);
            mv.triangle(450+r,170,c, b,c,b);
            mv.triangle(650+r,170,c, b,c,b);
            r= r +0.4F; // for rotating by tthe angle
        }
    }
}