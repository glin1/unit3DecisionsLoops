Introduction

The goal of this lab is to apply your understanding of decision and loop
	structures to implement a complex algorithm within the context of an
	unfamiliar and significant software framework (GridWorld). In addition,
	you will implement a unit test for your program using the JUnit framework
	and create documentation for your program using JavaDoc.


Requirements

Write a program that plays Conway’s Game of Life. Conway’s Game of Life is a
	cellular automaton. From Wikipedia:

The universe of the Game of Life is an infinite two-dimensional orthogonal
	grid of square cells, each of which is in one of two possible states,
	alive or dead. Every cell interacts with its eight neighbours, which are
	the cells that are horizontally, vertically, or diagonally adjacent. At
	each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by
	underpopulation.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overcrowding.
* Any dead cell with exactly three live neighbours becomes a live cell, as if
	by reproduction.
* The initial pattern constitutes the seed of the system. The first
	generation is created by applying the above rules simultaneously to every
	cell in the seed—births and deaths occur simultaneously, and the discrete
	moment at which this happens is sometimes called a tick (in other words,
	each generation is a pure function of the preceding one). The rules
	continue to be applied repeatedly to create further generations.


Nonfunctional Requirements:

* the program must be implemented in Java and utilize the GridWorld platform
* I recommend not use GridWorld’s execution engine to produce subsequent
	generations. It will be easier to implement the unit test if you directly
	produce and display subsequent generations.


Artifacts to Produce:

* Requirements Document: Many functional and nonfunctional requirements needs
	to be defined. You must define additional requirements that are
	reasonable and document them in a requirements document. I must review
	your requirements document before you start the design document or test
	plan. You may change the requirements document throughout development.
* Design Document: You must do some design activity before starting
	implementation. This may consist of a flow cart, pseudocode, or other
	design artifact. I must review your design document before you start
	implementing code. You may change your design document throughout
	development.
* Test Plan: You must create a test plan with specific test cases (at least
	two) before starting implementation. I must review your test plan before
	you start implementing your test class. You may change your test plan
	throughout development. The provided code in GitHub is an example of
	implementing an initial test case.
* GameOfLifeTest Test Class: JUnit-compatible test class that implements the
	test plan.
* GameOfLife class: You must produce a working class the meets the
	requirements and is verified and validated by your test plan.
* Reflection Document: This is a significant and challenging lab. Please
	reflect on this experience and share your feedback with me. What did you
	like or dislike and why? What was surprising or unexpected? What did you
	learn? What questions do you still have? What advice would you offer next
	year's students?
	
	Game of life reflection: This lab is very challenging and confusing. 
	I started the lab without knowing everything about the grid world. 
	So I had to read thedocumentation to get a sense of understanding of
	how the grid world works. I did not use the get location method, instead,
	I wrote out all 8 positions adjacent to a cell, and test which of them
	to determine how many empty spaces (dead cells) there is around. I also
	had some problem with the main method, but I asked Allen and Mr.Schmit
	and my classmates to help me out. It is a very hard lab, but also a good
	experience. I think I now have a better understanding of the grid world 
	as well as for the nested loops. Also, for the test class, I studied the
	way Mr.Schmit created the initial pattern and created my own.     
	
	Design Document: Creating a nested for loop to test the 8 adjacent positions of 
	a space to determine how many dead cells (represented by empty spaces) there is 
	around one cell in a defined chart. The variable "count" represents the number 
	of dead cells. This variable will be reset to 0 every time the loop runs.If 
	count=5, then a new cell is drawn to the new graph. And if count=6 and the space 
	possesses a alive cell, then draw the cell to the new graph. The variable "a" is 
	made to ensure all if statements have a condition to run.
	
	Test plan:  first generation:   X X X
					X   X
					X   X
    		    
    		    second generation:    X
    		    			X   X
    		    		      X X   X X


Submission:

* Ensure the following artifacts have been committed to GitHub in addition to your code:
    * requirements document
    * design document (pseudocode, flow charts, etc.)
    * test plan (with specific test cases)
    * HTML documentation generated by JavaDoc
    * reflection document
* Submit a pull request in GitHub and submit a link to the request with this assignment
