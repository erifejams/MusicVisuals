package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm extends MyVision 
{
    MyVisual mv;
    float cy = 0;
    float w;

    public WaveForm(MyVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height ;
        w =this.mv.width;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        float gap = mv.width / (float) mv.getAudioBuffer().size();
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);
            mv.strokeWeight(1);
            mv.line(i, cy, i + i  , cy + cy * mv.getAudioBuffer().get(i));
            mv.line(i * gap, cy, i * gap, cy + cy * mv.getAudioBuffer().get(i));
        }
    }
}