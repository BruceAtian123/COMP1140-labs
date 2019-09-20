# COMP1110 Lab 6

## Before the Lab

* Complete week 9 of your personal journal, commit and push at least 5 minutes prior to the start of your lab.

* Make sure you've covered module [**X01**](https://cs.anu.edu.au/courses/comp1110/lectures/javafx/) (JavaFx)

## Purpose

In this lab you will write a more advanced Java FX program.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## JavaFX Shapes

1.  **Create a new JavaFX class.**

    In the Java package `comp1110.lab6` within your labs repo, create a new Java class, `Board`, which extends `javafx.Application`, that draws a 600x519 pixel window.  Set the window title to "Board".

2.  **Draw a triangle**

    Create an upright 200x200x200 equilateral triangle within the scene you made in step 1. Use the `Polygon` class. Make the vertices centered around (0,0), and afterward use `setLayoutX()` and `setLayoutY()` to recenter the triangle in the middle of your window. Set the fill color of the triangle to `LIGHTGREY`.

    ![alt triangle](assets/lab6a.png)
    
    *Hint: Relative to the center of the triangle, the apex of the triangle should be at (0.0, -86.6), and the right and left corners of the base should be (100.0, 86.6) and (-100.0, 86.6), where 100 = 200/2 and 86.6 = sqrt((200*200)-(100*100))/2;*

3.  **Create an inner class**

    Create an inner class, `Triangle`, which extends `Polygon` and has a constructor with signature `Triangle(double x, double y, double side)`. This should create an upright equilateral triangle, centered at (`x`,` y`), with sides of length `side`.

    Comment out the code you wrote in step 2 (that drew the triangle with Polygon), and replace it with the creation of a `Triangle`. Set the fill color of the new triangle to `LIGHTGREY`. Don't forget to add your triangle to the root group.

4.  **Fill the board with triangles**

    Fill the board with a grid of triangles, storing each triangle in an ArrayList<Triangle>.  You should fit exactly three rows (each 173.2 pixels apart), each row having five triangles (three upright and two inverted). You will need to use the setRotate() method to invert some of the triangles.
    

    
5. **Create a white border**

    Reduce the size of each triangle to 196 pixels, while maintaining the spacing as if they were size 200. This should create the effect of a white border around each triangle.

    ![alt board](assets/lab6b.png)

6. **Finish up**

    Commit your code, push it, close the relevant issue (#17), and show your work
to your tutor.

## Work on your group assignment

Use any spare time to work on your group assignment.

## Extension

**Create a hash program**

Using the lecture code from C03 as a template:
*Read the data from `assets\us_postal_codes.txt`. Each line contains a postal code,town name, state name, state code,county name, latitude and longitude.


Then:
Imagine you are in charge of the entire US postal service, and you have only 50 delivery officers to cover the entire country (40933 zip codes).
You want to give each person a roughly equal amount of work (imagine each post code has the same amount of mail).

Create a hash function that will:
1.Split the work as evenly as possible (imagine that each post code has the same amount of mail)
2.Minimise the travel each person does as much as possible. Imagine that each person starts at any one of their zip codes, and avoid them having to travel across the country.
You can test #1 this by running the program and checking the histogram of results to see if the hash function is even.


How many ways can you do this?






