package listasimples;

public class ListaSimples {
    private Node head;

    public ListaSimples() {
        head = null;
    }

    // Inserir no início
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Inserir no fim
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = newNode;
    }

    // Inserir em posição (0-based). Se pos >= tamanho -> inserir no fim
    public void insertAtPosition(int value, int pos) {
        if (pos <= 0 || head == null) {
            insertAtBeginning(value);
            return;
        }
        Node cur = head;
        int idx = 0;
        while (cur.next != null && idx < pos - 1) {
            cur = cur.next;
            idx++;
        }
        Node newNode = new Node(value);
        newNode.next = cur.next;
        cur.next = newNode;
    }

    // Busca
    public boolean contains(int value) {
        Node cur = head;
        while (cur != null) {
            if (cur.data == value) return true;
            cur = cur.next;
        }
        return false;
    }

    // Remoção (primeira ocorrência)
    public boolean remove(int value) {
        if (head == null) return false;
        if (head.data == value) {
            head = head.next;
            return true;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data == value) {
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // Listagem
    public String listAll() {
        StringBuilder sb = new StringBuilder();
        Node cur = head;
        while (cur != null) {
            sb.append(cur.data).append(" -> ");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
