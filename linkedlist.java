class LinkedList {
    Node head;
    public int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curnode = head;
            while (curnode.next != null) {
                curnode = curnode.next;
            }
            curnode.next = newNode;
        }
        size++;
    }

    public void delFirst() {
        if (head == null) {
            System.out.println("Your linked list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void delLast() {
        if (head == null) {
            System.out.println("Your linked list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
        size--;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteMiddle(int k) {
        if (k > size || k <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null) return;
        if (k == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < k - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public void addMiddle(int k, String data) {
        if (k > size + 1 || k <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (k == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < k - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.display();
        
        System.out.println("Size of the linked list is " + list.size);
        list.delFirst();
        list.display();

        list.addLast("sai");
        list.display();
        

        list.delLast();
       
        list.display();

        System.out.println("Size of the linked list is " + list.size);
        list.deleteMiddle(2);
        list.display();

        list.addMiddle(2, "inserted");
        System.out.println("Inserted at position 2");
        list.display();
    }
}
