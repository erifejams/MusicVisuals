package c18387973;

//import ie.tudublin.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
//import processing.core.*;
   
public class MyVisual extends Visual
{   
    /*
    //classes
    WaveForm wf;
    WavesVisual wv;
    AudioBandsVisual abv;
    Intro it;
    CirclesVisual cv;
    //Timer4Names tn; 
    MembersNameDrop mn;
    SquareVisual sv;
    */

    public void settings()
    {
        size(500, 500, P2D);
    }

    public void setup()
    {
        colorMode(HSB);
        startMinim();
        // Call loadAudio to load an audio file to process 
        loadAudio("Dionysus.mp3");   
        getAudioPlayer().play();
        setFrameSize(256);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        } 
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

        /*
        if(key == CODED)
        {
            if (keyCode == UP)
            {
                //scene 1
                it = new Intro(this);
                it.render();
                visions.get(vision).render()
            }
            else
            if(keyCode == DOWN)
            {
                //scene 2
                wv = new WavesVisual(this);
                wv.render();
            }
            else 
            if(keyCode == LEFT)
            {
                //scene3
                mn = new MembersNameDrop(this);
                abv = new AudioBandsVisual(this);  
                mn.render();
                abv.render();
            }
            else 
            if(keyCode == RIGHT)
            {
                //scene4
                wf = new WaveForm(this);
                wf.render();
            }
            else 
            if(keyCode == )
            {
                //scene5
                cv = new CirclesVisual(this);
                cv.render();
                cv.display();
            }
        }
        */

        //sv = new SquareVisual(this);
        //sv.render();
    }
}    