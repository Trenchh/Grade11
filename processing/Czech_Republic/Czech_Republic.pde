/*
 * Name: Czech Republic Flag
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

//White rectangle
noStroke();
fill(250, 250, 250);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight - 250);

//Red rectangle
noStroke();
fill(255, 0, 0);
rect(boxXLocation, boxYLocation + 250, boxWidth, boxHeight - 250);

//Blue triangle
noStroke();
fill(0, 85, 173);
triangle(boxXLocation, boxYLocation, boxXLocation + 400, boxYLocation + 250, boxXLocation, boxYLocation + 500);

