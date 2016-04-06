import java.util.LinkedList;
class MyStack {
    // Push element x onto stack.
    LinkedList<Integer> myStack = new LinkedList<Integer>();
	LinkedList<Integer> tempQue = new LinkedList<Integer>();
    
    public void push(int x) {
        if(empty()){
    		
    		myStack.offer(x);
    		System.out.println("Console out:::Case 1 push()!! x = " + x);
    	}
    	else{
    		
    		if(tempQue.isEmpty() && ! myStack.isEmpty()){
    			
    			//tempQue.offer(x); // add the new element to the temp queue
    			
    			while(myStack.size() > 0){
    			
    				System.out.println("Console out:::Case 2 push()!! myStack.peek() = " + myStack.peek());
    				tempQue.offer(myStack.poll()); // retrieve all elements of myStack and insert them behind the new element we inserted
    				System.out.println(" case 2 tempQue.peek() = " + tempQue.peek());
    			}
    			myStack.offer(x); // add the integer to the tail of myStack after removing all the elements of myStack 
    			
    			System.out.println("Console out:::Case 2 push()!! x = " + x);
    			
    			//now poll all elements from temp que and offer them to myStack saving them in proper stack order 
    			while(tempQue.size() > 0){
    				
    				myStack.offer(tempQue.poll());
    				
    			}
    			
    		  }
    	    }
        
    }

    // Removes the element on top of the stack.
    public void pop() {
     
    if(empty()){
    		
    		System.out.println("Stacks is empty Do nothing");
    	}
    	else{		 			
    			myStack.poll() ; //remove the top element from my stack
        }
    }

    // Get the top element.
    public int top() {
        return	myStack.peek() ;
    }

    // Return whether the stack is empty.
    public boolean empty() {
       return myStack.isEmpty() && tempQue.isEmpty() ; 
    }
}