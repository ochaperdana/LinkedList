package is.its.ac.id;

public class LinkedListQueue implements Queue {
    LinkedList queue;

    public LinkedListQueue(){
        queue = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        if (queue.header==null){
            return true;
        }
        return false;
    }

    @Override
    public Object enqueue(Object item) {
        queue.addAtEnd(new Node(item,null));
        return item;
    }

    @Override
    public Object peek() {
        return queue.header.value;
    }

    @Override
    public Object dequeue() {
        Object o = queue.header.value;
        queue.deleteAtFront();
        return o;
    }

    @Override
    public int search(Object o) {
        int i = -1;
        for (Node c = queue.header;c!=null;c=c.next){
            if (c.value.equals(o)){
                return i+1;
            }
        }
        return i;
    }
}
