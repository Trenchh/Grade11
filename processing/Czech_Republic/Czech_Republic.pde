/*
 * Name: Czech Republic Flag
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

//White rectangle
noStroke();
fill(250, 250, 250);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight * 0.5);

//Red rectangle
noStroke();
fill(255, 0, 0);
rect(boxXLocation, boxYLocation + boxHeight/2, boxWidth, boxHeight * 0.5);

//Blue triangle
noStroke();
fill(0, 85, 173);
triangle(boxXLocation, boxYLocation, boxWidth * .5 + boxXLocation, boxYLocation + boxHeight/2, boxXLocation, boxYLocation + boxHeight);

