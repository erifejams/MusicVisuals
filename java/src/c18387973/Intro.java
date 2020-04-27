package c18387973;

//import processing.core.*;

public class Intro
{
    MyVisual mv;

    public Intro(MyVisual mv)
    {
        this.mv = mv;
    }

    public void render()
    {
        mv.fill(102, 0, 51);
        mv.textSize(50);
        mv.text("Dionysus (BTS)", 100, 170);
        mv.text("(By EJ) ",180,370);
    }
}