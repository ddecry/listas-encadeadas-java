package listacircular;

public class ListaCircular {
    private NodeC tail; // usamos tail para facilitar operações

    public ListaCircular() {
        tail = null;
    }

    public void insertAtBeginning(int value) {
        NodeC node = new NodeC(value);
        if (tail == null) {
            tail = node;
            tail.next = tail;
        } else {
            node.next = tail.next;
            tail.next = node;
        }
    }

    public void insertAtEnd(int value) {
        insertAtBeginning(value);
        tail = tail.next; // move tail para o novo nó
    }

    public boolean contains(int value) {
        if (tail == null) return false;
        NodeC cur = tail.next;
        do {
            if (cur.data == value) return true;
            cur = cur.next;
        } while (cur != tail.next);
        return false;
    }

    public boolean remove(int value) {
        if (tail == null) return false;
        NodeC cur = tail.next;
        NodeC prev = tail;
        do {
            if (cur.data == value) {
                if (cur == tail && cur.next == tail) { // único elemento
                    tail = null;
                } else {
                    prev.next = cur.next;
                    if (cur == tail) tail = prev;
                }
                return true;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != tail.next);
        return false;
    }

    public String listAll() {
        if (tail == null) return "empty";
        StringBuilder sb = new StringBuilder();
        NodeC cur = tail.next;
        do {
            sb.append(cur.data).append(" -> ");
            cur = cur.next;
        } while (cur != tail.next);
        sb.append("(back to head)"); 
        return sb.toString();
    }
}
