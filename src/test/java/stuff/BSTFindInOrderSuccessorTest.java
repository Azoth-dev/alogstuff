package stuff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

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


    /**
     *
     *          50
     *        /    \
     *       /      \
     *      30       70
     *    /   \     /  \
     *   20   40   60  80
     *  /  \
     * 10  25
     *
     *
     */

    @Disabled
    @Test
    public void test1(){

        assertEquals(BSTFindInOrderSuccessor.searchInOrderSuccessor(parent,parent),new Node(25));

        assertEquals(BSTFindInOrderSuccessor.searchInOrderSuccessor(parent,parent.getLeft()),new Node(11));

//        assertEquals(BSTFindInOrderSuccessor.searchInOrderSuccessor(parent,parent.getLeft().getRight().getRight()),new Node(20));

    }


    public static void pathDFS(Node node){
        if(node==null){
            return;
        }
        pathDFS(node.getLeft());
        pathDFS(node.getRight());
        System.out.println(node.getVal());
    }


    public static String pathBFS(Node node, int val){
        Queue<Node> queue= new LinkedList<>();
        StringBuilder stringBuilder= new StringBuilder("");
        queue.add(node);

        while (!queue.isEmpty()){
            Node poll = queue.poll();
            stringBuilder.append(poll.getVal()+",");

            if(poll.getVal()==val){
                break;
            }

            if(poll.getRight()!=null )
                queue.offer(poll.getRight());
            if(poll.getLeft()!=null)
                queue.offer(poll.getLeft());
        }
        return stringBuilder.toString();
    }


    @Test
    public void test2(){

        String startPath = pathBFS(parent, 11);
        String endPath = pathBFS(parent, 25);
        assertEquals(startPath,endPath);
    }
}