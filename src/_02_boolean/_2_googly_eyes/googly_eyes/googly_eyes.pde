PImage face;
void setup() {
 size(800,600);
  
  face = loadImage("catFace.jpeg");
  face.resize(width,height);
  noStroke();
}
 int minX=343;
 int minY=266;
 int maxX=392;
 int maxY=324;
 int upX=367;
 int upY=266;
 int X=365;
 int Y=295;
void draw() {
background (face);
fill(255,255,255);
  ellipse(460, 425, 70, 70);
  ellipse(365,295, 70,70);
fill(0);
if (mouseX<minX){
  X=minX;}
  else if (mouseX>maxX){
  X=maxX;}
 else{ X=mouseX;}
  
if (mouseY<minY){
  Y=minY;}
  else if (mouseY>maxY){
Y=maxY;}
 else{ Y=mouseY;}
  
  ellipse(X,Y, 10, 10);
  ellipse(X+95, Y+130, 10, 10);
 if(mousePressed)
 {
   println (mouseX+" "+mouseY);}
}
