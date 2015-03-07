/*
 * Name: Seychelles Flag
 * Date: March 6th, 2015
 * Version: v0.3
 * Author: Ryan Protheroe
*/

final int boxWidth  = (800);
final int boxHeight = (500);
int boxXLocation = (125);
int boxYLocation = (150);

//Window Size
size(1100, 800);

//Blue triangle
noStroke();
fill(2, 47, 160);
triangle(boxXLocation, boxYLocation, boxXLocation + boxWidth * .375, boxYLocation, boxXLocation, boxYLocation + boxHeight);

//Yellow triangle
noStroke();
fill(255, 218, 95);
triangle(boxXLocation + boxWidth * .375, boxYLocation, boxXLocation + boxWidth * .75, boxYLocation, boxXLocation, boxYLocation + boxHeight);

//Red trapezoid
noStroke();
fill(232, 7, 1);
quad(boxXLocation + boxWidth * .75, boxYLocation, boxXLocation + boxWidth * 1.0625, boxYLocation, boxXLocation + boxWidth * 1.0625,  boxYLocation + boxHeight * 0.35, boxXLocation, boxYLocation + boxHeight);

//White triangle
noStroke();
fill(255, 255, 255);
triangle(boxXLocation + boxWidth * 1.0625, boxYLocation + boxHeight * 0.35, boxXLocation + boxWidth * 1.0625, boxYLocation + boxHeight * 0.7, boxXLocation, boxYLocation + boxHeight);

//Green triangle
noStroke();
fill(39, 144, 59);
triangle(boxXLocation + boxWidth * 1.0625, boxYLocation + boxHeight * 0.7, boxXLocation + boxWidth * 1.0625, boxYLocation + boxHeight, boxXLocation, boxYLocation + boxHeight);

