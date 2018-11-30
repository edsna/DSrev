//Rocking Lists & Nodes
//@author: Edson Zandamela
public class SinglyLinkedList{ 
	//private ListNode head;		//setting ListNode to be the head of the list

	//Method to print the Linked List
	public void display(ListNode head){
		
		if(head == null){return;}
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + " -->");
			current = current.next;
		}
		System.out.println(current);
	}
	
	//Inner ListNode class that contains the driveways to control or manipulate the LinkedList
	private static class ListNode{
		private int data;	//data will hold integers
		private ListNode next;	//Referennce of it's own to hold the value on the next node

		//constructor to initialize a new node with data as a parameter & next node to null
		public ListNode(int data){
			this.data = data;
			this.next = null;   //BY default is set to null
		}
	}//End of List Node
	public static void main(String[]args){
		/*Creating a SinglyLinkedList with 4 Nodes!
		*18-->26-->53-->67
		*80 will be the head of the linked List
		*/
		//creating the nodes
		ListNode head = new ListNode(18);
		ListNode second = new ListNode(26);
		ListNode third = new ListNode(53);
		ListNode fourth = new ListNode(67);

		//connecting the nodes as mentioned above
		head.next = second;	//18-->26
		second.next = third;	//26-->53
		third.next = fourth;	//56-->67
		fourth.next = null;

		//Printing the data
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.display(head);
	}
}

