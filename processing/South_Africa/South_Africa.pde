/*
 * Name: South Africa Flag
 * Date: March 3rd, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
*/

final int boxWidth  = (800);
final int boxXLocation = (150);

//Window Size
size(1100, 800);

//Red rectangle
noStroke();
fill(245, 17, 17);
rect(boxXLocation, 125 , boxWidth, 250 );

//Blue rectangle
noStroke();
fill(17, 68, 245);
rect(boxXLocation, 375 , boxWidth, 250 );

//White rectangle
noStroke();
fill(255, 255, 255);
rect(boxXLocation, 290, boxWidth, 170 );

//White trapezoid
noStroke();
fill(255, 255, 0);
quad(boxXLocation + 150, 125, 550, 290, 550, 460, boxXLocation + 150, 625 );

//White recatngle to fill back of trap
noStroke();
fill(255, 255, 0);
rect(boxXLocation, 125, boxWidth - 300, 50);

