package listacircular;

public class NodeC {
    int data;
    NodeC next;

    public NodeC(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
