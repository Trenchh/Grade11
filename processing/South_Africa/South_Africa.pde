/*
 * Name: South Africa Flag
 * Date: March 5th, 2015
 * Version: v0.1
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
fill(245, 17, 17);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight - 250);

//Blue rectangle
noStroke();
fill(17, 68, 245);
rect(boxXLocation, boxYLocation + 250, boxWidth, boxHeight - 250);

//White rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation + 165, boxWidth, boxHeight - 330);

//White trapezoid
noStroke();
fill(255, 255, 255);
quad(boxXLocation + 150, boxYLocation, boxXLocation + 400, boxYLocation + 165, boxXLocation + 400, boxYLocation + 335, boxXLocation + 150, boxYLocation  + 500);

//White rectangle to fill back of trap
noStroke();
fill(255, 255, 255);
rect(boxXLocation, boxYLocation, boxWidth - 650, boxHeight);

//Green rectangle
noStroke();
fill(5, 167, 60);
rect(boxXLocation, boxYLocation + 190, boxWidth, boxHeight - 380);

//Green trapezoid
noStroke();
fill(5, 167, 60);
quad(boxXLocation + 100, boxYLocation, boxXLocation + 375, boxYLocation + 190, boxXLocation + 375, boxYLocation + 310, boxXLocation + 100, boxYLocation + 500);

//Green rectangle to fill back of trap
noStroke();
fill(5, 167, 60);
rect(boxXLocation - 15, boxYLocation, boxWidth - 685, boxHeight);

//Yellow triangle
fill(237, 193, 14);
triangle(boxXLocation - 15, boxYLocation + 50, boxXLocation + 300, boxYLocation + 250, boxXLocation - 15, boxYLocation + 450); 

//Black triangle
fill(0, 0, 0);
triangle(boxXLocation - 15, boxYLocation + 95, boxXLocation + 240, boxYLocation + 250, boxXLocation - 15, boxYLocation + 405); 

