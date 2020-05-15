//using these timers, so that the members name show up depending of the amount of time i put for the timer
package c18387973;

import processing.core.*;

class Timer4Names
{
    int savedTime;
    int totalTime = 180;

    MyVisual mv;

    public Timer4Names(MyVisual mv)
    {
        this.mv = mv; 
        savedTime = mv.millis();
    }

    public void render() {
        // to calculate how much time has passed
        int passedTime = mv.millis() - savedTime;
        
        if (passedTime == 20) {
            mv.text("members name", 400, 300); //drop a members name, which will be put in a inheritance maybe polymorphism class if i can
        }
    }
}