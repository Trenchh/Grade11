/*
 * Name: Kuwait Flag
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

//Green rectangle
noStroke();
fill(0, 173, 79);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight - 250);

//Red rectangle
noStroke();
fill(255, 0, 0);
rect(boxXLocation, boxYLocation + 250, boxWidth, boxHeight - 250);

//White rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation + 170, boxWidth, boxHeight - 330);

//Black trapezoid
noStroke();
fill(0, 0, 0);
quad(boxXLocation, boxYLocation, boxXLocation + 225, boxYLocation + 170, boxXLocation + 225, boxYLocation + 340, boxXLocation, boxYLocation + 500);

