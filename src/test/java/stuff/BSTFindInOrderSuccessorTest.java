package stuff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTFindInOrderSuccessorTest {

    Node parent=null;

    @BeforeEach
    public void setup(){
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
            parent=parent20;
        }


    @Test
    public void test1(){

        assertEquals(BSTFindInOrderSuccessor.searchInOrderSuccessor(parent,parent),new Node(25));

        assertEquals(BSTFindInOrderSuccessor.searchInOrderSuccessor(parent,parent.getLeft()),new Node(11));

//        assertEquals(BSTFindInOrderSuccessor.searchInOrderSuccessor(parent,parent.getLeft().getRight().getRight()),new Node(20));

    }
}