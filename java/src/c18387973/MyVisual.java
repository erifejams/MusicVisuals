package c18387973;

//import ie.tudublin.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
//import processing.core.*;
   
public class MyVisual extends Visual
{   
    WaveForm wf;
    WavesVisual wv;
    AudioBandsVisual abv;
    Intro it;
    //SquareVisual sp;
    Timer4Names tn; 
    MembersNameDrop mn;


    public void settings()
    {
        size(500, 500, P2D);
        //println("CWD: " + System.getProperty("user.dir"));
    }

    public void setup()
    {
        colorMode(HSB);
        startMinim();
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

        //scene 1
        //it = new Intro(this);
        //it.render();

        //scene 2
        //wv = new WavesVisual(this);
        //wv.render();

        //scene3
        //mn = new MembersNameDrop(this);
        //abv = new AudioBandsVisual(this);  
        //mn.render();
        //abv.render();

        //scene4
        //wf = new WaveForm(this);
        //wf.render();

        //scene5
        //cv = new CirclesVisual(this);
        //cv.render();

        //sp = new SpinningSquaresVisual(this);
        //sp.render();
    }

    //want to do a class with the names of the members, so that when a user presses a key, their names will show up on the screen. also thinking of doing their names with the colours they like
    
}    