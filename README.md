# Design-and-Analysis-of-Algorithm
<h2> Assignment 1 </h2>

Name : Anushka Shukla <br>
Sec  : 5A <br>
Roll : 03 <br>

<hr>

<h3> Problem Name : <u> Possible Maximum Sum of Three Stacks:</u> (Queue Implementation) </h3>

<br>

Problem Statement : Given three stacks of the positive numbers, the task is to find the possible equal maximum sum of the stacks with the removal of top elements allowed.

<ul>
<li>Code 1 : Implementation using Arrays</li>
<li>Code 2 : Implementation using inbuilt Queue Interface in Java</li>
</ul>

<hr>

Logic :

<ul style="list-style-type:square;">
  <li>Find stack with maximum sum and then Remove top element of it.</li>
  <li>If sum of all 3 becomes equal exit, else calculate new sum and repeat above process.</li>
</ul>

<hr>

Algorithm :

<ol style="list-style-type:square;">
  <li> Take input for all 3 stacks in a queue, calculate and store sum of all 3 queue</li>
  <li> Check if sum of all 3 queue are equal or not</li>
  <li> If sum1==sum2==sum3, then Possible maximum sum is sum1. Exit</li>
  <li> If any 1 of the queue becomes empty, then Possible maximum sum is 0. Exit</li>
  <li> Otherwise, pop the front element of queue having maximum sum</li>
  <li> Update sum for that queue</li>
  <li> Repeat step 2, 3, 4, 5, 6</li> 
  <li> Exit</li>
</ol>

<hr>

<h2> TEST CASES </h2>

// 1st value of array will be front of the queue (Top of Stack) <br>
// then values will be added to the rear of the queue <br><br>

INPUT : 

Stack 1 : 8 5 3 <br>
Stack 2 : 6 9 4 2 2 <br>
Stack 3 : 3 2 1 2 <br>
<br>
OUTUT <br>

POSSIBLE EQUAL MAXIMUM SUM : 8<br>

<hr>
