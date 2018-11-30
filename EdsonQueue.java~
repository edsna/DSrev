package com.hubberspot.algos.stack;

public class Queue{

	private ListNode front;		//first emlement in the Queue
	private ListNode rear;		//last emlement in the Queue
	private int length;

	public Queue(){
			this.front = null;
			this.rear = null;
			this.length = 0;
		}
		

	private class ListNode{
		private int data;
		private ListNode next;

		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}

	//methods
	public int length(){
		return length;
	}

	public boolean isEmpty(){
		return length == 0;
	}

	//Inserting elements on a queue
	public void enqueue(int data){
 		ListNode temp = new ListNode(data);
		if(isEmpty()){
			front = temp;
		}else{
			rear.next = temp;
		}

		rear = temp;
		length++;		
	}

	public void print(){
		if(isEmpty()){
			return;
		}

		ListNode current = front;
		while(current != null){
			System.out.print(current.data + " --> ");
			current = current.next;
		}
			System.out.print("null");	
	}

	//Removes element from the queue
	public int dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is already empty");
		}
		int result = front.data;	//result holds the value I'm removing
		front = front.next;		//assigning front to its noext value
		if(front == null){		//if front is now empty
			rear = null;		//set rear to empty as well
		}
		length--;			//decrement length by 1
		return result;			//return the deleted value
	}

	public static void main(String[] args){
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.print();
		
	}

}
