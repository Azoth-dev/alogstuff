package stuff.algo.linkedList;

public class ReverseLinkedList {


    public static LinkNode<Integer> reverseList(LinkNode<Integer> input){
        LinkNode<Integer> curr = input;
        LinkNode<Integer> prev = null;
        LinkNode<Integer> fwd = curr.getNextElement();
        int size=0;
        while (fwd!=null){
            curr.setNextElement(prev);
            prev=curr;
            curr=fwd;
            fwd=curr.getNextElement();
        }
        curr.setNextElement(prev);
        prev=curr;

         print(prev);
    return prev;
    }

    private static void print(LinkNode<Integer> current) {
        while (current!=null){
            System.out.println(current);
            current=current.getNextElement();
        }

    }

}
