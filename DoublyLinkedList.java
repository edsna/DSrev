public class DoublyLinkedList{
	//Pointers
	private Node head;
	private Node tail;
	private int length;	//#of nodes in the linked list

	public class Node{
		private int data;
		private Node next;
		private Node previous;
	

		//Constructirs
		public Node(int data){
			this.data = data;
		}
	
	}
	//Constructor for double linked list class
	public DoublyLinkedList(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	//Methods
	public boolean isEmpty(){
		return length == 0; //returns tru if the length of the doubly is 0 OR head ==0;
	} 

	public int length(){
		return length;
	}

	
	public void insertLast(int value){
		Node FirstNode = new Node(value);
		if(isEmpty()){
			head = FirstNode;
		}
		else{
			tail.next = FirstNode;
		}
		FirstNode.previous =tail;
		tail = FirstNode;
		length++;
	}

	//display FOrward
	public void displayForward(){
		if(head == null){
			return;
		}

		//creating a temp node & assigning it to the value of head
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	//Display Backward
	public void displayBackward(){
		if(tail == null){
			return;
		}

		Node temp = tail;
		while(temp != null){
			System.out.print(temp.data + "-->");
			temp = temp.previous;
		}
		System.out.println("null");
		}

	//Inserting noes at the beggining of douby
	public void insertFirst(int value){
		Node SecondNode = new Node(value);
		if(isEmpty()){
			tail = SecondNode;
		}
		else{
			head.previous = SecondNode;
		}
		SecondNode.next = head;  //setting
		head = SecondNode;
		length++;
	}

	//Inserting noes at the end of douby
	public void inserirLast(int value){
		Node LastNode = new Node(value);
		if(isEmpty()){
			head = LastNode;
		}
		else{
			LastNode.previous = tail;
			
		}
		
		head = LastNode;
		length++;
	}
	
	

	public static void main(String[]args){
		DoublyLinkedList L1 = new DoublyLinkedList();
		L1.insertLast(1);
		L1.insertLast(2);
		L1.insertLast(6);
		L1.insertLast(4);
		L1.insertLast(5);
		L1.insertFirst(777);
		L1.inserirLast(999);
		L1.displayForward();
		L1.displayBackward();
		
	}
}
