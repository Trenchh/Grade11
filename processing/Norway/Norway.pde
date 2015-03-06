/*
 * Name: Norway Flag
 * Date: March 5th, 2015
 * Version: v0.2
 * Author: Ryan Protheroe
*/

final int boxWidth  = (800);
final int boxHeight = (500);
int boxXLocation = (150);
int boxYLocation = (125);

//Window Size
size(1100, 800);

//Red rectangle
noStroke();
fill(240, 34, 34);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight);

//Horizontal white rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation + 190, boxWidth, boxHeight - 380);

//Vertical white rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation + 200, boxYLocation, 120, boxHeight);

//Horizontal blue rectangle
noStroke();
fill(15, 43, 149);
rect(boxXLocation, boxYLocation + 220, boxWidth, boxHeight - 440);

//Vertical blue rectangle
noStroke();
fill(15, 43, 149);
rect(boxXLocation + 230, boxYLocation, boxWidth - 740, boxHeight);
