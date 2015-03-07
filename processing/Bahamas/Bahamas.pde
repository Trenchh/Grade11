/*
 * Name: Bahamas Flag
 * Date: March 6th, 2015
 * Version: v0.3
 * Author: Ryan Protheroe
*/

final int boxWidth  = (800);
final int boxHeight = (500);
int boxXLocation = (150);
int boxYLocation = (150);

//Window Size
size(1100, 800);

//Blue rectangle
noStroke();
fill(0, 136, 175);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight);

//Yellow rectangle
noStroke();
fill(241, 250, 13);
rect(boxXLocation, boxYLocation + boxHeight * 0.33, boxWidth, boxHeight /3);

//Triangle
noStroke();
fill(0,0,0);
triangle(boxXLocation, boxYLocation, boxXLocation + boxWidth * 0.4, boxYLocation + boxHeight/2, boxXLocation, boxYLocation + boxHeight);

