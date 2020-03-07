
void setup() {
    size(1000, 1000);  
}
void draw() {
    fill(33,44,55);
    ellipse(500, 500, 400, 400);
    PImage pepperoni = loadImage("pep.png");
    image(pepperoni, 2, 2);
    pepperoni.resize(10, 10);
    
}
