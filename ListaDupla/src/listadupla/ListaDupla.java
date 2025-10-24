package listadupla;

public class ListaDupla {
    private NodeD head;
    private NodeD tail;

    public ListaDupla() {
        head = tail = null;
    }

    public void insertAtBeginning(int value) {
        NodeD node = new NodeD(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void insertAtEnd(int value) {
        NodeD node = new NodeD(value);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public boolean contains(int value) {
        NodeD cur = head;
        while (cur != null) {
            if (cur.data == value) return true;
            cur = cur.next;
        }
        return false;
    }

    public boolean remove(int value) {
        NodeD cur = head;
        while (cur != null) {
            if (cur.data == value) {
                if (cur.prev != null) cur.prev.next = cur.next; else head = cur.next;
                if (cur.next != null) cur.next.prev = cur.prev; else tail = cur.prev;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public String listForward() {
        StringBuilder sb = new StringBuilder();
        NodeD cur = head;
        while (cur != null) {
            sb.append(cur.data).append(" <-> ");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public String listBackward() {
        StringBuilder sb = new StringBuilder();
        NodeD cur = tail;
        while (cur != null) {
            sb.append(cur.data).append(" <-> ");
            cur = cur.prev;
        }
        sb.append("null");
        return sb.toString();
    }
}
