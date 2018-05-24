float yPos = 0.0;
float xPos = 0.0;

float xDirection = 1.0;
float yDirection = 1.0;
float x = 1000;

void setup() {
  size(1366, 768);
}

void draw() {
  background(#cc9900);
  //grid row 1
  for (int i = 50; i <= 866; i += 136) {
    fill(#996633);
    rect(i, 50, 136, 136);
  }
  //grid row 2
  for (int i = 50; i <= 866; i += 136) {
    fill(#996633);
    rect(i, 186, 136, 136);
  }  
  //grid row 3
  for (int i = 50; i <= 866; i += 136) {
    fill(#996633);
    rect(i, 322, 136, 136);
  }  
  //grid row 4
  for (int i = 50; i <= 866; i += 136) {
    fill(#996633);
    rect(i, 458, 136, 136);
  }  
  //grid row 5
  for (int i = 50; i <= 866; i += 136) {
    fill(#996633);
    rect(i, 594, 136, 136);
  }
  //panel
  fill(#996633);
  rect(1066, 0, 300, 768);
  
 //bad man  
   
   println("yPos: " + yPos + " xPos: " + xPos + " width: " + width + " height: " + height);
  
  text(xPos + ", " + yPos, xPos, yPos - 10); 
  ellipse(xPos, yPos, 20, 20);
  float yBoundaryCheck = 0;
  if(yDirection == -1) {
    yBoundaryCheck = yPos;
  } else {
    yBoundaryCheck = yPos + 20;
  }
  
  if(yBoundaryCheck >= height) {
    yDirection = -1;
  } else if(yBoundaryCheck <= 0) {
    yDirection = 1;
  }  

  float xBoundaryCheck = 0;
  if(xDirection == -1) {
    xBoundaryCheck = xPos;
  } else {
    xBoundaryCheck = xPos + 20;
  }

  if(xBoundaryCheck >= width) {
    xDirection = -1;
  } else if(xBoundaryCheck <= 0) {
    xDirection = 1;
  }  
  
  yPos += yDirection;
  xPos += xDirection;
  
  
  //bads
  noStroke();
  fill(#D8D78F);
  rect(x,50,50,50);
  x= x-1;
  
}
 
