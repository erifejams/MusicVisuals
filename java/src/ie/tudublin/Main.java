package ie.tudublin;

//import example.CubeVisual;
import c18387973.MyVisual;
//import example.RotatingAudioBands;

public class Main
{	

	/*public void startUI()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new CubeVisual());	
	}
	*/
	public void startUI()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new MyVisual());			
	}


	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}