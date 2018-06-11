float buttonRadius;

int buttonColor, buttonX, buttonY, coinUpgrade1X, coinUpgrade1Y, score, cookies, textColor, coins, cgps;
int autoClickerCost = 15;
int autoClickerOwned = 0;
int autoClickerColor = 255;
int CPS = 0;

boolean coinUpgrade1, coinUpgrade2, coinUpgrade3, coinUpgrade4;

void setup() {
  size(1366, 768);
  textColor = color(#FFFFFF);
  buttonColor = color(#74562C);
  buttonX = width / 2 - 500;
  buttonY = height / 2;
  buttonRadius = 150;
  coinUpgrade1X = 275;
  coinUpgrade1Y = 100;
  coinUpgrade1 = false;
  coinUpgrade2 = false;
  coinUpgrade3 = false;
  coinUpgrade4 = false;
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
  fill(#CE7E06);
  rect(1066, -1, 300, 770);
  fill(textColor);
  textSize(40);
  text("Suns: " + coins, 1080, 50);
  textSize(20);
  text("Upgrades", 1080, 80);
  fill(#95723D);
  rect(1076, 100, 275, 100);
  
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
    buttonRadius = buttonRadius - 37.5;
 
    if (buttonRadius == 0) {
      buttonRadius = buttonRadius + 150;
      coins += cgps;
    }
  }
}

//when button is released
void mouseReleased() {
  buttonColor = color(#74562C);
}

void mouseClicked() {
  float a = dist(mouseX, mouseY, coinUpgrade1X, coinUpgrade1Y);
  
  
}
