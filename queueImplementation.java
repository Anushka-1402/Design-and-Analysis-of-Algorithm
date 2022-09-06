// Possible Maximum Sum of Three Stacks: Queue Implementation

// Using inbuilt Queue Interface in Java

import java.util.LinkedList;
import java.util.Queue;

class PossibleEqualMaxSum {
	
	public static int maxSum(Queue queue1, Queue queue2, Queue queue3)
	{
	int sum1 = 0, sum2 = 0, sum3 = 0;
	
	// finding the initial sum of queue1
	for (Object i:queue1)
		sum1 += (Integer)i;
	
	// finding the initial sum of queue2
	for (Object i:queue2)
		sum2 += (Integer)i;
	
	// finding the initial sum of queue3
	for (Object i:queue3)
		sum3 += (Integer)i;
	
        // logic
	while (true)
	{
		// if any queue is empty
		if (queue1.isEmpty() || queue1.isEmpty() || queue1.isEmpty())
			return 0;
	
		// if sum of all three queue are equal
		if (sum1 == sum2 && sum2 == sum3)
			return sum1;
		
		// finding the queue with maximum sum and removing its front element
		if (sum1 >= sum2 && sum1 >= sum3)
            		sum1 -= (Integer)queue1.poll();
		else if (sum2 >= sum1 && sum2 >= sum3)
			sum2 -= (Integer)queue2.poll();
		else if (sum3 >= sum2 && sum3 >= sum1)
			sum3 -= (Integer)queue3.poll();
	}
	}
	
	// Driver code 
	public static void main(String[] args)
	{
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> queue3 = new LinkedList<>();

        //initializing queue 1
        queue1.add(8);
        queue1.add(5);
        queue1.add(3);

        //initializing queue 2
        queue2.add(6);
        queue2.add(9);
        queue2.add(4);
	queue2.add(2);
	queue2.add(2);

        //initializing queue 3
        queue3.add(3);
        queue3.add(2);
        queue3.add(1);
        queue3.add(2);

	System.out.println("Possible Equal Maximum Sum: "+maxSum(queue1, queue2, queue3));
		
	}
}

