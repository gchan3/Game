PImage sun;
PImage panels;

float suns = 0;
float CPS = 0;
int cookieImage;


//Icons

float autoClickerImage;

float grandmaImage;

float factoryImage;

float mineImage;

float labImage;

float portalImage;


//Cookie
float cookieX = 374;
float cookieY = -20;
float cookieW = 400;
float cookieH = 400;

//Auto clicker
float autoClickerCost = 15;
float autoClickerOwned = 0;
float autoClickerColor = 255;

//Grandma
float grandmaCost = 200;
float grandmaOwned = 0;
float grandmaColor = 255;

//Factory
float factoryCost = 1000;
float factoryOwned = 0;
float factoryColor = 255;

//Mine
float mineCost = 2000;
float mineOwned = 0;
float mineColor = 255;

//Lab
float labCost = 50000;
float labOwned = 0;
float labColor = 255;

//Portal
float portalCost = 100000;
float portalOwned = 0;
float portalColor = 255;

//White Hole


void setup() {
  size(1366,768);
  background(255);
  frameRate(60);
  sun = loadImage("sun.png");
  panels = loadImage("panelBackground.png");
//Icons


}


void draw() {
  background(#00A2FF);
  fill(#994C00);
  rect(0, 0, 290, 768);
  fill(0);
  textSize(20);
  text("$" + nf(suns, 0, 2), 20, 30 );
  stroke(1);
  
  noStroke();
    image(sun, cookieX, cookieY, cookieW, cookieH);
  
// CPS calculation.
  fill(0);
  textSize(15);
  text("CPS: " + nf(CPS, 0, 2), 20, 46);
  suns = suns + CPS * 1/60;
  CPS = autoClickerOwned * 1 + grandmaOwned * 5 + factoryOwned * 10 + mineOwned * 25 + labOwned * 50 + portalOwned * 100;
  
//building
  fill(#B5B5B5);
  rect(866, 0, 500, 768);
  fill(#663300);
  rect(880, 240, 475, 100);
  rect(880, 350, 475, 100);
  rect(880, 460, 475, 100);
  rect(880, 570, 475, 100);

//Start items --------------------------------------------------------------------------------------------------\\
//Auto Clicker.
  fill(autoClickerColor);
  rect(20, 50, 250, 75);
  fill(0);
  
  textSize(14);
  text("Buy auto clicker. (1 CPS)", 25, 65);
  text("Price: $" + nf(autoClickerCost, 0, 2), 25, 83);
  text("Auto Clickers Owned:", 25, 100);
  text(autoClickerOwned, 25, 120);
  
  autoClickerCost =  15 * pow(1.07, autoClickerOwned);
  

  
//Grandmas
  fill(grandmaColor);
  rect(20, 130, 250, 75);
  fill(0);
  
  textSize(14);
  text("Buy peashooter seeds.", 25, 145);
  text("Price: $" + nf(grandmaCost, 0, 2), 25, 163);
  text("Grandmas Owned:", 25, 180);
  text(grandmaOwned, 25, 200);
  
  grandmaCost =  200 * pow(1.07, grandmaOwned);
  

  
  //Factory
  fill(factoryColor);
  rect(20, 210, 250, 75);
  fill(0);
  
  textSize(14);
  text("Buy bok choy seeds. ($250 sb)", 25, 225);
  text("Price: $" + nf(factoryCost, 0, 2), 25, 243);
  text("Factories Owned:", 25, 260);
  text(factoryOwned, 25, 280);
  
  factoryCost =  1000 * pow(1.07, factoryOwned);
  


  //Mine
  fill(mineColor);
  rect(20, 290, 250, 75);
  fill(0);
  
  textSize(14);
  text("Buy sunflower seeds. (25 CPS)", 25, 305);
  text("Price: $" + nf(mineCost, 0, 2), 25, 323);
  text("Mines Owned:", 25, 340);
  text(mineOwned, 25, 360);
  
  mineCost =  2000 * pow(1.07, mineOwned);

  
  
  //Cookie Lab
  fill(labColor);
  rect(20, 370, 250, 75);
  fill(0);
  
  textSize(13);
  text("Buy ultra peashooter seeds. (50 CPS)", 25, 385);
  text("Price: $" + nf(labCost, 0, 2), 25, 403);
  text("Cookie Labs Owned:", 25, 420);
  text(labOwned, 25, 440);
  
  labCost =  50000 * pow(1.07, labOwned);
  
  
  
  //Portal
  fill(portalColor);
  rect(20, 450, 250, 75);
  fill(0);
  
  textSize(14);
  text("Buy peasoldier seeds. (100 CPS)", 25, 465);
  text("Price: $" + nf(portalCost, 0, 2), 25, 483);
  text("Portals Owned:", 25, 500);
  text(portalOwned, 25, 520);
  
  portalCost =  100000 * pow(1.07, portalOwned);
  
  //All Highlights
  //(mouseX > 20 && mouseX < 20 + 250 && mouseY > 50 && mouseY < 50 + 75)
  //Auto Clicker
  if(suns < autoClickerCost) {
    autoClickerColor = 200;
  } else if (mouseX < 20 && mouseX > 20 + 250 && mouseY < 50 && mouseY > 50 + 75 && suns >= autoClickerCost) {
    portalColor = 255;
  } else if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 50 && mouseY < 50 + 75 && suns < autoClickerCost) {
    autoClickerColor = 200;
  } else {
    autoClickerColor = 255;
  } 
  if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 50 && mouseY < 50 + 75 && suns >= autoClickerCost) {
    autoClickerColor = 245;
  }
  
  //Grandma
  if(suns < grandmaCost) {
    grandmaColor = 200;
  } else if (mouseX < 20 && mouseX > 20 + 250 && mouseY < 130 && mouseY > 130 + 75 && suns >= grandmaCost) {
    grandmaColor = 255;
  } else if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 130 + 75 && suns < grandmaCost) {
    grandmaColor = 200;
  } else {
    grandmaColor = 255;
  } 
  if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 130 + 75 && suns >= grandmaCost) {
    grandmaColor = 245;
  }
  
  //Factory
  if(suns < factoryCost) {
    factoryColor = 200;
  } else if (mouseX < 20 && mouseX > 20 + 250 && mouseY < 210 && mouseY > 210 + 75 && suns >= factoryCost) {
    factoryColor = 255;
  } else if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 210 && mouseY < 210 + 75 && suns < factoryCost) {
    factoryColor = 200;
  } else {
    factoryColor = 255;
  } 
  if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 210 && mouseY < 210 + 75 && suns >= factoryCost) {
    factoryColor = 245;
  }
  
  //Mine
  if(suns < mineCost) {
    mineColor = 200;
  } else if (mouseX < 20 && mouseX > 20 + 250 && mouseY < 290 && mouseY > 290 + 75 && suns >= mineCost) {
    mineColor = 255;
  } else if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 290 && mouseY < 290 + 75 && suns < mineCost) {
    mineColor = 200;
  } else {
    mineColor = 255;
  } 
  if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 290 && mouseY < 290 + 75 && suns >= mineCost) {
    mineColor = 245;
  }
  
  //Lab
  if(suns < labCost) {
    labColor = 200;
  } else if (mouseX < 20 && mouseX > 20 + 250 && mouseY < 370 && mouseY > 370 + 75 && suns >= labCost) {
    mineColor = 255;
  } else if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 370 && mouseY < 370 + 75 && suns < labCost) {
    labColor = 200;
  } else {
    labColor = 255;
  } 
  if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 370 && mouseY < 370 + 75 && suns >= labCost) {
    labColor = 245;
  }
  
  //Portal
  if(suns < portalCost) {
    portalColor = 200;
  } else if (mouseX < 20 && mouseX > 20 + 250 && mouseY < 450 && mouseY > 450 + 75 && suns >= portalCost) {
    portalColor = 255;
  } else if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 450 && mouseY < 450 + 75 && suns < portalCost) {
    portalColor = 200;
  } else {
    portalColor = 255;
  } 
  if (mouseX > 20 && mouseX < 20 + 250 && mouseY > 450 && mouseY < 450 + 75 && suns >= portalCost) {
    portalColor = 245;
  }
  
  image(panels, 880, 20, 475, 100);
  image(panels, 880, 130, 475, 100);
