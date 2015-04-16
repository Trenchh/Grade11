//VARIABLES
int xLocation = 50;
int yLocation = 50;
int pacSize = 90;
int eyeSize = 10;

//YELLOW CIRCLE
fill(254,255,36);
arc(xLocation, yLocation, pacSize, pacSize, radians(30), radians(330));

//EYE
fill(0,0,0);
ellipse(xLocation * 1.3, yLocation * 0.5, eyeSize, eyeSize);
