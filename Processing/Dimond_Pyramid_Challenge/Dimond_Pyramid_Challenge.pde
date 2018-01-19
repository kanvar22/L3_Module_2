  int BRICK_WIDTH = 30;
  int BRICK_HEIGHT = 12;
  int BRICKS_IN_BASE = 15;
  int screenSizeHeight = 900;
  int screenSizeWidth = 100;
  int startingPosition = 250;
  int startingPositionForNextBrick = 14;
void setup(){
size(1000, 900);
//Layer
for(int i = 0; i < 14; i++){
  BRICKS_IN_BASE = BRICKS_IN_BASE - 1;
  screenSizeHeight = screenSizeHeight - 12;
  startingPosition = startingPosition + BRICK_WIDTH/2;
  startingPositionForNextBrick = startingPosition;
  for(int j = 0; j < BRICKS_IN_BASE ; j++){
   startingPositionForNextBrick = startingPositionForNextBrick + BRICK_WIDTH;
   rect(startingPositionForNextBrick, screenSizeHeight , BRICK_WIDTH, BRICK_HEIGHT);

 }
}
 }
 void draw(){



}