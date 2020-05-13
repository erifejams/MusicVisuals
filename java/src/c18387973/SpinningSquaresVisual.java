package c18387973;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class SpinningSquaresVisual {
    MyVisual mv;

    public SpinningSquaresVisual(MyVisual mv) {
        this.mv = mv;
    }

    public void render()
    {
        mv.fill(255);  // Set fill to white
        mv.rect(710, 650, 330, 430);  

        mv.fill(100);  // Set fill to gray
        mv.rect(350, 250, 300, 330); 
    }

}