public class Queue {
	
	  
	  int SIZE = 10; // initial capacity
	  int items[] = new int[SIZE];
	  int front, rear;

	  Queue() { // Constructor
	    front = -1;
	    rear = -1;
	  }

	  void enQueue(int element) { //for enqueueing an integer element
	      if (front == -1) {
	        front = 0;
	      }
	      rear++;
	      items[rear] = element;
	      
	  }

	  void display() { //displaying the elements
	    int i;
	    System.out.print("Input: ");
	    for (i = front; i <= rear; i++)
	      System.out.print(items[i] + " ");
	      System.out.println("");
	   }
	  
	  
	  void fiveSmallestInteger() { //a method for finding the five smallest integer
		  int i;
		  int firstmin = Integer.MAX_VALUE;
          int secondmin = Integer.MAX_VALUE;
          int thirdmin = Integer.MAX_VALUE;
          int fourthmin = Integer.MAX_VALUE;
          int fifthmin = Integer.MAX_VALUE;
          
		  for (i = front; i <= rear; i++) { // accessing every elements
			 
				  if (items[i] < firstmin) 
	                {
					  	fifthmin = fourthmin;
					  	fourthmin = thirdmin;
	                    thirdmin = secondmin;
	                    secondmin = firstmin;
	                    firstmin = items[i];
	                }
	         
	                else if (items[i] < secondmin)
	                {
	                	fifthmin = fourthmin;
					  	fourthmin = thirdmin;
	                    thirdmin = secondmin;
	                    secondmin = items[i];
	                }
	         
	                else if (items[i] < thirdmin)
	                {
	                	fifthmin = fourthmin;
				  		fourthmin = thirdmin;
	                    thirdmin = items[i];
	                }
	                
	                else if (items[i] < fourthmin)
	                {
	                	fifthmin = fourthmin;
	                	fourthmin = items[i];
	                	
	                }
	                else 
	                	fifthmin = items[i];
	                }
		  System.out.println("Output:");
		  System.out.println(firstmin);
		  System.out.println(secondmin);
		  System.out.println(thirdmin);
		  System.out.println(fourthmin);
		  System.out.println(fifthmin);
	  }

	  public static void main(String[] args) {

	   Queue q = new Queue(); // new object

	   q.enQueue(90);q.enQueue(50);q.enQueue(10);q.enQueue(30);
	   q.enQueue(3); q.enQueue(5);q.enQueue(2);q.enQueue(8);
	   q.enQueue(19);q.enQueue(10);
	   
	   q.display(); //calling display
	   q.fiveSmallestInteger();  //calling smallest integer
	  }
}
