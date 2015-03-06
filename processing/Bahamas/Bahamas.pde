/*
 * Name: Bahamas Flag
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

//Blue rectangle
noStroke();
fill(0, 136, 175);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight);

//Yellow rectangle
noStroke();
fill(241, 250, 13);
rect(boxXLocation, boxYLocation + 175, boxWidth, boxHeight - 350);

//Triangle
noStroke();
fill(0,0,0);
triangle(boxXLocation, boxYLocation, boxXLocation + 325, boxYLocation + 250, boxXLocation, boxYLocation + 500);

