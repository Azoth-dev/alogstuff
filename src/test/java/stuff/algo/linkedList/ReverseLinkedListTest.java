package stuff.algo.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    public void reverseLinkedList(){
        LinkNode<Integer> n1= new LinkNode<>(1);
        LinkNode<Integer> n2= new LinkNode<>(2);
        n1.setNextElement(n2);
        LinkNode<Integer> n3= new LinkNode<>(3);
        n2.setNextElement(n3);
        LinkNode<Integer> n4= new LinkNode<>(4);
        n3.setNextElement(n4);
        LinkNode<Integer> n5= new LinkNode<>(5);
        n4.setNextElement(n5);


        ReverseLinkedList.reverseList(n1);
    }

}