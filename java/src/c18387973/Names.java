//using these timers, so that the members name show up depending of the amount of time i put for the timer
package c18387973;

import processing.core.*;

//this is inheriting from waves visuals
class Names extends WavesVisual
{
    public Names(MyVisual mv) {
		super(mv);
	}


    public void render() {
    
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.strokeWeight(1);
            mv.textSize(10);
            //mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255),  255, 255);
            //mv.fill(PApplet.map(i, 0, mv.getAudioBuffer().get(i), 0, 255),  255*mv.getAudioBuffer().get(i), 255*mv.getAudioBuffer().get(i));
            mv.fill(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255*mv.getAudioBuffer().get(i)),  255, 255);
            mv.text("Kim Namjoon",110, 50);
            mv.text("Kim Seokjin",210, 150);
            mv.text("Min Yoongi",310, 250);
            mv.text("Jung Hoseok",400 , 350);
            mv.text("Park Jimin", 500,450);
            mv.text("Kim Taehyung",600 , 550);
            mv.text("Jeon Jungkook",700 , 650);

            mv.text("Kim Namjoon",1200, 50);
            mv.text("Kim Seokjin",1120, 150);
            mv.text("Min Yoongi",1050, 250);
            mv.text("Jung Hoseok",970 , 350);
            mv.text("Park Jimin", 900,450);
            mv.text("Kim Taehyung",800 , 550);
        }
        
        
    }
}