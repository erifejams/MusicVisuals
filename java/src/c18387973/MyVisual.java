package c18387973;

//import ie.tudublin.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
//import processing.core.*;
   
public class MyVisual extends Visual
{   
    
    //classes
    WaveForm wf;
    WavesVisual wv;
    AudioBandsVisual abv;
    Intro it;
    CirclesVisual cv;
    Names n; 
    MembersNameDrop mn;
    SquareVisual sv;
    
    //polymorphism 
    //myvision array
    MyVision[] myvision = new MyVision[10];

    public void settings()
    {
        size(500, 500, P2D);
    }

    int j= 0;
    public void setup()
    {
        colorMode(HSB);
        startMinim();
        // Call loadAudio to load an audio file to process 
        loadAudio("Dionysus.mp3");   
        getAudioPlayer().play();
        setFrameSize(256);

        //tried doing the polymorphism, i couldn't do it because I'm using the keypressed in the draw, so i didn't
        //know how to loop it around since i was getting the user input from certain keys, so i didn't know my way around
        //that, but here is the code, if I was able to include the polymorphism
        /*
        //initializing the array
        myvision[1] = new Intro(this);
        myvision[2] = new WavesVisual(this);
        myvision[3]= new MembersNameDrop(this);
        myvision[4]= new AudioBandsVisual(this); 
        myvision[5]= new WaveForm(this);
        myvision[6] = new CirclesVisual(this);

        //loop through the array
        for(MyVision v : myvision){
            v.render();
            v.display();
        }
        */
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

        /* here's the remaining code for the polymorphism, here is what i would include, if i wasn't doing the keypress
        thing in the draw
        for (int i=0;i< myvision.length ; i++)
        {
            myvision[i].render();
            myvision[i].display();
        }
        */
    
        if(key == CODED)
        {
            if (keyCode == UP)
            {
                //scene 1
                it = new Intro(this);
                it.render();
                
            }
            else
            if(keyCode == DOWN)
            {
                //scene 2
                wv = new WavesVisual(this);
                n = new Names(this);
                wv.render();
                n.render();
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
            
        }

        if(key == ENTER)
        {
            //scene5
            cv = new CirclesVisual(this);
            cv.render();
            cv.display();
        }

        if (key == TAB)
        {
            sv = new SquareVisual(this);
            sv.render();
        }
        
    }
}  
 