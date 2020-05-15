package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class SquareVisual {
    MyVisual mv;
    float cy = 0;
    
    public SquareVisual(MyVisual mv) {
        this.mv = mv;
        cy = this.mv.height ;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);
            mv.line( mv.getAudioBuffer().size(), cy, mv.getAudioBuffer().size(), cy + cy * mv.getAudioBuffer().get(i));
            //mv.line(i, cy, i + i  , cy + cy * mv.getAudioBuffer().get(i));
            mv.line(i , cy, i * gap, cy + cy * mv.getAudioBuffer().get(i));
        }
    }

}