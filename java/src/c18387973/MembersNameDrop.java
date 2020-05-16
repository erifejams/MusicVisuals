package c18387973;

import processing.core.*;

public class MembersNameDrop extends MyVision 
{
    MyVisual mv;

    public MembersNameDrop(MyVisual mv)
    {
        this.mv = mv;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
           mv.fill(PApplet.map(i, 0, mv.getAudioBuffer().size(), 50, 255),  200, 255);
            mv.textSize(50);
            //mv.text("Dionysus (BTS)", 500* mv.getAudioBuffer().get(i), 270 );
            mv.text("(joon) ",0,370 * mv.getAudioBuffer().get(i));
            mv.text("(jin) ",142,370 * mv.getAudioBuffer().get(i));
            mv.text("(yoongi) ",244,370 * mv.getAudioBuffer().get(i));
            mv.text("(jhope) ",460,370 * mv.getAudioBuffer().get(i));
            //mv.text("Dionysus (BTS)", 200* mv.getAudioBuffer().get(i), 570);
            mv.text("(jimin) ",650,370 * mv.getAudioBuffer().get(i));
            mv.text("(taehyung) ",820,370 * mv.getAudioBuffer().get(i));
            mv.text("(jungkook) ",1100,370 * mv.getAudioBuffer().get(i));
        }
    }
}
