//VARIABLES
int xLocation = 50;
int yLocation = 50;
int pacSize = 90;
int eyeSize = 10;

//YELLOW CIRCLE
fill(254,255,36);
arc(xLocation, yLocation, pacSize, pacSize, radians(210), radians(360));
arc(xLocation, yLocation, pacSize, pacSize, radians(0), radians(150));

//EYE
fill(0,0,0);
ellipse(xLocation * .7, yLocation * .5, eyeSize, eyeSize);
