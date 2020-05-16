package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class SquareVisual extends MyVision  {
    MyVisual mv;
    float cy = 0;
    
    public SquareVisual(MyVisual mv) {
        this.mv = mv;
        cy = this.mv.height ;
    }

    float angle;

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        mv.strokeWeight(25);
        //mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);
        //mv.line(i, cy, i + i  , cy + cy * mv.getAudioBuffer().get(i));
        mv.translate(mv.width/2, mv.height/2);
        float scaleVar = (PApplet.map(10, 0, mv.width, 5,5));
        mv.scale(scaleVar);
        for(int j=0; j<10; j++)
        {
            for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
            {
                mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255*mv.getAudioBuffer().get(i)),  255, 255);
                mv.fill(0);
                mv.scale(0.95F);
                mv.rotate(angle);
                mv.rect(400,600, 500,300*mv.getAudioBuffer().get(i));
                mv.rect(100,100, 300,300*mv.getAudioBuffer().get(i));
            }
        }
        angle +=0.1;
        
    }
}
