package c18387973;

import ie.tudublin.*;
   
public class MyVisual extends Visual
{    
    //WaveForm wf;
    WavesVisual wf;
    AudioBandsVisual abv;
    //SpinningCirclesVisual sp;

    public void settings()
    {
        size(512, 500, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        colorMode(HSB);
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Dionysus.mp3");   
    
        // Call this instead to read audio from the microphone
        //startListening(); 

        //wf = new WaveForm(this);
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
        calculateAverageAmplitude();
        wf = new WavesVisual(this);
        background(0);
        noFill();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        ellipse(width / 2, height / 2, 100, 100);
        fill(100,50,200);
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255),255, 255);
        ellipse(width / 2, height / 2, 200, 200);
        fill(255,0,200);
        ellipse(width / 2, height / 2, 300, 300);

        fill(255,255,255);
        ellipse(width , height , 200, 200);

        fill(255,255,255);
        ellipse(width , height , 450, 450);
        //ellipse(width / 2, height / 2, 500, 500);
        //ellipse(width / 2, height / 2, 600, 600);
        //ellipse(width / 2, height / 2, 700, 700);

        /*
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        */
        // Call this is you want to use frequency bands
        //calculateFrequencyBands(); 
       


        // Call this is you want to get the average amplitude
        //calculateAverageAmplitude();        
        //wf.render();
        //abv.render();
        wf.render();
        //sp.render();
    }

}    