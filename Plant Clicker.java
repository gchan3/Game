

int buttonColor, buttonX, buttonY, buttonRadius, score, cookies;
int autoClickerCost = 15;
int autoClickerOwned = 0;
int autoClickerColor = 255;
int CPS = 0;
void setup() {
  size(1366, 768);
  buttonColor = color(255, 0, 0);
  buttonX = width/2;
  buttonY = height/2;
  buttonRadius = 100;
}

void draw() {
  background(255);
  fill(buttonColor);
  ellipse(buttonX, buttonY, buttonRadius*2, buttonRadius*2);
  textSize(32);
  text(score, 700,50); 
 
   println(mouseX, mouseY);
  //upgrade
  if(score>=25){
  textSize(30);
  text("Upgrade", 338, 600);
  
  //CPS
  fill(#8A84E2);
  textSize(25);
  text("CPS: ", 100, 100);
  cookies = cookies + CPS * 1/60;
  CPS = 100 ;
  
  //auto clicker
  fill(autoClickerColor);
  rect(20, 50, 250, 75);
  fill(0);
  }
}

//when button is pushed down
void mousePressed() {
  float d = dist(mouseX, mouseY, buttonX, buttonY);
  
  if (d <= buttonRadius) {  
    buttonColor = color(255,0, 0);
    buttonRadius = buttonRadius +20;
    score++;
  }
}

//when button is released
void mouseReleased() {
  buttonColor = color(255, 0, 0);
  buttonRadius = buttonRadius - 20;
  
}


//upgrades

  
  
