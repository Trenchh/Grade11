/*
 * Name: South Africa Flag
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

//Red rectangle
noStroke();
fill(245, 17, 17);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight/2);

//Blue rectangle
noStroke();
fill(17, 68, 245);
rect(boxXLocation, boxYLocation + boxHeight * .5, boxWidth, boxHeight/2);

//White rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation + boxHeight * .33, boxWidth, boxHeight * 0.34);

//White trapezoid
noStroke();
fill(255, 255, 255);
quad(boxXLocation + boxWidth * .1875, boxYLocation, boxXLocation + boxWidth * .5, boxYLocation + boxHeight * .33, boxXLocation + boxWidth * .5, boxYLocation + boxHeight * .67, boxXLocation + boxWidth * .1875, boxYLocation  + boxHeight);

//White rectangle to fill back of trap
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation, boxWidth * .189, boxHeight);

//Green rectangle
noStroke();
fill(5, 167, 60);
rect(boxXLocation, boxYLocation + boxHeight * .38, boxWidth, boxHeight * .24);

//Green trapezoid
noStroke();
fill(5, 167, 60);
quad(boxXLocation + boxWidth * .125, boxYLocation, boxXLocation + boxWidth * .48125, boxYLocation + boxHeight * .38, boxXLocation + boxWidth * .48125, boxYLocation + boxHeight * .62, boxXLocation + boxWidth * .125, boxYLocation + boxHeight);

//Green rectangle to fill back of trap
noStroke();
fill(5, 167, 60);
rect(boxXLocation - boxWidth * .01875, boxYLocation, boxWidth * .1458, boxHeight);

//Yellow triangle
fill(237, 193, 14);
triangle(boxXLocation - boxWidth * .01875, boxYLocation + boxHeight * .1, boxXLocation + boxWidth * .375, boxYLocation + boxHeight * .5, boxXLocation - boxWidth * .01875, boxYLocation + boxHeight * .9); 

//Black triangle
fill(0, 0, 0);
triangle(boxXLocation - boxWidth * .01875, boxYLocation + boxHeight * .19, boxXLocation + boxWidth * .3, boxYLocation + boxHeight * .5, boxXLocation - boxWidth * .01875, boxYLocation + boxHeight * .81); 

