import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    // This method sets the size of the window
    public void settings() {
        size(400, 400); // Change the values to your desired width and height
    }

    // This method sets the background color and other drawing settings
    public void setup() {
        background(0, 255, 255); // RGB values for the background color
    }

    public void draw(){

        stroke(0,0,0);
        strokeWeight(5);

        fill(100,0,100);
        rect((width / 2) - (200 / 2), (height / 2) - (200 / 2), 200, 200);
        
        stroke(10,10,0);
        strokeWeight(5);
        fill(0,0,150);
        ellipse(300, 350, 100, 100);
        stroke(0,0,90);
        strokeWeight(5);
        fill(0,0,100);
        ellipse(100, 100, 100, 100);

        stroke(0);
        strokeWeight(10);
        line(100, 100, 300, 350);
    }
}
