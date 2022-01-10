import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {

    size(400, 400);
  }

 
  public void setup() {
    background(225);
  }

  public void draw() {

    float colour = 0;
  
    for (int lineX = 0; lineX <= 200; lineX += 1) {
      
      stroke(colour);
      line(lineX, 200, lineX, height);
      colour++;
    }

    stroke(0);
    fill(204, 43, 185);
    for (int circleY = height/12; circleY <= height/2 - height/12; circleY += height/12) {
      for (int circleX = width/2 + width/12; circleX <= width - width/12; circleX += width/12) {
        ellipse(circleX, circleY, 20, 20);
      }
    }

    stroke(0);
    fill(0);
	  for (int line = 20; line <= 180; line += 20) {
      line(line, 0, line, 200);
    }
    for (int line = 20; line <= 200; line += 20) {
      line(0, line, 200, line);
    }

    stroke(0);
    fill(214, 68, 15);

    translate(300, 300);
    for (int i = 0; i < 8; i++) {
     rotate(TWO_PI / 8);
      ellipse(0, -35, 20, 60);
    }

    stroke(11, 125, 49);
    fill(11, 125, 49);
    
    ellipse(0, 0, 35, 35);


  }
  
}