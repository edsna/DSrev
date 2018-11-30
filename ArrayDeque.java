/** 
 * This class implements the ADT deque defined in Deque.java.
 * @ Edson F de Aguiar Zandamela
 * @version 1.6, 03/05/18
 */

public class ArrayDeque<E> implements Deque<E>{

	//Instance variables
	private E[] data;	//generic array used for storage
	private int front = 0;	//index of the front element
	private int l;		//index of the last element
	private int sz = 0;	//current number of elements
	public static final int CAPACITY = 1000; 

	//Constructors
	public ArrayDeque(){
		this(CAPACITY);	//constructs ArrayDeque with default capacity
	}

	public ArrayDeque(int capacity){	//constructs deque with given capacity
		data = (E[]) new Object[capacity];
		l = data.length-1;
	}
/**
  * Returns the number of elements in the deque.
  * @return number of elements in the deque
  */
  public int size(){
		return sz;
	}
/**
   * Tests whether the deque is empty.
   * @return true if the deque is empty, false otherwise
   */
  public boolean isEmpty(){
	return (sz == 0);
  }

  /**
   * Returns (but does not remove) the first element of the deque.
   * @return first element of the deque (or null if empty)
   */
  public E first(){
	if(isEmpty()) return null;
	return data[front];
  }

    /**
   * Returns (but does not remove) the last element of the deque.
   * @return last element of the deque (or null if empty)
   */
  public E last(){
	if(isEmpty()) return null;
	return data[l];
  }
  /**
   * Inserts an element at the front of the deque.
   * @param e the new element
   */
  public void addFirst(E e)
	throws IllegalStateException{
		if(sz == data.length) throw new IllegalStateException("Deque is full");
		if(sz == 0){
			data[0] = e;
		}
		else{
			front = (front-1 + data.length)%data.length;
			data[front] = e;
		} 
		sz++;
	}
/**
   * Inserts an element at the back of the deque.
   * @param e the new element
   */
  public void addLast(E e)
		throws IllegalStateException{
		if(sz == data.length) throw new IllegalStateException("Deque is full");
		if(sz == 0){
			data[0]=e;
			l=0;
		}
		else{
		    l=(l+1)%data.length;
			data[l]=e;
		}
		sz++;
	}
  /**
   * Removes and returns the first element of the deque.
   * @return element removed (or null if empty)
   */
 public E removeFirst(){
	if(isEmpty())return null;
	E answer = data[front];
	data[front] = null;
	front = (front +1)%data.length;	//this was commented
	sz--;
	return answer;
  }
/**
   * Removes and returns the last element of the deque.
   * @return element removed (or null if empty)
   */
  public E removeLast(){
	if(isEmpty())return null;
	E answ = data[l];
	data[l] = null;
	l = (l)%data.length;
	l--; 
	sz--;
	return answ;
  } 
}//End of ArrayDeque
