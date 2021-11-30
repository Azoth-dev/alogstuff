import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinaryTreeBFS {
    public static void main(String[] args) {
        Node<Integer> integerNode= new Node<>(1);
        log.info("Testing log"+integerNode);

    }

}


@Slf4j
@Getter
@EqualsAndHashCode
class Node<E>{

    private E element;
    private Node<E> left;
    private Node<E> right;

    public Node(E element) {
        this.element = element;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {

        return "Node{" +
                "element value=" + element +
                ", left Element=" + (left!=null && left.getElement()!=null ? left.getElement().toString():"") +
                ", right Element=" + (right!=null  && right.getElement()!=null ? right.getElement().toString():"")+
                "}";
    }
}