//End of items --------------------------------------------------------------------------------------------------\\
  
  //Shop Lines
  for(int i = 0; i < 461; i = i + 80) {
    line(200, i + 50, 200, i + 125);
  }
  

  //Icons
 
}


//Click response.
void mousePressed() {
  if(mouseX > cookieX && mouseX < cookieX + cookieW && mouseY > cookieY && mouseY < cookieY + cookieH) {
    cookieX = cookieX - 5;
    cookieY = cookieY - 5;
    cookieH = cookieH + 10;
    cookieW = cookieW + 10;
  }
}


//Space response
void keyPressed () {
     
  }


//Cookie gets larger when you click it.
void mouseReleased() {
  if(mouseX > cookieX && mouseX < cookieX + cookieW && mouseY > cookieY && mouseY < cookieY + cookieH) {
    cookieX = cookieX + 5;
    cookieY = cookieY + 5; 
    cookieH = cookieH - 10; 
    cookieW = cookieW - 10; 
  }
}



//Mouse Clicked.
void mouseClicked() {  
  if(mouseX > cookieX && mouseX < cookieX + cookieW && mouseY > cookieY && mouseY < cookieY + cookieH) {
    suns++;
  }
    // Buy auto clicker.
  if(mouseX > 20 && mouseX < 20 + 250 && mouseY > 50 && mouseY < 50 + 75 && suns >= autoClickerCost) {
    suns = suns - autoClickerCost;
    autoClickerOwned++;
  }
    //Buy grandma.
  if(mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 130 + 75 && suns >= grandmaCost) {
    suns = suns - grandmaCost;
    grandmaOwned++;
  }
    //Buy factory
  if(mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 210 + 75 && suns >= factoryCost) {
    suns = suns - factoryCost;
    factoryOwned++;
  }
    //Buy mine
  if(mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 290 + 75 && suns >= mineCost) {
    suns = suns - mineCost;
    mineOwned++;
  }
    //Buy Lab
  if(mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 370 + 75 && suns >= labCost) {
    suns = suns - labCost;
    labOwned++;  
  }
    //Buy Portal
  if(mouseX > 20 && mouseX < 20 + 250 && mouseY > 130 && mouseY < 450 + 75 && suns >= portalCost) {
    suns = suns - portalCost;
    portalOwned++;
  }
}


void drawCookie() {
  noStroke();
    image(sun, cookieX, cookieY, cookieW, cookieH);
}

void drawPanel() {
  noStroke();
    image(panels, 880, 20, 475, 100);
}
