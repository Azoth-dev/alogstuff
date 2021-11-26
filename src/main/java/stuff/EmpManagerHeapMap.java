package stuff;

import lombok.Getter;

import java.util.*;

public class EmpManagerHeapMap {

    /**
     * 6
     * A B
     * B C
     * D E
     * G F
     *
     */

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int graphHight = scanner.nextInt();

        HashMap<String, GraphNode<String>> stringGraphNodeMap= new HashMap<>();
        GraphNode<String> root=null;

        while (scanner.hasNextLine() && graphHight>0){
            graphHight--;
            String empName = scanner.next();
            String managerName=scanner.next();
            GraphNode<String> empNode=null;
            GraphNode<String> managerNode=null;

            if(!stringGraphNodeMap.containsKey(empName)) {
                empNode = stringGraphNodeMap.put(empName, new GraphNode<>(empName));
            }

            empNode = stringGraphNodeMap.computeIfAbsent(empName, k -> new GraphNode<String>(k));
            managerNode = stringGraphNodeMap.computeIfAbsent(managerName, k -> new GraphNode<>(k));
            if(!managerNode.equals(empNode)){
                empNode.setParent(managerNode);
                managerNode.addChild(empNode);
            }else
                root=managerNode;

        }
        scanner.close();
        System.out.println(GraphNode.getHeight(root));


    }

    private static void calcHeight(GraphNode<String> root) {
        traverseChilds(root);


    }

    private static void traverseChilds(GraphNode<String> root) {
        GraphNode<String> parent = root;
        if(parent.getChildren()==null){

        }
        Queue<Map<String,Integer>> queue= new LinkedList<>();
        Map<String, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put(parent.getElement(),GraphNode.getHeight(parent));
        queue.offer(integerHashMap);
    }


}

@Getter
class GraphNode<E> {
    private GraphNode<E> parent;
    private Set<GraphNode<E>> children;
    private E element;

    public GraphNode(E element) {
        this.element = element;
    }

    public void addChilds(Set<GraphNode<E>> childs){
        if(children==null)
            children = new HashSet<>();
        children.addAll(childs);
    }

    public void addChild(GraphNode<E> child){
        if(children==null)
            children = new HashSet<>();
        children.add(child);
    }

    public void setParent(GraphNode<E> parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode<?> graphNode = (GraphNode<?>) o;
        return Objects.equals(element, graphNode.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }


    public static int getHeight(GraphNode node){
        if(node.getChildren()==null)
            return 0;
        int length=node.getChildren().size();

        Set children = node.getChildren();
        for (Object child : node.getChildren()) {
            length=length+getHeight((GraphNode) child);
        }

        return length;
    }
}
