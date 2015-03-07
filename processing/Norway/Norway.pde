/*
 * Name: Norway Flag
 * Date: March 6th, 2015
 * Version: v0.3
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
rect(boxXLocation, boxYLocation + boxHeight * 0.38, boxWidth, boxHeight * .24);

//Vertical white rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation + boxWidth * .25, boxYLocation, boxWidth * .15, boxHeight);

//Horizontal blue rectangle
noStroke();
fill(15, 43, 149);
rect(boxXLocation, boxYLocation + boxHeight * .44, boxWidth, boxHeight * .12);

//Vertical blue rectangle
noStroke();
fill(15, 43, 149);
rect(boxXLocation + boxWidth * 0.2875, boxYLocation, boxWidth * .075, boxHeight);
