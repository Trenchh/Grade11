/*
 * Name: Botswana Flag
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
fill(6,105,201);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight);

//White rectangle
noStroke();
fill(255,255,255);
rect(boxXLocation, boxYLocation + boxHeight * 0.35, boxWidth, boxHeight * .3);

//Black rectangle
noStroke();
fill(0,0,0);
rect(boxXLocation, boxYLocation + boxHeight * 0.4, boxWidth, boxHeight * 0.2);

