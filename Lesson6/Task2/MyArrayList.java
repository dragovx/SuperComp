package Task2;

public class MyArrayList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyArrayList(){
        lastNode = new Node<E> (null,null);
        firstNode = new Node<E> (null,lastNode);
    }

    public int size(){
        return size;
    }

    public void add(E e){
		if (firstNode.getCurrentElement()==null){
			firstNode.setCurrentElement(e);
		} else {
			Node<E> prev = lastNode;
			prev.setCurrentElement(e);
			lastNode = new Node<E> (e, null);
			prev.setNextElement(lastNode);
			size++;
		}
    }

	public void add(E... e){
		for (E args : e){
			add(args);
		}
	}

	public void remove(int index){
		Node<E> target = firstNode;
		if (index == 1){
			firstNode=firstNode.getNextElement();
		} else {
			for (int i = 0; i<index-1; i++){
				target = target.getNextElement();
			}
			target.setNextElement(target.getNextElement().getNextElement());
		}
		size--;
	}

	public void remove(E e){
		Node<E> target = firstNode;
		Node<E> prevTarget = target;
		int i = 0;
		while (i<=size){
			if (target.getCurrentElement() == e){
				if (target.getCurrentElement() == firstNode.getCurrentElement()) {
					firstNode.setNextElement(firstNode.nextElement.nextElement);
					firstNode.setCurrentElement(firstNode.getNextElement().getCurrentElement());
				} else { 
					prevTarget.setNextElement(prevTarget.getNextElement().getNextElement()); 
				}
				size--;
			}
			prevTarget = target;
			target = target.getNextElement();
			i++;
		}
	}

	public E get(int index){
		Node<E> target = firstNode;
		for (int i = 0; i<index-1; i++){
			target = target.getNextElement();
		}
		return target.getCurrentElement();
	}

	public void clear(){
		lastNode = new Node<E> (null,null);
        firstNode = new Node<E> (null,lastNode);
		size = 0;
	}

	public void print(){
		Node<E> target = firstNode;
		int i = 0;
		while (i <= size) {
			i++;
			System.out.print(target.getCurrentElement()  + " ");
			target = target.getNextElement();
		}
		System.out.println();
	}

    private class Node<E> {

        private E currentElement;
        private Node<E> nextElement;

        private Node(E currentElement, Node<E> nextElement){
            this.currentElement = currentElement;
            this.nextElement = nextElement;
        }

        public E getCurrentElement(){ return this.currentElement; }

        public void setCurrentElement(E currentElement){ this.currentElement = currentElement; }

        public Node<E> getNextElement(){ return this.nextElement; }

        public void setNextElement(Node<E> nextElement){ this.nextElement = nextElement; }
    }
       
}

