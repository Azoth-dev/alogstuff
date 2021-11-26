package stuff;

import java.util.HashSet;
import java.util.Set;

public class LinkedListTest {

    public static void main(String[] args) {
        MySingleLinkedList<String>  singleLinkedList=getDummyLinkedlist();

        System.out.println(singleLinkedList);
        singleLinkedList = removeDuplicate(singleLinkedList);
        System.out.println(singleLinkedList);

        //sortlinked with merge sort
        sortByMergeSort(singleLinkedList);
    }

    /**
     *  Merge sort
     *      break the each element into
     * @param singleLinkedList
     */
    private static void sortByMergeSort(MySingleLinkedList<String> singleLinkedList) {


    }

    private static MySingleLinkedList<String> removeDuplicate(MySingleLinkedList<String> singleLinkedList) {

        Set<String> strings=new HashSet<>();
        MySingleLinkedList<String> current= singleLinkedList;
        MySingleLinkedList<String> previous= null;
        while(current !=null){
            boolean isAdded = strings.add(current.getElement());
            if(!isAdded){
                previous.setNextElement(current.nextElement);
            }else{
                previous=current;

            }
            current=current.nextElement;
        }
    return  singleLinkedList;
    }

    private static MySingleLinkedList<String> getDummyLinkedlist() {
        MySingleLinkedList<String> node6= new MySingleLinkedList("1",null);
        MySingleLinkedList<String> node5= new MySingleLinkedList("4",node6);
        MySingleLinkedList<String> node4= new MySingleLinkedList("4",node5);
        MySingleLinkedList<String> node3= new MySingleLinkedList("9",node4);
        MySingleLinkedList<String> node2= new MySingleLinkedList("2",node3);
        MySingleLinkedList<String> hnode= new MySingleLinkedList("8",node2);

    return hnode;
    }

}


class MySingleLinkedList<E> {

    E element;
    MySingleLinkedList<E> nextElement;

    public E getElement() {
        return element;
    }

    public MySingleLinkedList<E> getNextElement() {
        return nextElement;
    }

    public MySingleLinkedList(E element, MySingleLinkedList<E> nextElement) {
        this.element = element;
        this.nextElement = nextElement;
    }

    public void setNextElement(MySingleLinkedList<E> nextElement) {
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
