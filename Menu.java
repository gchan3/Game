PImage startscreen;
//int screensizex, screensizey;
void setup(){
  startscreen = loadImage("maxresdefault.jpg");
  fullScreen();
  //screensizex = 1366;
  //screensizey = 768;
}

void draw() {
  image(startscreen, 0, 0, 1366, 768);
}


