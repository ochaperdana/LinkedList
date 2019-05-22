package is.its.ac.id;

public class LinkedListStack implements Stack{
    LinkedList stack;
    Node top = null;

    public LinkedListStack(){
        stack = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        if (stack.header == null){
            return true;
        }
        return false;
    }

    @Override
    public Object push(Object item) {
        stack.addAtEnd(new Node(item, null));
        return item;
    }

    @Override
    public Object peek() {
        return stack.header.value;
    }

    @Override
    public Object pop() {
        Node a = stack.header;
        Node n = a.next;
        while (n != null){
            a = n;
            n = a.next;
        }
        stack.deleteAtEnd();
        return a.value;
    }

    @Override
    public int search(Object o) {
        return 0;
    }
}
