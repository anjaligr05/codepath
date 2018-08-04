public interface LinkedListNode<E> {

    /* getter/setter for this node's value */
    E getValue();
    void setValue(E value);

    /* getter/setter for the subsequent node, or null if this is the last node */
    LinkedListNode<E> getNext();
    void setNext(LinkedListNode<E> next);

    /**
     * Initialize this node and all of its subsequent nodes from
     * an array of values, starting with the head value at index 0
     *
     * @param listValues - the ordered values for the whole list
     */
    void setValuesFromArray(E[] listValues);

}
public class Node() implements LinkedListNode<E>{
	E val;
	Node next;
	public void setValue(E value){
		this.val = value;
	}
	public E getValue(){
		return this.val;
	}

	public Node<E> getNext(){
		return this.next;
	}
	public void setNext(Node<E> next){
		this.next = next;
	}
	public void setValuesFromArray(E[] listValues){
		setValue(listValues[0])
		
		for(int i = 1; i<listValues.size(); i++){
			
			node = new Node();
			node.val = lisValues[i];
			if(i==1){
				this.next = node;
			}
			else{
				prev.next = node;
			}
			prev = node;
		}		
	}
}

