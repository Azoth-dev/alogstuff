package stuff;

import lombok.Data;

import java.util.*;

public class BSTFindInOrderSuccessor {

    public static void main(String[] args) {
        Node parent20=getNodes();

        printBFS(parent20);
        printDFT(parent20);
//        searchInOrderSuccessor(parent, parent20);

    }

    public static void printBFS(Node parent20) {
        Queue<Node> queue= new LinkedList();
        queue.add(parent20);
        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            if (poll != null) {
                queue.offer(poll.getLeft());
                queue.offer(poll.getRight());
                System.out.println(poll.getVal());
            }
        }

    }

    /**
     * So if I store everything in the list Queue
     *   20 9 25 5 12 11 14
     *   20 25 9 12 14 11 5
     *
     *
     * @param parent
     * @param searchElement
     * @return
     */
    public static Node searchInOrderSuccessor(Node parent, Node searchElement) {

        int val = searchElement.getVal();
        Node successor=searchElement;

        if(successor.getRight()!=null && successor.getRight().getVal() > val){
            if(successor.getRight().getLeft()!=null && successor.getRight().getLeft().getVal()>val)
                successor=successor.getRight().getLeft()   ;
        }else if(successor.getParent()!=null && successor.getParent().getVal()>val){
            successor=successor.getParent();
        }else if(successor.getParent()!=null){
            successor=successor.getParent();
        }

return null;
    }

    private static void printDFT(Node parent20) {
        if(parent20!=null){
            printDFT(parent20.getLeft());
            printDFT(parent20.getRight());
            System.out.println("Node value"+ parent20.getVal());
        }
    }

    private static Node getNodes() {

        Node parent20 = new Node(20);
        Node node9 = new Node(9);
        Node node5 = new Node(5);
        Node node11 = new Node(11);
        Node node12= new Node(12);
        Node node14= new Node(14);
        Node node25= new Node(25);

        parent20.setLeft(node9);
        parent20.setRight(node25);

        node9.setRight(node12);
        node9.setParent(parent20);
        node9.setLeft(node5);

        node25.setParent(parent20);

        node12.setParent(node9);
        node12.setLeft(node11);
        node12.setRight(node14);

        node11.setParent(node12);
        node14.setParent(node12);
        return parent20;
    }


}


@Data
class Node {

    private final int val;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    private Node left;
    private Node right;
    private Node parent;

    public Node(int val) {
        this.val = val;
    }


    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
