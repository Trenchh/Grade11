/*
 * Name: Kuwait Flag
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

//Green rectangle
noStroke();
fill(0, 173, 79);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight/2);

//Red rectangle
noStroke();
fill(255, 0, 0);
rect(boxXLocation, boxYLocation + boxHeight/2, boxWidth, boxHeight/2);

//White rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation + boxHeight * .34, boxWidth, boxHeight * .34);

//Black trapezoid
noStroke();
fill(0, 0, 0);
quad(boxXLocation, boxYLocation, boxXLocation + boxWidth * 0.28125, boxYLocation + boxHeight * .34,  boxXLocation + boxWidth * 0.28125, boxYLocation + boxHeight * 0.68, boxXLocation, boxYLocation + boxHeight);

