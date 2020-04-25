package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WavesVisual
{
    MyVisual mv;
    int xspacing = 25;   //reduce this to make the cicles closer
    int w;              // Width of wave on the screen
    float amplitude = 70.0F;  //shows the height of the circles
    float dx;  // Value for incrementing x, a function of xspacing
    float[] yvalues;  // Using an array to store height values for the wave
    float a= 4;

    public WavesVisual(MyVisual mv)
    {
        this.mv = mv;
        w =  this.mv.width+16;
        dx = (4500) * xspacing;
        yvalues = new float[(int) (w/ xspacing)];
    }

    void calcWave() {
        // For every x value, calculate a y value with sine function
        float x = 0.0F;
        for (int i = 0; i < yvalues.length; i++) {
          yvalues[i] = sin(x)*amplitude;
          x+=dx;
        }
    }

    private float sin(float x) {
        return 0;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);//sets the colour
        calcWave();
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255),  255, 255
            );
            for (int x = 0; x < yvalues.length; x++) {
                mv.ellipse(x * xspacing, amplitude / 2 + yvalues[x], 16, 25 * mv.getAudioBuffer().get(i));
                //mv.ellipse(x*xspacing, amplitude/2+yvalues[x], 16,  16 + 16 * mv.getAudioBuffer().get(i));
                //mv.ellipse(x*xspacing, a(amplitude/2+yvalues[x]), 16,  25 + 25 * mv.getAudioBuffer().get(i));
                //mv.ellipse(x * xspacing, amplitude / 2 + yvalues[x], 16, 16 + 16 * mv.getAudioBuffer().get(i));
                //mv.ellipse(x*xspacing, amplitude/2+yvalues[x], 25,  30 + 30 * mv.getAudioBuffer().get(i));
            }
        }
    }
    
}