package c18387973;

import processing.core.*;

public class CirclesVisual {
    MyVisual mv;
    
    public CirclesVisual(MyVisual mv)
    {
        this.mv = mv;
    }

    float angle = 0;

    public void render()
    {
        //this is the flower visual inside the shape, i used rose mathematics to help create the shape
        float k = 7;
        mv.translate(mv.width /2 , mv.height/2);
        mv.beginShape();
        mv.stroke(138, 43, 226); //was meant to turn the flower purple, but it didn't work
        mv.noFill();
        mv.strokeWeight(3);
        for (float a = 0; a< PConstants.TWO_PI; a += 0.1) {//polar to cartesian transformation
            float r = 100 * MyVisual.cos(k * a);
            float x = r * MyVisual.cos(a);
            float y = r* MyVisual.sin(a);
            mv.circle(x, y, r );
            angle++;
        }
        mv.endShape(PConstants.CLOSE);
    }

    //displays the shapes
    public void display()
    {
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.rotate(angle); //rotating the shapes
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255),  255, 255);
            mv.fill(0);

            //shapes, that make random sizes of the shape, plus with the rotate, it helps to rotate the shape
            mv.ellipse(600 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.rect(500 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.ellipse(430 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.rect(330 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.ellipse(260 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.rect(150 + angle,170,mv.random(15,35), mv.random(15,45));
            mv.ellipse(50 + angle,170,mv.random(15,35), mv.random(15,45));
        }
    }
}