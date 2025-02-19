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
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
            return;
        }
        Node curnode = head;
        while (curnode.next != null) {
            curnode = curnode.next;
        }
        curnode.next = newNode;
        newNode.next = null;
    }

    public void delFirst(){
        if(head==null){
            System.out.println("your linked_list is empty");
            return;}
            size--;
        head = head.next;
    }

    public void delLast(){
        if(head==null){
            System.out.println("your linked_list is empty");
            return;}
            size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;

    }



    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
       ;
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.display();

        System.out.println("added -a");
        System.out.println("size of the linked list is "+list.size);
        list.delFirst();
        

        list.display();
        System.out.println("deleted at first -a");

        list.addLast("sai");

        list.display();
        System.out.println("adedd at last sai");

        list.delLast();
        list.display();
        System.out.println("deleted last sai");

        System.out.println("size of the linked list is "+list.size);
    }
}
