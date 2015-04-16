//VARIABLES
int xLocation = 50;
int yLocation = 50;
int pacSize = 90;
int eyeSize = 10;

//YELLOW CIRCLE
fill(254,255,36);
ellipse(xLocation, yLocation, pacSize, pacSize);

//EYE
fill(0,0,0);
ellipse(xLocation * .7, yLocation * .5, eyeSize, eyeSize);
