class Node {
    int value;
    public Node(int v) {
        value = v;
    }
}

class NodeComparator implements Comparator<Node> {

    @Override
    public int compare(Node n1, Node n2) {
        if(n1.value < n2.value) {
            return -1;
        } else if(n1.value > n2.value) {
            return 1;
        } else {
            return 0;
        }
    }
}