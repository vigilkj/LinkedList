/**
 * LinkedList
 *
 * 		Sorts through the nodes with a variety of methods.
 *
 * 		KYLE VIGIL
 */
public class LinkedList {

	private Node head;

	public static void main(String[] args) {
			
	}

	public LinkedList(){
		head = new Node();
	}


	public void push(int value){
		Node newOne = new Node(value);
		if(head.getNext != null){
			newOne.setNext(head.getNext);
		}
		head.setNext(newOne);
	}

	public int length(){
		Node current = head;
		int length = 0;
		while(current.getNext() != null){
			length++;
			current = current.getNext();
		}
		return length;
	}

	public void buildOneTwoThree(){
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		head.setNext(one);
		one.setNext(two);
		two.setNext(three);
	}

	public void print(){
		Node current = head;
		while(current.getNext() != null){
			System.out.print(current.getValue());
			current = current.getNext();
		}
	}

	public int count(int count){
		Node current = head;
		int counter = 0;
		while(current.getNext() != null){
			if(current.getValue() == count){
				counter++;
			}
			current = current.getNext();
		}
		return counter;
	}

	public int getNth(int index){
		Node current = head;
		int counter = 0;
		int value = 0;
		while(current.getNext() != null && counter != index){
			value = current.getValue();
			current = current.getNext();
			counter++;s
		}
		return value;
	}

	public void empty(){
		head.setNext(null);
	}

	public int pop(){

		if(head.getNext() != null){

		}
	}


}