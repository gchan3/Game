PImage menu;
int stage;
void setup(){
  stage = 1;
  size(1366,768);
  background(255);
  frameRate(60);
  menu = loadImage("menu.png");
  
}

void draw(){
  if(stage == 1){
    menu();
  textSize(70);
  text("PLANT CLICKER", width/2 - 260, height/2 - 100);
  textSize(30);
text("press anykey to start", width/2 - 160, height/2 + 100);
  noStroke();
  if(keyPressed == true){
    stage = 2;
  }

}
if(stage == 2){
  //put code here i think
}
}


void menu(){
  stage = 1;
 image(menu , 0, 0, 1366, 768);
}
