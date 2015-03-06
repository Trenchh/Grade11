/*
 * Name: Seychelles Flag
 * Date: March 5th, 2015
 * Version: v0.2
 * Author: Ryan Protheroe
*/

final int boxXLocation = (150);
final int boxYLocation = (125);

//Window Size
size(1100, 800);

//Blue triangle
noStroke();
fill(2, 47, 160);
triangle(boxXLocation, boxYLocation, boxXLocation + 300, boxYLocation, boxXLocation, boxYLocation + 500);

//Yellow triangle
noStroke();
fill(255, 218, 95);
triangle(boxXLocation + 300, boxYLocation, boxXLocation + 600, boxYLocation, boxXLocation, boxYLocation + 500);

//Red trapezoid
noStroke();
fill(232, 7, 1);
quad(boxXLocation + 600, boxYLocation, boxXLocation + 850, boxYLocation, boxXLocation + 850, boxYLocation + 175, boxXLocation, boxYLocation + 500);

//White triangle
noStroke();
fill(255, 255, 255);
triangle(boxXLocation + 850, boxYLocation + 175, boxXLocation + 850, boxYLocation + 350, boxXLocation, boxYLocation + 500);

//Green triangle
noStroke();
fill(39, 144, 59);
triangle(boxXLocation + 850, boxYLocation + 350, boxXLocation + 850, boxYLocation + 500, boxXLocation, boxYLocation + 500);

