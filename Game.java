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
  

}
