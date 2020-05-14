package c18387973;

//import ie.tudublin.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import processing.core.*;
   
public class MyVisual extends Visual
{    
    //WaveForm wf;
    WavesVisual wf;
    AudioBandsVisual abv;
    Intro it;
    //SpinningSquaresVisual sp;
    //SpinningCirclesVisual sp;

    public void settings()
    {
        size(500, 500, P2D);
        //println("CWD: " + System.getProperty("user.dir"));
    }

    PGraphics pg;
    public void setup()
    {
        colorMode(HSB);
        startMinim();
        pg = createGraphics(40,40);
        // Call loadAudio to load an audio file to process 
        loadAudio("Dionysus.mp3");   
        getAudioPlayer().play();
       
        //abv = new AudioBandsVisual(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        } // switch
    }
   
    public void draw()
    {
        background(0);
        calculateAverageAmplitude();
        try
        {
            calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();
        it = new Intro(this);
        //wf = new WavesVisual(this);
        //abv = new AudioBandsVisual(this);  
        //abv.render();  
        //wf.render();
        it.render();
        //calculateAverageAmplitude();
        //sp = new SpinningSquaresVisual(this);
        //it.render();
        //sp.render();
    }
}    