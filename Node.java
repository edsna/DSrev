/** 
 * Node of a singly linked list.
 */
public class Node<E> {
  
  private E element;
  private Node<E> next;

  /** Creates a node with the given element and next node. */
  public Node(E e, Node<E> n) {
    element = e;
    next = n;
  }

  /** Returns the element of this node. */
  public E getElement() { return element; }

  /** Returns the next node of this node. */
  public Node<E> getNext() { return next; }

  /** Sets the element of this node. */
  public void setElement(E e) { element = e; }

  /** Sets the next node of this node. */
  public void setNext(Node<E> n) { next = n; }

}
