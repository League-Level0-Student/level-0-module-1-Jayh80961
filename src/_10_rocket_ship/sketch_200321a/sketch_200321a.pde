int x = 400; 
int y = 600; 
int z = 0;
PFont f;
void setup() {
    smooth();
    background(0, 0, 40); size(800, 800);
    f = createFont("Arial",16,true);

}

void draw() {
    background(0, 0, 40);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    y = y-1;
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    y = y-1;
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    y = y-1;
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    y = y-1;
    fill(random(255), 0, 0);
    ellipse(x, z + 130, 90, 90);
    z = z+4;
    if(z >240){
        background(0,0,0);
        textSize(30);
        text("And then..... the space ship was never found....", 85, 200);
        textSize(100);
        text("Mwhahaha!!!", 100, 400);
        textSize(20);
        text("(Flickering effects...)", 100, 500);
        ellipse(400,600,150,150);
        fill(100,30,20);
        rect(360,630,85,15);
        ellipse(365,585,20,20);
        ellipse(440,585,20,20);
     if(z>700){
         background(255,255,255);
         textSize(30);
         text("But still the guy in the ship, went to heaven",125,200);
         text("And lived a very happy life there....",160,400);
         textSize(20);
         text("(Behind Scene...)",250,440);
         ellipse(400,600,150,150);
         fill(50,30,20);
         rect(360,630,85,15);
         fill(255,0,0);
         ellipse(365,585,20,20);
         ellipse(440,585,20,20);
       }
    }
}
