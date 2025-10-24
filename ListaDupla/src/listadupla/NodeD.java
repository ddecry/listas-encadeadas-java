package listadupla;

public class NodeD {
    int data;
    NodeD prev;
    NodeD next;

    public NodeD(int data) {
        this.data = data;
        this.prev = this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
