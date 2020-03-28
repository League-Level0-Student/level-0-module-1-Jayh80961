PFont f;
void setup(){
    size(400,400);
    f = createFont("Arial",16,true);

}

void draw(){
fill(30,50,100); 
textSize(30);
text("ice cream", 100, 50);
text("ice cream", 100, 100);
text("ice cream", 100, 150);
fill(#FFE708);
textSize(50);
text("banana", 100, 200);
}
