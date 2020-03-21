void setup() {
  size(600, 600);
  PImage face = loadImage("face.png");
  image(face, 0, 0);
  
}
void draw() {
  fill(255, 30, 20);
  ellipse(55, 90, 40, 40);
  fill(#000000);
  ellipse(55, 90, 20, 20);
  fill(255,30,20);
  ellipse(135, 75, 40, 40);
  fill(#000000);
  ellipse(135, 75, 20, 20);
  
  if(mouseX > 55-25 && mouseX < 55+35){if(mouseY > 80-10 && mouseY < 80+35){
    fill(#ffffff);
    ellipse(55, 90, 20, 20);
    ellipse(135, 75, 20, 20);
  }
  }
  if(mouseX > 100-25 && mouseX < 100+35){if(mouseY > 85-40 && mouseY < 85+35){
    fill(#ffffff);
    ellipse(55, 90, 20, 20);
    ellipse(135, 75, 20, 20);
  }
  }
  
}
