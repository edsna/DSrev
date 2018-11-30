/**
 * This class implements a set of strings using a linked list to support five 
 * operations, namely, testing emptiness, membership, insertion, removal, and 
 * printing.
 *@Author1:Fumihiro Tamada
 *@Author2:Edson Zandamela
 */

public class StringSet {
    
  private Node<String> head;
  private int size;                       // The actual size

  /**
   * Creates an empty list and initializes the set's size to 0 (i.e., it 
   * creates an empty set).
   */
  public StringSet() {
    head = null;
    size = 0;
  } 

  /**
   * Returns true if the set contains no element.
   *@return returns boolean expression with contains element or not
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns, if it exists, a node containing a string s.
   *@param s takes the String s
   */
  private Node<String> find(String s) {
  
    if(isEmpty()== false){
	Node<String>v = head;
	while(v!= null){
		if(v.getElement().equals(s)){
			return v;
			}
		else{
			v=v.getNext();
			}			
		}
	}

    return null;
  }

  /**
   * Returns true if the set contains a string s.
   *@param s takes the String s
   */
  public boolean contains(String s) {

    if(find(s) != null){
		return true;
		}
    else{
		return false;
	}
  }

  /**
   * Inserts a string s into the list and increments size by 1.
   *@param s takes the String s to be inserted
   */
  public void insert(String s) {
    if (!contains(s)) {
         Node ins = new Node<>(s,null);
         ins.setNext(head);
         head = ins;
	 size++;
         System.out.println("Inserting " + s + "...");
        }
    else{
      System.out.println("Inserting " + s + "..., but " + s + 
                         " already exists.");}
  }

  /**
   * Removes a string s from the list and decrements size by 1.
   *@param s takes the String s to be removed
   */
  public void remove(String s) {
    Node<String> v = find(s);
    if (v == null){
      System.out.println("Removing " + s + "..., but " + s +" does not exist.");
      }
      v = head;
      
     if(head.getElement().equals(s)){
       head = head.getNext();
       size--;
       }
      while(v.getNext() != null){
        if(v.getNext().getElement().equals(s)){
          v.setNext(v.getNext().getNext());
          size --;
          }
        else{v = v.getNext();}
        
                 

     

    }
     System.out.println("Removing " + s + "...");  
}
  /**
   * Prints all the strings in the list.
   */
  public void print() {
    Node<String> n = head;
    System.out.print("{ ");
    while (n != null) {
      System.out.print(n.getElement());
      if (n.getNext() != null) 
	System.out.print(", ");
      n = n.getNext();
    }
    System.out.println(" }");
  }
}
