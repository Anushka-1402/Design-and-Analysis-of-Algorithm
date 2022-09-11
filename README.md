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
      - If any of the queue becomes empty, then Possible maximum sum is 0. Return 0.<br>
      - Otherwise, pop the front element of queue having maximum sum, and update sum for it.<br>
      - Repeat above steps, until sum of all 3 queue gets equal or any of the queue becomes empty. Exit.<br>

<hr>

<h3> TEST CASES </h3>

<h5> INPUT 1 : </h5> 
Stack 1 : 8 5 3 <br>
Stack 2 : 6 9 4 2 2 <br>
Stack 3 : 3 2 1 2 <br>

<h5> OUTPUT 1 : </h5>
Possible Equal Maximum Sum : 8<br>


<h5> INPUT 2 : </h5>
Stack 1 : 9 7 5 3 1 4 <br>
Stack 2 : 4 3 2 8 1 <br>
Stack 3 : 5 3 2 1 <br>

<h5> OUTPUT 2 : </h5>
Possible Equal Maximum Sum : 0<br>


<h5> INPUT 3 : </h5>
Stack 1 : 9 1 4 2 <br>
Stack 2 : 3 6 1 <br>
Stack 3 : 1 2 5 <br>

<h5> OUTPUT 3 : </h5>
Possible Equal Maximum Sum : 7<br>

