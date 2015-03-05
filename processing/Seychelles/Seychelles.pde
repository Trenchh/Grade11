/*
 * Name: Seychelles Flag
 * Date: March 5th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
*/

final int boxXLocation = (125);

//Window Size
size(1100, 800);

//Blue triangle
noStroke();
fill(2, 47, 160);
triangle(boxXLocation, 125, boxXLocation + 300, 125, boxXLocation, 625);

//Yellow triangle
noStroke();
fill(255, 218, 95);
triangle(boxXLocation + 300, 125, boxXLocation + 600, 125, boxXLocation, 625);

//Red trapezoid
noStroke();
fill(232, 7, 1);
quad(boxXLocation + 600, 125, boxXLocation + 850, 125, boxXLocation + 850, 300, boxXLocation, 625);

//White triangle
noStroke();
fill(255, 255, 255);
triangle(boxXLocation + 850, 300, boxXLocation + 850, 475, boxXLocation, 625);

//Green triangle
noStroke();
fill(39, 144, 59);
triangle(boxXLocation + 850, 475, boxXLocation + 850, 625, boxXLocation, 625);

