float buttonRadius;

int buttonColor, buttonX, buttonY, score, cookies, textColor, coins, cgps;
int autoClickerCost = 15;
int autoClickerOwned = 0;
int autoClickerColor = 255;
int CPS = 0;

boolean coinUpgrade = false;

void setup() {
  size(1366, 768);
  textColor = color(#FFFFFF);
  buttonColor = color(#74562C);
  buttonX = width / 2 - 250 + 25;
  buttonY = height / 2;
  buttonRadius = 250;
  cgps = 5;
}

void draw() {
  background(#00B2FF);
  fill(buttonColor);
  ellipse(buttonX, buttonY, buttonRadius*2, buttonRadius*2);
  fill(textColor);
  textSize(32);
  text(score, 700, 50); 
 
  println(mouseX, mouseY);
  
  //upgrade panel
  fill(#787878);
  rect(866, -1, 500, 770);
  fill(textColor);
  textSize(40);
  text("Coins: " + coins, 872, 50);
  
  //upgrade
  if(score % 25 == 0 && score > 0) {
  textSize(30);
  text("Upgrade", 338, 600);
  
  //CPS
  fill(#FFFFFF);
  textSize(25);
  text("CPS: ", 100, 100);
  cookies = cookies + CPS * 1 / 60;
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
    buttonColor = color(#74562C);
    score += 1;
    buttonRadius = buttonRadius - 62.5;
 
    if (buttonRadius <= 0) {
      buttonRadius = buttonRadius + 250;
      coins += cgps;
    }
  }
}

//when button is released
void mouseReleased() {
  buttonColor = color(#74562C);
}

void mouseClicked() {
     
}
