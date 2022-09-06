# Design-and-Analysis-of-Algorithm
<h2> Assignment 1 </h2>

Name : Anushka Shukla <br>
Sec  : 5-A <br>
Roll : 03 <br>

<hr>

<h3> Problem Statement : <u> Possible Maximum Sum of Three Stacks:</u> (Queue Implementation) </h3>

Given : <br>
  Three stacks of the positive numbers. <br>
Find : <br>
  Possible equal maximum sum of the stacks. <br>
Constraint : <br>
  Removal is permitted from top of stack. <br>

Implementation: <br>
Using queue.<br>
<ul>
<li> 1st value of input will be front of the queue (analogous to Top of Stack) </li>
<li> then values will be added to the rear of the queue </li>
</ul>

Code 1 : Implementation using Arrays<br>
Code 2 : Implementation using inbuilt Queue Interface in Java<br>



<h3>Algorithm :</h3>
      - Take input for all 3 stacks in a queue, calculate and store sum of all 3 queue.<br>
      - Check if sum of all 3 queue is equal, return the sum.<br>
      - Otherwise, pop the front element of queue having maximum sum, and update sum for it.<br>
      - Repeat above steps, until any 1 of the queue becomes empty, then Possible maximum sum is 0. Return 0. Exit.<br>



<h2> TEST CASES </h2>

INPUT : 

Stack 1 : 8 5 3 <br>
Stack 2 : 6 9 4 2 2 <br>
Stack 3 : 3 2 1 2 <br>
<br>

OUTUT <br>
Possible Equal Maximum Sum : 8<br>

