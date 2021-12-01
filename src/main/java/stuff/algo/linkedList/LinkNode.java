package stuff.algo.linkedList;

public class LinkNode<E> {

    private E element;
    private LinkNode<E> nextElement;

    public E getElement() {
        return element;
    }

    public LinkNode<E> getNextElement() {
        return nextElement;
    }

    public LinkNode(E element) {
        this.element = element;
    }

    public void setNextElement(LinkNode<E> nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
        return "\n\n MySingleLinkedList{" +
                "element=" + element +
                ", nextElement=" + nextElement +
                '}';
    }
}